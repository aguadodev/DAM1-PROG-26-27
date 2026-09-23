package ud1;

import java.util.Scanner;

/** @author Diego Méndez Villar **/

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca las coordenadas de los dos puntos
        System.out.print("Introduce la coordenada x del primer punto: ");
        double x1 = sc.nextDouble();
        System.out.print("Introduce la coordenada y del primer punto: ");
        double y1 = sc.nextDouble();
        System.out.print("Introduce la coordenada x del segundo punto: ");
        double x2 = sc.nextDouble();
        System.out.print("Introduce la coordenada y del segundo punto: ");
        double y2 = sc.nextDouble();
        sc.close();

        // Calculamos la distancia entre los dos puntos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Salida de datos
        System.out.printf("La distancia entre los dos puntos es: %.2f%n", distancia);

    }

}
