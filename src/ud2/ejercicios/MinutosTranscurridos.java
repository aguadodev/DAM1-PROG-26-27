package ud2.ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** @author Jpineport */

public class MinutosTranscurridos {

    public static void main(String[] args) {
        System.out.println(minutosTranscurridos(13, 20, 10, 10));
    }

    public static int minutosTranscurridos(int hora1, int minuto1, int hora2, int minuto2) {

        if (hora1 < 0 || hora1 > 23 ||
                minuto1 < 0 || minuto1 > 59 ||
                hora2 < 0 || hora2 > 23 ||
                minuto2 < 0 || minuto2 > 59) {
            return -1;
        }

        int totalMins1 = hora1 * 60 + minuto1;
        int totalMins2 = hora2 * 60 + minuto2;

        return Math.abs(totalMins1 - totalMins2);
    }

    @Test
    public void testMinutosTranscurridos() {
        assertEquals(190, minutosTranscurridos(13, 20, 10, 10));
        assertEquals(170, minutosTranscurridos(13, 10, 10, 20));
        assertEquals(190, minutosTranscurridos(10, 10, 13, 20));
        assertEquals(170, minutosTranscurridos(10, 20, 13, 10));
        assertEquals(70, minutosTranscurridos(11, 20, 10, 10));
        assertEquals(50, minutosTranscurridos(11, 10, 10, 20));
        assertEquals(70, minutosTranscurridos(10, 10, 11, 20));
        assertEquals(50, minutosTranscurridos(10, 20, 11, 10));
        assertEquals(0, minutosTranscurridos(10, 10, 10, 10));
        assertEquals(10, minutosTranscurridos(10, 20, 10, 10));
        assertEquals(10, minutosTranscurridos(10, 10, 10, 20));
        assertEquals(-1, minutosTranscurridos(24, 10, 10, 20));
        assertEquals(-1, minutosTranscurridos(10, 60, 10, 20));
        assertEquals(-1, minutosTranscurridos(10, 10, 24, 20));
        assertEquals(-1, minutosTranscurridos(10, 10, 10, 60));

        assert minutosTranscurridos(10, 30, 11, 0) == 30;
        assert minutosTranscurridos(12, 0, 12, 0) == 0;
        assert minutosTranscurridos(5, 15, 4, 45) == 30;
        assert minutosTranscurridos(25, 0, 10, 0) == -1; // Invalid hour
        assert minutosTranscurridos(10, 60, 11, 0) == -1; // Invalid minute
    }

}
