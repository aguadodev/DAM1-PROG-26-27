

import java.util.Random;

public class SorteoAlumnadoDAM1Yield {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 31;

        Random rnd = new Random();
        int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;

        System.out.println("\nAlumn@ elegid@ (" + numeroElegido + ") -> ");

        String elegido = switch (numeroElegido) {
            case 1 -> { yield "Juan A"; }
            case 2 -> { yield "Matías C"; }
            case 3 -> { yield "Pablo C"; }
            case 4 -> { yield "David D"; } 
            case 5 -> { yield "Raúl E"; } 
            case 6 -> { yield "David E"; } 
            case 7 -> { yield "Marcos FC"; } 
            case 8 -> { yield "Pelayo F"; } 
            case 9 -> { yield "Marcos FS"; } 
            case 10 -> { yield "Brais G"; } 
            case 11 -> { yield "Fran L"; } 
            case 12 -> { yield "Marco L"; } 
            case 13 -> { yield "Maria M"; } 
            case 14 -> { yield "Tomas M"; } 
            case 15 -> { yield "Adán M"; } 
            case 16 -> { yield "Daniel M"; } 
            case 17 -> { yield "Diego M"; } 
            case 18 -> { yield "Lunna M"; } 
            case 19 -> { yield "Hendrix M"; } 
            case 20 -> { yield "Alexandre M"; } 
            case 21 -> { yield "Adrian N"; } 
            case 22 -> { yield "Adrian P"; } 
            case 23 -> { yield "Jorge P"; } 
            case 24 -> { yield "Martín R"; } 
            case 25 -> { yield "Juan S"; } 
            case 26 -> { yield "Martín S"; } 
            case 27 -> { yield "Aiko S"; } 
            case 28 -> { yield "Angel S"; } 
            case 29 -> { yield "Darianys V"; } 
            case 30 -> { yield "Yubay W"; } 
            case 31 -> { yield "Miguel L"; }            
        
            default -> { yield "Número erróneo. No existe el alumno/a " + numeroElegido; }                
        };

        System.out.println("Alumn@ elegid@: " + elegido);

        System.out.println("\n");
    }
}
