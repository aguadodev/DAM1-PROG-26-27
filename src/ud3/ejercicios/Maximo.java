package ud3.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Maximo {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        final int MAX_RANDOM = 100;
        int[] numeros = new int[LONGITUD];
        Random rnd = new Random();

        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(MAX_RANDOM) + 1;
        }

        // Imprimir Array
        System.out.println(Arrays.toString(numeros));            

        // Calcular el máximo
        /*int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo)
                maximo = numero;
        }

        System.out.println("Máximo: " + maximo);*/


        // Calcular el máximo y su posición
        int maximo = -1;
        int posicionMaximo = -1;
        for (int i = 0; i < numeros.length; i++) {
            // Inicializo el máximo al primer elemento y para los demás comparo si es mayor que el máximo
            if (i == 0 || numeros[i] > maximo) {
                maximo = numeros[i];
                posicionMaximo = i;                
            }               
        }

        System.out.println("Máximo: " + maximo + " en la posición " + posicionMaximo);


    }
}
