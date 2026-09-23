package ud1;

import java.util.Scanner;

/** @author Jpineport */

public class SegundosAHoras {
    public static void main(String[] args) {

        // Entrada y declaracion de variables.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de segundos:");
        int numeroDeSegundos = sc.nextInt();
        sc.close();

        // Declaracion de varibles + operaciones.
        int horas = numeroDeSegundos / 3600;
        int minutos = numeroDeSegundos % 3600 / 60;
        int segundos = numeroDeSegundos % 60;

        // Salida
        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
    }

}