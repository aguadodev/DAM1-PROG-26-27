package ud3.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class OrdenIverso {
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
        
        // Imprimir en orden inverso
        for (int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nFin del programa");
    }
}
