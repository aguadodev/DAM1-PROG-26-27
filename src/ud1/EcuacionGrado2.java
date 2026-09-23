package ud1;

import java.util.Scanner;

/** @author Aiko **/

public class EcuacionGrado2 {
    public static void main(String[] args) {
        System.out.println("Este es un programa para resolver ecuaciones cuadráticas de la forma ax^2 + bx + c = 0");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el coeficiente c: ");
        double c = sc.nextDouble();

        sc.close();

        double discriminante = b * b - 4 * a * c;
        System.out.println("El discriminante es: " + discriminante);

        String msg = discriminante >= 0 ? "La ecuación tiene soluciones reales." : "La ecuación no tiene soluciones reales.";
        System.out.println(msg);

        boolean haySoluciones = discriminante >= 0 && a != 0;

        msg = haySoluciones ? "Dos soluciones: \n - Solución1: " + (-b + Math.sqrt(discriminante)) / (2 * a)
         + "\n - Solución2: " + (-b - Math.sqrt(discriminante)) / (2 * a) : "ERROR: División por cero";

        System.out.println(msg);
    }
}