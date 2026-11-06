

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SorteoAlumnadoDAM1Expresion {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 31;

        Random rnd = new Random();
        int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;

        System.out.println("\nAlumn@ elegid@ (" + numeroElegido + ") -> ");

        String[] alumnos = ["Juan A","Matías C","Pablo C","David D","Raúl E","David E",
        "Marcos FC","Pelayo F","Marcos FS","Brais G","Fran L","Marco L","Maria M","Tomas M","Adán M","Daniel M","Diego M",
        "Lunna M","Hendrix M","Alexandre M","Adrian N","Adrian P","Jorge P","Martín R","Juan S","Martín S","Aiko S","Angel S","Darianys V","Yubay W","Miguel L"];

        List<String> lista = Arrays.asList(alumnos);
        Collections.shuffle(lista);
        lista.forEach(System.out::println);
        

    }
}
