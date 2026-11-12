package ud3.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class AleatoriosSuma {
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
        System.out.println(numeros);
        System.out.println(Arrays.toString(numeros));

        // Calcular Suma
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("Suma: " + suma);

        System.out.println("Fin del programa");
    }
}
