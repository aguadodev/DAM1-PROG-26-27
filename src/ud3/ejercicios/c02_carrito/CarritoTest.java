package ud3.ejercicios.c02_carrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarritoTest {

    @Test
    void contiene() {
        assertTrue(Carrito.contiene(new int[] {7, 3, 9}, 3));
        assertTrue(Carrito.contiene(new int[] {7, 3, 9}, 9), "El último");
        assertFalse(Carrito.contiene(new int[] {7, 3, 9}, 4));
        assertFalse(Carrito.contiene(new int[0], 4));
    }

    @Test
    void anadir() {
        assertArrayEquals(new int[] {7, 3, 9, 5}, Carrito.anadir(new int[] {7, 3, 9}, 5));
        assertArrayEquals(new int[] {7, 3, 9}, Carrito.anadir(new int[] {7, 3, 9}, 3), "Ya estaba");
        assertArrayEquals(new int[] {5}, Carrito.anadir(new int[0], 5));
    }

    @Test
    void quitar() {
        assertArrayEquals(new int[] {3, 9}, Carrito.quitar(new int[] {7, 3, 9}, 7), "El primero");
        assertArrayEquals(new int[] {7, 3}, Carrito.quitar(new int[] {7, 3, 9}, 9), "El último");
        assertArrayEquals(new int[] {7, 9}, Carrito.quitar(new int[] {7, 3, 9}, 3));
        assertArrayEquals(new int[] {7, 3, 9}, Carrito.quitar(new int[] {7, 3, 9}, 4), "No estaba");
        assertArrayEquals(new int[0], Carrito.quitar(new int[] {7}, 7));
        assertArrayEquals(new int[0], Carrito.quitar(new int[0], 7));
    }

    @Test
    void sinDuplicados() {
        assertArrayEquals(new int[] {4, 1, 2}, Carrito.sinDuplicados(new int[] {4, 1, 4, 4, 2, 1}));
        assertArrayEquals(new int[] {5}, Carrito.sinDuplicados(new int[] {5, 5, 5}));
        assertArrayEquals(new int[] {1, 2, 3}, Carrito.sinDuplicados(new int[] {1, 2, 3}));
        assertArrayEquals(new int[0], Carrito.sinDuplicados(new int[0]));
    }

    @Test
    void unir() {
        assertArrayEquals(new int[] {7, 3, 9, 1, 8}, Carrito.unir(new int[] {7, 3, 9}, new int[] {9, 1, 7, 8}));
        assertArrayEquals(new int[] {1, 2}, Carrito.unir(new int[0], new int[] {1, 2}));
        assertArrayEquals(new int[] {1, 2}, Carrito.unir(new int[] {1, 2}, new int[0]));
        assertArrayEquals(new int[] {1, 2}, Carrito.unir(new int[] {1, 2}, new int[] {2, 1}));
    }

    @Test
    void comunes() {
        assertArrayEquals(new int[] {7, 9}, Carrito.comunes(new int[] {7, 3, 9}, new int[] {9, 1, 7, 8}));
        assertArrayEquals(new int[0], Carrito.comunes(new int[] {1, 2}, new int[] {3, 4}));
        assertArrayEquals(new int[0], Carrito.comunes(new int[0], new int[] {3, 4}));
    }

    @Test
    void noModificaLosArraysRecibidos() {
        int[] c1 = {7, 3, 9};
        int[] c2 = {9, 1, 7, 8};
        int[] conRepetidos = {4, 1, 4};
        Carrito.anadir(c1, 5);
        Carrito.quitar(c1, 3);
        Carrito.unir(c1, c2);
        Carrito.comunes(c1, c2);
        Carrito.sinDuplicados(conRepetidos);
        assertArrayEquals(new int[] {7, 3, 9}, c1);
        assertArrayEquals(new int[] {9, 1, 7, 8}, c2);
        assertArrayEquals(new int[] {4, 1, 4}, conRepetidos);
    }
}
