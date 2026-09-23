package ud1;

import java.util.Scanner;

/** @author Polo **/

public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Base del triángulo (cm): ");
        double b = sc.nextDouble();

        System.out.println("Altura del triángulo (cm): ");
        double h = sc.nextDouble();
        sc.close();

        double area = b * h / 2;
        System.out.println("El área del triángulo es " + area + " cm.");

    }
}
