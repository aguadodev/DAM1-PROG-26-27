package ud3.ejercicios;

import java.util.Arrays;

public class InsertarOrdenado {
    public static void main(String[] args) {
        int[] t = {};
        int valor = 11;
        System.out.println(Arrays.toString(insertarOrdenado(t, valor)));
    }

    static int[] insertarOrdenado(int[] t, int valor) {
        int posicionAInsertar = buscarPosicion(t, valor);
        return insertarEnPosicion(t, posicionAInsertar, valor);
    }

    static int buscarPosicion(int[] t, int valor) {
        int posicion = 0;
        for (int i = 0; i < t.length - 1; i++) {
            if (i != 0) {
                if (t[i - 1] < valor && t[i + 1] > valor) {
                    return i + 1;
                } else if (t[t.length - 1] < valor) {
                    posicion = t.length;
                }

            }

        }
        return posicion;
    }

    public static int[] insertarEnPosicion(int[] t, int pos, int valor) {
        if (pos < 0 || pos > t.length) {
            throw new IllegalArgumentException("POSICIÓN FUERA DEL RANGO");
            // ÍNDICE ERRONEO
        }
        int[] tAux = new int[t.length + 1];

        for (int i = 0; i < pos; i++) {
            tAux[i] = t[i];
        }
        tAux[pos] = valor;
        for (int i = pos + 1; i < tAux.length; i++) {
            tAux[i] = t[i - 1];
        }

        return tAux;
    }
}
