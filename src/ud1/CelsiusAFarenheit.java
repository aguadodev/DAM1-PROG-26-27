package ud1;
/**
 * @author Martín Rosales
 */

import java.util.Scanner;

public class CelsiusAFarenheit {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce cuantos grados celsius hay: ");
    double celsius = sc.nextDouble();
    sc.close();

    Double Farenheit = celsius * 9/5 + 32;
    System.out.println("La temperatura pasada a Farenheit es: " + Farenheit);
 }
}
