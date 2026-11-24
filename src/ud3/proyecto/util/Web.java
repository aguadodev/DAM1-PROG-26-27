package ud3.proyecto.util;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Utilidades para consultar servicios web que devuelven JSON.
 *
 * <p><b>Código proporcionado por el profesor.</b> No hace falta entender cómo funciona por dentro:
 * basta con saber usar los métodos públicos. Usa cosas que veremos más adelante
 * (colecciones, clases, recursividad...).</p>
 *
 * <pre>
 * String json = Web.get("https://api.ejemplo.com/datos?x=1");
 * double[] valores = Web.jsonNumeros(json, "hourly", "temperature_2m");
 * String nombre   = Web.jsonTexto(json, "results", "0", "name");
 * </pre>
 *
 * <p>La "ruta" es la secuencia de claves para llegar al dato dentro del JSON. Para entrar en una
 * posición de un array JSON se escribe su índice como texto ("0", "1"...).</p>
 */
public class Web {

    static {
        // Usa el proxy configurado en el sistema (redes de centros educativos)
        System.setProperty("java.net.useSystemProxies", "true");
    }

    private static final HttpClient CLIENTE = HttpClient.newBuilder()
            .proxy(java.net.ProxySelector.getDefault())
            .connectTimeout(Duration.ofSeconds(10))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();

    private Web() {
    }

    /**
     * Descarga el contenido de una URL (normalmente un JSON) como texto.
     *
     * @throws RuntimeException si no hay conexión o el servidor responde con error.
     */
    public static String get(String url) {
        HttpRequest peticion = HttpRequest.newBuilder(URI.create(url))
                .timeout(Duration.ofSeconds(20))
                .header("User-Agent", "DAM1-proyecto-UD3/1.0")
                .GET()
                .build();
        try {
            HttpResponse<String> respuesta = CLIENTE.send(peticion, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            if (respuesta.statusCode() != 200) {
                throw new RuntimeException("El servidor respondió con el código " + respuesta.statusCode()
                        + ": " + recortar(respuesta.body()));
            }
            return respuesta.body();
        } catch (java.io.IOException e) {
            throw new RuntimeException("No se pudo conectar con " + url + " (" + e.getMessage() + ")", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Consulta interrumpida", e);
        }
    }

    /** Codifica un texto para poder ponerlo en una URL (espacios, tildes, eñes...). */
    public static String codificar(String texto) {
        return URLEncoder.encode(texto, StandardCharsets.UTF_8);
    }

    /** Devuelve el array JSON indicado por la ruta como números. Los valores {@code null} se devuelven como {@code Double.NaN}. */
    public static double[] jsonNumeros(String json, String... ruta) {
        List<Object> lista = comoLista(buscar(json, ruta), ruta);
        double[] resultado = new double[lista.size()];
        for (int i = 0; i < resultado.length; i++) {
            Object o = lista.get(i);
            resultado[i] = (o instanceof Double d) ? d : Double.NaN;
        }
        return resultado;
    }

    /** Devuelve el array JSON indicado por la ruta como textos. Los valores {@code null} se devuelven como {@code null}. */
    public static String[] jsonTextos(String json, String... ruta) {
        List<Object> lista = comoLista(buscar(json, ruta), ruta);
        String[] resultado = new String[lista.size()];
        for (int i = 0; i < resultado.length; i++) {
            Object o = lista.get(i);
            resultado[i] = (o == null) ? null : textoDe(o);
        }
        return resultado;
    }

    /** Devuelve el número indicado por la ruta, o {@code Double.NaN} si no existe o es {@code null}. */
    public static double jsonNumero(String json, String... ruta) {
        Object o = buscar(json, ruta);
        return (o instanceof Double d) ? d : Double.NaN;
    }

    /** Devuelve el texto indicado por la ruta, o {@code null} si no existe. */
    public static String jsonTexto(String json, String... ruta) {
        Object o = buscar(json, ruta);
        return (o == null) ? null : textoDe(o);
    }

    // ------------------------------------------------------------------ internos

    private static String recortar(String s) {
        return s.length() > 300 ? s.substring(0, 300) + "..." : s;
    }

    private static String textoDe(Object o) {
        if (o instanceof Double d && d == Math.rint(d) && !Double.isInfinite(d)) {
            return String.valueOf(d.longValue());
        }
        return String.valueOf(o);
    }

    @SuppressWarnings("unchecked")
    private static List<Object> comoLista(Object o, String[] ruta) {
        if (!(o instanceof List)) {
            throw new RuntimeException("En la ruta " + String.join(" > ", ruta) + " no hay un array JSON");
        }
        return (List<Object>) o;
    }

    @SuppressWarnings("unchecked")
    private static Object buscar(String json, String... ruta) {
        Object actual = new Parser(json).valor();
        for (String clave : ruta) {
            if (actual instanceof Map) {
                actual = ((Map<String, Object>) actual).get(clave);
            } else if (actual instanceof List) {
                List<Object> lista = (List<Object>) actual;
                int i;
                try {
                    i = Integer.parseInt(clave);
                } catch (NumberFormatException e) {
                    return null;
                }
                actual = (i >= 0 && i < lista.size()) ? lista.get(i) : null;
            } else {
                return null;
            }
        }
        return actual;
    }

    /** Analizador JSON mínimo: objetos → Map, arrays → List, números → Double. */
    private static final class Parser {
        private final String s;
        private int p;

        Parser(String s) {
            this.s = s;
        }

        Object valor() {
            espacios();
            if (p >= s.length()) {
                throw error("fin inesperado");
            }
            char c = s.charAt(p);
            switch (c) {
                case '{': return objeto();
                case '[': return array();
                case '"': return cadena();
                case 't': literal("true"); return Boolean.TRUE;
                case 'f': literal("false"); return Boolean.FALSE;
                case 'n': literal("null"); return null;
                default: return numero();
            }
        }

        private Map<String, Object> objeto() {
            Map<String, Object> m = new LinkedHashMap<>();
            p++;
            espacios();
            if (s.charAt(p) == '}') { p++; return m; }
            while (true) {
                espacios();
                String k = cadena();
                espacios();
                esperar(':');
                m.put(k, valor());
                espacios();
                if (s.charAt(p) == ',') { p++; continue; }
                esperar('}');
                return m;
            }
        }

        private List<Object> array() {
            List<Object> l = new ArrayList<>();
            p++;
            espacios();
            if (s.charAt(p) == ']') { p++; return l; }
            while (true) {
                l.add(valor());
                espacios();
                if (s.charAt(p) == ',') { p++; continue; }
                esperar(']');
                return l;
            }
        }

        private String cadena() {
            esperar('"');
            StringBuilder sb = new StringBuilder();
            while (true) {
                char c = s.charAt(p++);
                if (c == '"') return sb.toString();
                if (c == '\\') {
                    char e = s.charAt(p++);
                    switch (e) {
                        case 'n': sb.append('\n'); break;
                        case 't': sb.append('\t'); break;
                        case 'r': sb.append('\r'); break;
                        case 'b': sb.append('\b'); break;
                        case 'f': sb.append('\f'); break;
                        case 'u': sb.append((char) Integer.parseInt(s.substring(p, p + 4), 16)); p += 4; break;
                        default: sb.append(e);
                    }
                } else {
                    sb.append(c);
                }
            }
        }

        private Double numero() {
            int ini = p;
            while (p < s.length() && "+-0123456789.eE".indexOf(s.charAt(p)) >= 0) p++;
            if (ini == p) throw error("valor no válido");
            return Double.parseDouble(s.substring(ini, p));
        }

        private void literal(String l) {
            if (!s.startsWith(l, p)) throw error("se esperaba " + l);
            p += l.length();
        }

        private void esperar(char c) {
            espacios();
            if (p >= s.length() || s.charAt(p) != c) throw error("se esperaba '" + c + "'");
            p++;
        }

        private void espacios() {
            while (p < s.length() && Character.isWhitespace(s.charAt(p))) p++;
        }

        private RuntimeException error(String msg) {
            return new RuntimeException("JSON no válido en la posición " + p + ": " + msg);
        }
    }
}
