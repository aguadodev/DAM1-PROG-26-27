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
    public static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] numeros = new int[n];
        Random rnd = new Random();

        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }

        return numeros;
    }

    //Inicializar array desde teclado
    //static int[] leerDeTeclado(int n)    

    /************/
    /* IMPRIMIR */
    /************/

    /**
     * Imprimir array
     * @param t
     */
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

    //Insertar un valor en un array cuyos elementos están ordenados de menor a mayor, manteniendo el orden.
    static int[] insertarOrdenado(int[] t, int valor) {
        int pos = 0;

        if (t.length != 0) {
            while (t[pos] < valor) {
                pos++;
            }
        }

        return insertarEnPosicion(t, valor, pos);
    }

    //Insertar un valor al final únicamente si todavía no existe en el array. Si ya existe, devolver el array original.
    //static int[] insertarSinRepetir(int[] t, int valor)


    /**********************/
    /* ELIMINAR ELEMENTOS */
    /**********************/  
    /**
     * Eliminar el valor final
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
     * Eliminar el valor inicial
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
        if (pos < 0 || pos >= t.length)
            return t;
        
        int[] tAux = new int[t.length - 1];

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

    //Eliminar los elementos repetidos, conservando la primera aparición de cada valor y respetando el orden original.
    //static int[] eliminarDuplicados(int[] t)    

    /**********************/
    /* BUSCAR Y CONSULTAR */
    /**********************/

    //Indicar si un valor existe en el array.
    //static boolean contiene(int[] t, int valor)

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

    public static int buscar(String t[], String clave) {
        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return i;
        return -1;
    }

    //Buscar desde el final. Similar al anterior pero buscando por el final.
    //static int buscarUltimo(int t[], int clave)

    //Contar número de veces que aparece un valor
    //static int contarApariciones(int[] t, int valor)


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

    //Obtener el mínimo de un array
    //static int minimo(int[] numeros)

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

    //Obtener la media
    //static int media(int[] numeros)

    //Devolver cuántos elementos son pares.
    //static int contarPares(int[] t)	

    //Devolver cuántos elementos son impares.
    //static int contarImpares(int[] t)	

    //Devolver cuántos elementos son positivos.
    //static int contarPositivos(int[] t)	

    //Indicar si todos los elementos son positivos.
    //static boolean todosPositivos(int[] t)	

    //Indicar si existe al menos un elemento negativo.
    //static boolean algunoNegativo(int[] t)	

    //Devolver un nuevo array que contenga únicamente los elementos pares, conservando su orden.
    //static int[] filtrarPares(int[] t)	

    //Devolver un nuevo array con los elementos mayores que el límite indicado.
    //static int[] filtrarMayoresQue(int[] t, int limite)


    /*******************************************/    
    /* MODIFICACIÓN Y TRANSFORMACIÓN DE ARRAYS */
    /*******************************************/    
    //Sustituir el elemento de una posición determinada por un nuevo valor. Modifica el array original.
    //static void modificarValor(int[] t, int pos, int valor)	

    //Intercambiar los elementos de dos posiciones del array.
    //static void intercambiar(int[] t, int pos1, int pos2)	

    //Devolver un nuevo array con los elementos en orden inverso.
    //static int[] invertir(int[] t)	

    //Devolver una copia independiente del array original.
    //static int[] copiar(int[] t)	

    //Devolver un nuevo array que contenga primero los elementos de t1 y después los de t2.
    //static int[] concatenar(int[] t1, int[] t2)	

    //Devolver un nuevo array alternando los elementos de ambos arrays. Si tienen distinta longitud, añadir al final los elementos restantes del más largo.
    //static int[] intercalar(int[] t1, int[] t2)	

    //Devolver un nuevo array con los elementos comprendidos entre las posiciones indicadas, ambas incluidas.
    //static int[] subArray(int[] t, int inicio, int fin)



    /***************************************/    
    /* ORDENACIÓN Y COMPROBACIÓN DEL ORDEN */
    /***************************************/    
    //Comprobar si los elementos están ordenados de menor a mayor.
    public static boolean estaOrdenado(int[] t) {
        if (t.length < 2)
            return true;

        for (int i = 1; i < t.length; i++)
            if (t[i-1] > t[i])
                return false;        

        return true;
    }

    //Comprobar si los elementos están ordenados de mayor a menor.
    //static boolean estaOrdenadoDescendente(int[] t)	

    //Ordenar el array de menor a mayor utilizando el algoritmo de la burbuja. Modifica el array original.
    public static void ordenarBurbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }    

    //Ordenar el array de menor a mayor utilizando el algoritmo de selección. Modifica el array original.
    //static void ordenarSeleccion(int[] t)	

    //Ordenar el array de menor a mayor utilizando el algoritmo de inserción directa. Modifica el array original.
    //static void ordenarInsercion(int[] t)



    /***********************************/    
    /* PROGRAMA PRINCIPAL PARA PRUEBAS */
    /***********************************/    

    public static void main(String[] args) {
        int[] numerosOrdenado = arrayAleatorio(1000, 1, 100);
        ordenarBurbuja(numerosOrdenado);

        imprimir(numerosOrdenado);



        System.out.println(estaOrdenado(numerosOrdenado));

        int[] numeros = arrayAleatorio(10, 10, 20);
        imprimir(numeros);
        // System.out.println("Posición del 15: " + buscar(numeros, 15));
        imprimir(eliminarValores(numeros, 15));

    }

}
