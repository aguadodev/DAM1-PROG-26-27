package ud2.examen.xxx;

import java.util.Scanner;

public class Avituallamiento {
    public static void main(String[] args) {
        int pkAvituallamiento = 0;
        int kmsLlanoAvituallamiento = 0;

        int pkLlanoActual = 0;
        int kmsLlanoActual = 0;
        int pkActual = 0;

        Scanner sc = new Scanner((System.in));
        System.out.print("Introduce la altitud de los PKs (-1 para terminar): ");

        int altitudAnterior = -1;
        // Lectura adelantada
        int altitud = sc.nextInt();
        while (altitud != -1) {
            if (pkActual > 0) {
                if (altitud == altitudAnterior) { 
                    // Llano    
                    if (kmsLlanoActual == 0)                
                        pkLlanoActual = pkActual - 1;
                    kmsLlanoActual++;    
                    
                    if (kmsLlanoActual > kmsLlanoAvituallamiento) {
                        // Actualizo el llano de avituallamiento si encuentro un llano más largo
                        pkAvituallamiento = pkLlanoActual;
                        kmsLlanoAvituallamiento = kmsLlanoActual;
                    }                    
                } else { 
                    // Subida o bajada
                    kmsLlanoActual = 0;
                }
            } 

            // Nueva lectura
            altitudAnterior = altitud;
            altitud = sc.nextInt();
            pkActual++;
        }
        sc.close();

        // Salida
        System.out.println(pkAvituallamiento + " " + kmsLlanoAvituallamiento);

    }
}
