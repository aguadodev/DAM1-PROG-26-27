package ud3;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtil {

    static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] numeros = new int[n];
        Random rnd = new Random();

        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }

        return numeros;
    }


    static int suma(int[] numeros) {
        // Calcular Suma
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }


    static void imprimirInverso(int[] numeros) {
        // Imprimir en orden inverso
        for (int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.print(numeros[i] + " ");
        }        
    }

    static int maximo(int[] numeros) {
        // Calcular el máximo
        int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo)
                maximo = numero;
        } 
        return maximo;       
    }

    static int[] insertarAlFinal(int[] t, int valor) {
        int[] tAux = new int[t.length + 1];
        for (int i = 0; i < t.length; i++) 
            tAux[i] = t[i];
        tAux[tAux.length - 1] = valor;
        return tAux;        
    }




    public static void main(String[] args) {
        int[] numeros10A20 = arrayAleatorio(10, 10, 20);
        System.out.println(Arrays.toString(numeros10A20));
        System.out.println("Suma = " + suma(numeros10A20));
        System.out.println("Maximo = " + maximo(numeros10A20));

        int[] numeros1A10 = arrayAleatorio(5, 1, 10);
        numeros1A10 = insertarAlFinal(numeros1A10, -1);
        System.out.println(Arrays.toString(numeros1A10));        
        System.out.println("Suma = " + suma(numeros1A10));
        System.out.println("Maximo = " + maximo(numeros1A10));
        
        int[] numeros100A199 = arrayAleatorio(10, 100, 199);
        System.out.println(Arrays.toString(numeros100A199));        
        System.out.println("Suma = " + suma(numeros100A199));
        System.out.println("Maximo = " + suma(numeros100A199));

    }


}
