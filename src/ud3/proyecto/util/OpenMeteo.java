package ud3.proyecto.util;

/**
 * Acceso sencillo a los servicios gratuitos de <a href="https://open-meteo.com">Open-Meteo</a>
 * (sin registro ni clave; uso no comercial).
 *
 * <p><b>Código proporcionado por el profesor.</b> Cada método hace una consulta a internet:
 * guarda el resultado en una variable y no lo llames dentro de un bucle grande.</p>
 *
 * <p>Las fechas y horas se devuelven como texto en formato ISO, que se convierte con
 * {@code LocalDate.parse("2026-11-19")} o {@code LocalDateTime.parse("2026-11-19T14:00")}.
 * Los datos que faltan se devuelven como {@code Double.NaN} (compruébalo con {@code Double.isNaN(x)}).</p>
 *
 * <h2>Variables más útiles</h2>
 * <ul>
 *   <li>Horarias: {@code temperature_2m} (°C), {@code relative_humidity_2m} (%), {@code precipitation} (mm),
 *       {@code precipitation_probability} (%), {@code wind_speed_10m} (km/h), {@code cloud_cover} (%).</li>
 *   <li>Diarias: {@code temperature_2m_max}, {@code temperature_2m_min}, {@code precipitation_sum} (mm),
 *       {@code wind_speed_10m_max} (km/h), {@code sunshine_duration} (segundos),
 *       {@code sunrise} y {@code sunset} (texto, usar {@link #diariaTextos}).</li>
 * </ul>
 * Lista completa: https://open-meteo.com/en/docs
 */
public class OpenMeteo {

    private static final String PREVISION = "https://api.open-meteo.com/v1/forecast";
    private static final String HISTORICO = "https://archive-api.open-meteo.com/v1/archive";

    private OpenMeteo() {
    }

    // ------------------------------------------------------------------ lugares

    /**
     * Busca un lugar por su nombre y devuelve {latitud, longitud}, o {@code null} si no lo encuentra.
     * Ejemplo: {@code coordenadas("Santiago de Compostela")}.
     */
    public static double[] coordenadas(String lugar) {
        String json = buscarLugar(lugar);
        double lat = Web.jsonNumero(json, "results", "0", "latitude");
        double lon = Web.jsonNumero(json, "results", "0", "longitude");
        if (Double.isNaN(lat) || Double.isNaN(lon)) {
            return null;
        }
        return new double[] {lat, lon};
    }

    /**
     * Busca un lugar y devuelve {nombre, región, país}, o {@code null} si no lo encuentra.
     * Útil para comprobar que se ha encontrado el lugar correcto (hay muchos "San Juan"...).
     */
    public static String[] describirLugar(String lugar) {
        String json = buscarLugar(lugar);
        String nombre = Web.jsonTexto(json, "results", "0", "name");
        if (nombre == null) {
            return null;
        }
        String region = Web.jsonTexto(json, "results", "0", "admin1");
        String pais = Web.jsonTexto(json, "results", "0", "country");
        return new String[] {nombre, region == null ? "" : region, pais == null ? "" : pais};
    }

    /**
     * Altitud en metros sobre el nivel del mar de cada punto (mismo orden que los arrays recibidos).
     */
    public static double[] altitudes(double[] latitudes, double[] longitudes) {
        if (latitudes.length != longitudes.length) {
            throw new IllegalArgumentException("Los arrays de latitudes y longitudes deben tener la misma longitud");
        }
        double[] resultado = new double[latitudes.length];
        for (int ini = 0; ini < latitudes.length; ini += 100) { // el servicio admite 100 puntos por consulta
            int fin = Math.min(ini + 100, latitudes.length);
            StringBuilder lats = new StringBuilder();
            StringBuilder lons = new StringBuilder();
            for (int i = ini; i < fin; i++) {
                if (i > ini) { lats.append(','); lons.append(','); }
                lats.append(latitudes[i]);
                lons.append(longitudes[i]);
            }
            String json = Web.get("https://api.open-meteo.com/v1/elevation?latitude=" + lats + "&longitude=" + lons);
            double[] parte = Web.jsonNumeros(json, "elevation");
            System.arraycopy(parte, 0, resultado, ini, parte.length);
        }
        return resultado;
    }

    // ------------------------------------------------------------------ previsión (hasta 16 días)

    /** Fechas y horas de la previsión horaria: {"2026-11-19T00:00", "2026-11-19T01:00", ...} (24 por día). */
    public static String[] horas(double lat, double lon, int dias) {
        return Web.jsonTextos(prevision(lat, lon, "hourly", "temperature_2m", dias), "hourly", "time");
    }

    /** Valores horarios de una variable (24 por día), en el mismo orden que {@link #horas}. */
    public static double[] horaria(double lat, double lon, String variable, int dias) {
        return Web.jsonNumeros(prevision(lat, lon, "hourly", variable, dias), "hourly", variable);
    }

    /** Fechas de la previsión diaria: {"2026-11-19", "2026-11-20", ...}. */
    public static String[] dias(double lat, double lon, int dias) {
        return Web.jsonTextos(prevision(lat, lon, "daily", "temperature_2m_max", dias), "daily", "time");
    }

    /** Valores diarios numéricos de una variable, en el mismo orden que {@link #dias}. */
    public static double[] diaria(double lat, double lon, String variable, int dias) {
        return Web.jsonNumeros(prevision(lat, lon, "daily", variable, dias), "daily", variable);
    }

    /** Valores diarios de texto (por ejemplo {@code sunrise}, {@code sunset}: "2026-11-19T08:21"). */
    public static String[] diariaTextos(double lat, double lon, String variable, int dias) {
        return Web.jsonTextos(prevision(lat, lon, "daily", variable, dias), "daily", variable);
    }

    // ------------------------------------------------------------------ histórico (desde 1940)

    /** Fechas del histórico diario entre dos fechas incluidas ("AAAA-MM-DD"). */
    public static String[] diasHistorico(double lat, double lon, String desde, String hasta) {
        return Web.jsonTextos(historico(lat, lon, "temperature_2m_max", desde, hasta), "daily", "time");
    }

    /**
     * Valores diarios reales de una variable entre dos fechas incluidas ("AAAA-MM-DD").
     * Los últimos días (aprox. la última semana) pueden no estar disponibles todavía (NaN).
     */
    public static double[] diariaHistorico(double lat, double lon, String variable, String desde, String hasta) {
        return Web.jsonNumeros(historico(lat, lon, variable, desde, hasta), "daily", variable);
    }

    // ------------------------------------------------------------------ internos

    private static String buscarLugar(String lugar) {
        return Web.get("https://geocoding-api.open-meteo.com/v1/search?count=1&language=es&format=json&name="
                + Web.codificar(lugar));
    }

    private static String prevision(double lat, double lon, String tipo, String variable, int dias) {
        if (dias < 1 || dias > 16) {
            throw new IllegalArgumentException("La previsión admite entre 1 y 16 días");
        }
        return Web.get(PREVISION + "?latitude=" + lat + "&longitude=" + lon + "&" + tipo + "=" + variable
                + "&forecast_days=" + dias + "&timezone=auto");
    }

    private static String historico(double lat, double lon, String variable, String desde, String hasta) {
        return Web.get(HISTORICO + "?latitude=" + lat + "&longitude=" + lon + "&daily=" + variable
                + "&start_date=" + desde + "&end_date=" + hasta + "&timezone=auto");
    }
}
