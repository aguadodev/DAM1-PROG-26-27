

import java.util.Random;

public class SorteoAlumnadoDAM1 {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 30;

        Random rnd = new Random();
        int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;

        System.out.print("\nAlumn@ elegid@ (" + numeroElegido + "): ");

        System.out.print(numeroElegido == 1 ? "Juan A" : "");
        System.out.print(numeroElegido == 2 ? "Matías" : "");
        System.out.print(numeroElegido == 3 ? "Pablo C" : "");
        System.out.print(numeroElegido == 4 ? "David D" : "");
        System.out.print(numeroElegido == 5 ? "Raúl E" : "");
        System.out.print(numeroElegido == 6 ? "David E" : "");
        System.out.print(numeroElegido == 7 ? "Marcos FC" : "");
        System.out.print(numeroElegido == 8 ? "Pelayo F" : "");
        System.out.print(numeroElegido == 9 ? "Marcos FS" : "");
        System.out.print(numeroElegido == 10 ? "Brais G" : "");
        System.out.print(numeroElegido == 11 ? "Fran L" : "");
        System.out.print(numeroElegido == 12 ? "Marco L" : "");
        System.out.print(numeroElegido == 13 ? "Maria M" : "");
        System.out.print(numeroElegido == 14 ? "Tomas M" : "");
        System.out.print(numeroElegido == 15 ? "Adán M" : "");
        System.out.print(numeroElegido == 16 ? "Daniel M" : "");
        System.out.print(numeroElegido == 17 ? "Diego M" : "");
        System.out.print(numeroElegido == 18 ? "Lunna M" : "");
        System.out.print(numeroElegido == 19 ? "Hendrix M" : "");
        System.out.print(numeroElegido == 20 ? "Alexandre M" : "");
        System.out.print(numeroElegido == 21 ? "Adrian N" : "");
        System.out.print(numeroElegido == 22 ? "Adrian P" : "");
        System.out.print(numeroElegido == 23 ? "Jorge P" : "");
        System.out.print(numeroElegido == 24 ? "Martín R" : "");
        System.out.print(numeroElegido == 25 ? "Juan S" : "");
        System.out.print(numeroElegido == 26 ? "Martín S" : "");
        System.out.print(numeroElegido == 27 ? "Aiko S" : "");
        System.out.print(numeroElegido == 28 ? "Angel S" : "");
        System.out.print(numeroElegido == 29 ? "Darianys V" : "");
        System.out.print(numeroElegido == 30 ? "Yubay W" : "");

        System.out.println("\n");
    }
}
