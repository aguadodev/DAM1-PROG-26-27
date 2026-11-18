package ud3;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtil {

    /* INICIALIZAR */
    /**
     * Inicializar array de longitud N con números enteros aleatorios entre
     * rndInicio y rndFin inclusives.
     * 
     * @param n
     * @param rndInicio
     * @param rndFin
     * @return Array generado.
     */
    static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] numeros = new int[n];
        Random rnd = new Random();

        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }

        return numeros;
    }

    /* IMPRIMIR */

    public static void imprimir(int[] t) {
        for (int e : t)
            System.out.print(e + " ");
        System.out.println();
    }

    /**
     * Imprime un array en orden inverso
     * 
     * @param numeros
     */
    static void imprimirInverso(int[] numeros) {
        // Imprimir en orden inverso
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    /**
     * Generar un array invertido sin modificar el array original
     * 
     * @param t
     * @return
     */
    static int[] invertir(int[] t) {
        int[] tAux = new int[t.length];

        for (int i = 0; i < t.length; i++)
            tAux[i] = t[t.length - i - 1];

        return tAux;
    }

    /* INSERTAR ELEMENTOS */
    /**
     * 
     * @param t
     * @param valor
     * @return
     */
    static int[] insertarAlFinal(int[] t, int valor) {
        int[] tAux = new int[t.length + 1];
        for (int i = 0; i < t.length; i++)
            tAux[i] = t[i];
        tAux[tAux.length - 1] = valor;
        return tAux;
    }

    static int[] insertarAlInicio(int[] t, int valor) {
        int[] tAux = new int[t.length + 1];
        for (int i = 0; i < t.length; i++) {
            tAux[i + 1] = t[i];
        }
        tAux[0] = valor;
        return tAux;
    }

    static int[] insertarEnPosicion(int[] t, int valor, int pos) {
        int[] tAux = new int[t.length + 1];

        // Copiar elementos anteriores a pos
        for (int i = 0; i < pos; i++)
            tAux[i] = t[i];

        // Copiar elementos posteriores a pos
        for (int i = pos; i < t.length; i++) {
            tAux[i + 1] = t[i];
        }

        // Insertar valor en pos
        tAux[pos] = valor;

        return tAux;
    }

    static int[] eliminarFinal(int[] t) {
        int[] tAux = new int[t.length - 1];
        for (int i = 0; i < tAux.length; i++)
            tAux[i] = t[i];
        return tAux;
    }

    static int[] eliminarInicial(int[] t) {
        int[] tAux = new int[t.length - 1];
        for (int i = 0; i < tAux.length; i++)
            tAux[i] = t[i + 1];
        return tAux;
    }    

    static int[] eliminarPorValor(int[] t, int valor) {
        
    }




    /**
     * Obtener el máximo de un array
     * 
     * @param numeros
     * @return máximo
     */
    static int maximo(int[] numeros) {
        // Calcular el máximo
        int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo)
                maximo = numero;
        }
        return maximo;
    }

    static int suma(int[] numeros) {
        // Calcular Suma
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = arrayAleatorio(10, 10, 20);
        imprimir(numeros);
        numeros = insertarEnPosicion(numeros, -1, 3);
        imprimir(numeros);
        numeros = eliminarInicial(numeros);
        imprimir(numeros);

    }

}
