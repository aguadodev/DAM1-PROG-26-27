

import java.util.Random;

public class SorteoAlumnadoDAM1Switch {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 31;

        Random rnd = new Random();
        int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;

        System.out.print("\nAlumn@ elegid@ (" + numeroElegido + ") -> ");

        switch (numeroElegido) {
            case 1 -> System.out.print("Juan A"); 
            case 2 -> System.out.print("Matías C"); 
            case 3 -> System.out.print("Pablo C"); 
            case 4 -> System.out.print("David D"); 
            case 5 -> System.out.print("Raúl E"); 
            case 6 -> System.out.print("David E"); 
            case 7 -> System.out.print("Marcos FC"); 
            case 8 -> System.out.print("Pelayo F"); 
            case 9 -> System.out.print("Marcos FS"); 
            case 10 -> System.out.print("Brais G"); 
            case 11 -> System.out.print("Fran L"); 
            case 12 -> System.out.print("Marco L"); 
            case 13 -> System.out.print("Maria M"); 
            case 14 -> System.out.print("Tomas M"); 
            case 15 -> System.out.print("Adán M"); 
            case 16 -> System.out.print("Daniel M"); 
            case 17 -> System.out.print("Diego M"); 
            case 18 -> System.out.print("Lunna M"); 
            case 19 -> System.out.print("Hendrix M"); 
            case 20 -> System.out.print("Alexandre M"); 
            case 21 -> System.out.print("Adrian N"); 
            case 22 -> System.out.print("Adrian P"); 
            case 23 -> System.out.print("Jorge P"); 
            case 24 -> System.out.print("Martín R"); 
            case 25 -> System.out.print("Juan S"); 
            case 26 -> System.out.print("Martín S"); 
            case 27 -> System.out.print("Aiko S"); 
            case 28 -> System.out.print("Angel S"); 
            case 29 -> System.out.print("Darianys V"); 
            case 30 -> System.out.print("Yubay W"); 
            case 31 -> System.out.println("Miguel L");            
        
            default -> System.out.println("Número erróneo. No existe el alumno/a " + numeroElegido);
                
        }

        System.out.println("\n");
    }
}
