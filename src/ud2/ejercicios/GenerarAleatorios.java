package ud2.ejercicios;

import java.util.Random;

/** @author Raúl Entenza Villanueva (rentevill)*/

public class GenerarAleatorios {
    public static void main(String[] args) {
        getAleatorios(7, 1, 9999);
    }

    public static void getAleatorios(int cant, int min, int max) {

        Random rng = new Random();
        int serie = 1;

        for (int i = 0; i < cant; i++) {
            System.out.println("==== Serie " + serie + " ====");
            System.out.println(rng.nextInt(min, max + 1));
            serie++;
        }
    }
}
