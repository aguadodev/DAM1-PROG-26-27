package ud3.ejercicios.c01_temperaturas.xxx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TemperaturasTest {
    private static final int[] EJEMPLO = {12, 15, 9, -2, 0, 15, 4};

    @Test
    void media() {
        assertEquals(53 / 7.0, Temperaturas.media(EJEMPLO), 1e-9);
        assertEquals(2.5, Temperaturas.media(new int[] {2, 3}), 1e-9, "Cuidado con la división entera");
        assertEquals(-1.5, Temperaturas.media(new int[] {-1, -2}), 1e-9);
        assertEquals(0.0, Temperaturas.media(new int[0]), 1e-9);
    }

    @Test
    void maximaYMinima() {
        assertEquals(15, Temperaturas.maxima(EJEMPLO));
        assertEquals(-2, Temperaturas.minima(EJEMPLO));
        assertEquals(-3, Temperaturas.maxima(new int[] {-5, -3, -8}), "Todas negativas");
        assertEquals(4, Temperaturas.minima(new int[] {4, 7, 9}), "Todas positivas");
        assertEquals(7, Temperaturas.maxima(new int[] {7}));
        assertEquals(7, Temperaturas.minima(new int[] {7}));
    }

    @Test
    void amplitudTermica() {
        assertEquals(17, Temperaturas.amplitudTermica(EJEMPLO));
        assertEquals(0, Temperaturas.amplitudTermica(new int[] {3, 3}));
    }

    @Test
    void diaMasCaluroso() {
        assertEquals(1, Temperaturas.diaMasCaluroso(EJEMPLO), "Empate: la primera posición");
        assertEquals(2, Temperaturas.diaMasCaluroso(new int[] {-5, -3, -1}));
        assertEquals(0, Temperaturas.diaMasCaluroso(new int[] {9}));
        assertEquals(-1, Temperaturas.diaMasCaluroso(new int[0]));
    }

    @Test
    void heladas() {
        assertEquals(1, Temperaturas.contarHeladas(EJEMPLO));
        assertTrue(Temperaturas.hayHelada(EJEMPLO));
        assertEquals(0, Temperaturas.contarHeladas(new int[] {0, 0, 5}), "0 no es helada");
        assertFalse(Temperaturas.hayHelada(new int[] {0, 0, 5}));
        assertEquals(3, Temperaturas.contarHeladas(new int[] {-1, -2, -3}));
        assertFalse(Temperaturas.hayHelada(new int[0]));
        assertTrue(Temperaturas.hayHelada(new int[] {5, 6, -1}), "La helada es el último día");
    }

    @Test
    void diasSobreMedia() {
        assertArrayEquals(new int[] {0, 1, 2, 5}, Temperaturas.diasSobreMedia(EJEMPLO));
        assertArrayEquals(new int[0], Temperaturas.diasSobreMedia(new int[] {5, 5, 5}), "Ninguno supera la media");
        assertArrayEquals(new int[] {1}, Temperaturas.diasSobreMedia(new int[] {1, 2}));
        assertArrayEquals(new int[0], Temperaturas.diasSobreMedia(new int[0]));
    }
}
