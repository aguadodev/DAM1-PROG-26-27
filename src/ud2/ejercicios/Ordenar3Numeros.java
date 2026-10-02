package ud2.ejercicios;

import java.util.Scanner;

/** @author Matías Centeno Plá */
public class Ordenar3Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (a > b && b > c) {
            System.out.println("Primero: " + a + " Segundo: " + b + " Tercero: " + c);
        } else if (b > a && a > c) {
            System.out.println("Primero: " + b + " Segundo: " + a + " Tercero: " + c);

        } else if (c > a && a > b) {
            System.out.println("Primero: " + c + " Segundo: " + a + " Tercero: " + b);
        } else if (a > c && c > b) {
            System.out.println("Primero: " + a + " Segundo: " + c + " Tercero: " + b);
        } else if (b > c && c > a) {
            System.out.println("Primero: " + b + " Segundo: " + c + " Tercero: " + a);
        } else if (c > b && b > a) {
            System.out.println("Primero: " + c + " Segundo: " + b + " Tercero: " + a);

        } else if (a == b && a == c) {
            System.out.println("Los 3 son iguales");

        } else if (a == b && a > c) {
            System.out.println("Primeros: " + a + " y " + b + " Segundo: " + c);
        } else if (a == b && a < c) {
            System.out.println("Primero: " + c + " Segundos: " + a + " y " + b);
        } else if (b == c && b > a) {
            System.out.println("Primeros: " + b + " y " + c + " Segundo: " + a);
        } else if (b == c && b < a) {
            System.out.println("Primero: " + a + " Segundos: " + b + " y " + c);
        }

    }
}
