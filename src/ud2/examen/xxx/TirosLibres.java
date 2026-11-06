package ud2.examen.xxx;

import java.util.Scanner;

public class TirosLibres {
    public static void main(String[] args) {
        final int MAX_FALLOS_SEGUIDOS = 3;
        final int MAX_LANZAMIENTOS = 20;
        final int UMBRAL_ACIERTOS = 70;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el resultado de los lanzamientos de tiros libres (0=fallo, 1=acierto): ");

        int numFallosSeguidos = 0;
        int numLanzamientos = 0;
        int numAciertos = 0;

        do {
            // Leer lanzamiento
            int lanzamiento = sc.nextInt();

            // Procesar : contar... 
            if (lanzamiento == 0) {
                numFallosSeguidos++;
            } else {
                numAciertos++;
                numFallosSeguidos = 0;
            }

            numLanzamientos++;

        } while (numFallosSeguidos < MAX_FALLOS_SEGUIDOS && numLanzamientos < MAX_LANZAMIENTOS);
        
        sc.close();

        // SALIDA
        double porcentajeAciertos = numAciertos / (double) numLanzamientos * 100;
        System.out.printf("%d lanzamientos, %d anotados, %.2f%%, %s supera %d%%", 
        numLanzamientos, 
        numAciertos, 
        porcentajeAciertos,
        porcentajeAciertos > UMBRAL_ACIERTOS ? "SI" : "NO",
        UMBRAL_ACIERTOS);


    }
}
