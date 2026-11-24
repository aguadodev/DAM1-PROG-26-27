package ud3.proyecto.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Ejemplos de uso de las clases de apoyo. Ejecútalo para comprobar que tienes conexión.
 * Necesita internet (salvo la parte de ficheros).
 */
public class EjemploUtil {
    public static void main(String[] args) {
        // 1. Buscar un lugar
        String[] lugar = OpenMeteo.describirLugar("Santiago de Compostela");
        double[] coord = OpenMeteo.coordenadas("Santiago de Compostela");
        System.out.println(lugar[0] + " (" + lugar[1] + ", " + lugar[2] + "): " + coord[0] + ", " + coord[1]);

        // 2. Previsión diaria de 7 días
        String[] dias = OpenMeteo.dias(coord[0], coord[1], 7);
        double[] maximas = OpenMeteo.diaria(coord[0], coord[1], "temperature_2m_max", 7);
        double[] lluvia = OpenMeteo.diaria(coord[0], coord[1], "precipitation_sum", 7);
        for (int i = 0; i < dias.length; i++) {
            LocalDate fecha = LocalDate.parse(dias[i]);
            String nombreDia = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("es", "ES"));
            System.out.printf("%-10s %s  máx %5.1f °C  lluvia %5.1f mm%n", nombreDia, fecha, maximas[i], lluvia[i]);
        }

        // 3. Previsión horaria: 2 días = 48 valores
        String[] horas = OpenMeteo.horas(coord[0], coord[1], 2);
        double[] temp = OpenMeteo.horaria(coord[0], coord[1], "temperature_2m", 2);
        LocalDateTime primera = LocalDateTime.parse(horas[0]);
        System.out.println(horas.length + " horas desde " + primera + "; a las 12:00 de hoy: " + temp[12] + " °C");

        // 4. Altitudes de varios puntos
        double[] lats = {coord[0], 42.8782};
        double[] lons = {coord[1], -8.5448};
        double[] alt = OpenMeteo.altitudes(lats, lons);
        System.out.println("Altitudes: " + alt[0] + " m y " + alt[1] + " m");

        // 5. Histórico: temperaturas máximas de enero de 2025
        double[] enero = OpenMeteo.diariaHistorico(coord[0], coord[1], "temperature_2m_max", "2025-01-01", "2025-01-31");
        System.out.println("Enero 2025: " + enero.length + " días, el día 1 la máxima fue " + enero[0] + " °C");

        // 6. Ficheros
        String[] nombres = Ficheros.leerLineas("src/ud3/proyecto/datos/lugares_ejemplo.txt");
        System.out.println("El fichero de ejemplo tiene " + nombres.length + " lugares; el primero es " + nombres[0]);
        Ficheros.escribirLineas("salida/prueba.txt", new String[] {"Línea 1", "Línea 2 con tilde: camión"});
        System.out.println("Escrito salida/prueba.txt: " + Ficheros.leerTexto("salida/prueba.txt").replace("\n", " | "));
    }
}
