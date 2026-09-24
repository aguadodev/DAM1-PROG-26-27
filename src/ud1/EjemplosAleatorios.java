package ud1;

import java.util.Random;

public class EjemplosAleatorios {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 30;

        // Generando números aleatorios con Math.random()
        System.out.println(Math.random());
        System.out.println(Math.random() * NUM_ALUMNOS);
        // Genera un número entero aleatorio entre 1 y NUM_ALUMNOS
        int numAleatorio = (int) (Math.random() * NUM_ALUMNOS + 1);
        System.out.println(numAleatorio);

        // Generando números aleatorios con
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(NUM_ALUMNOS) + 1);
        System.out.println(rnd.nextInt(1, NUM_ALUMNOS + 1));
    }
}
