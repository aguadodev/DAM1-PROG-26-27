package ud3;

import java.util.Random;

public class ArraysUtil {
    /***************/
    /* INICIALIZAR */
    /***************/

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
    /**********************/
    /* INSERTAR ELEMENTOS */
    /**********************/
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
    /**********************/
    /* ELIMINAR ELEMENTOS */
    /**********************/  
    /**
     * Insertar un valor al final
     * @param t
     * @return
     */  
    static int[] eliminarFinal(int[] t) {
        int[] tAux = new int[t.length - 1];
        for (int i = 0; i < tAux.length; i++)
            tAux[i] = t[i];
        return tAux;
    }

    /**
     * Insertar un valor al inicio
     * @param t
     * @return
     */
    static int[] eliminarInicial(int[] t) {
        int[] tAux = new int[t.length - 1];
        for (int i = 0; i < tAux.length; i++)
            tAux[i] = t[i + 1];
        return tAux;
    }

    /**
     * Eliminar el elemento que ocupa la posición indicada. Los elementos
     * posteriores deben desplazarse una posición a la izquierda.
     * 
     * @param t
     * @param pos
     * @return Si posicion es inválida devuelve el mismo array de entrada.
     */
    static int[] eliminarPorPosicion(int[] t, int pos) {
        int[] tAux = new int[t.length - 1];
        if (pos < 0 || pos >= t.length)
            return t;

        for (int i = 0; i < pos; i++)
            tAux[i] = t[i];
        for (int i = pos; i < t.length - 1; i++)
            tAux[i] = t[i + 1];

        return tAux;
    }

    /**
     * Eliminar la primera aparición del valor indicado. Si no existe, devolver el array original.
     * @param t
     * @param valor
     * @return
     */
    static int[] eliminarPorValor(int[] t, int valor) {
        return eliminarPorPosicion(t, buscar(t, valor));
    }

    /**
     * Eliminar todas las apariciones del valor indicado.
     * @param t
     * @param valor
     * @return
     */
    static int[] eliminarValores(int[] t, int valor) {
        int[] tAux = new int[t.length];
        int cont = 0;

        for (int i = 0; i < tAux.length; i++) {
            if (t[i] == valor) {
                cont++;
            } else {
                tAux[i - cont] = t[i];
            }
        }
        int[] tAux2 = new int[t.length - cont];
        for (int i = 0; i < tAux2.length; i++) {
            tAux2[i] = tAux[i];
        }

        return tAux2;
    }

    /**
     * Eliminar todas las apariciones del valor indicado.
     * @param t
     * @param valor
     * @return
     */
    static int[] eliminarValores2(int[] t, int valor) {
        int[] tAux = t;
        while (buscar(tAux, valor) != -1)
            tAux = eliminarPorValor(tAux, valor);
        return tAux;
    }

    /**********************/
    /* BUSCAR Y CONSULTAR */
    /**********************/

    /**
     * Buscar de forma secuencial en la tabla t el valor clave. En caso de
     * encontrarlo, devuelve en qué posición lo encuentra, y en caso contrario,
     * devolverá -1.
     * 
     * @param t
     * @param clave
     * @return
     */
    public static int buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return i;
        return -1;
    }

    /**
     * Obtener el máximo de un array
     * 
     * @param numeros
     * @return máximo
     */
    static int maximo(int[] numeros) {
        int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo)
                maximo = numero;
        }
        return maximo;
    }



    /*******************************************************/    
    /* PROCESAR: OPERACIONES ESTADÍSTICAS Y DE AGREGACIÓN  */
    /*******************************************************/    
    /**
     * Obtener la suma de elementos de un array.
     * @param numeros
     * @return
     */
    static int suma(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    /*******************************************/    
    /* MODIFICACIÓN Y TRANSFORMACIÓN DE ARRAYS */
    /*******************************************/    
    static int[] concatenar(int[] t1, int[] t2) {
        return null;
    }


    /***************************************/    
    /* ORDENACIÓN Y COMPROBACIÓN DEL ORDEN */
    /***************************************/    



    /***********************************/    
    /* PROGRAMA PRINCIPAL PARA PRUEBAS */
    /***********************************/    

    public static void main(String[] args) {
        int[] numeros = arrayAleatorio(10, 10, 20);
        imprimir(numeros);
        // System.out.println("Posición del 15: " + buscar(numeros, 15));
        imprimir(eliminarValores(numeros, 15));

    }

}
