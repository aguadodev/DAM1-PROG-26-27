
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

        String[] alumnos = { "Juan A", "Matías C", "Pablo C", "David D", "Raúl E", "David E",
                "Marcos FC", "Pelayo F", "Marcos FS", "Brais G", "Fran L", "Marco L", "Maria M", "Tomas M", "Adán M",
                "Daniel M", "Diego M",
                "Lunna M", "Hendrix M", "Alexandre M", "Adrian N", "Adrian P", "Jorge P", "Martín R", "Juan S",
                "Martín S", "Aiko S", "Angel S", "Darianys V", "Yubay W", "Miguel L" };
        
        imprimirAlumnos(alumnos);

        alumnos = matricularAlumno(alumnos, "Pepe");

        imprimirSinIndice(alumnos);

        System.out.println(Arrays.toString(alumnos));

    }

    private static String[] matricularAlumno(String[] alumnos, String alumnoNuevo) {
        String[] alumnosAmpliado = new String[alumnos.length + 1];
        // Copiar elementos del array anterior al nuevo
        for (int i = 0; i < alumnos.length; i++) {
            alumnosAmpliado[i] = alumnos[i];
        }
        alumnosAmpliado[alumnosAmpliado.length - 1] = alumnoNuevo;

        return alumnosAmpliado;
    }

    static void imprimirSinIndice(String[] t) {
        for (String alumno : t) {
            System.out.println(alumno);
        }
    }

    private static void imprimirAlumnos(String[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(i + " - " + t[i]);
        }
    }
}
