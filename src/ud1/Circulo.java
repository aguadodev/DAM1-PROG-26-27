package ud1;

import java.util.Scanner;

/**
 * @author Fran
 */

public class Circulo {
    public static void main(String[] args) {
        // Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double r = sc.nextDouble();
        sc.close();

        //Proceso
        double p = 2 * Math.PI * r;
        double a = Math.PI * Math.pow(r, 2);

        // Salida
        System.out.printf("El perímetro del círculo es: %.2f %n", p);
        System.out.printf("El área del círculo es: %.2f", a);
    }
}
