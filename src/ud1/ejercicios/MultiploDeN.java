package ud1.ejercicios;

import java.util.Scanner;

/** @author Jpineport */

public class MultiploDeN  {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce n : ");
    int n = sc.nextInt();
    System.out.print("Introduce m : ");
    int m = sc.nextInt();
    sc.close();

    String resultado = m == 0
        ? "0 solo es multiplo de 0"
        : "Tienes que sumar " + ((-(n % m) + m) % m) + " para que " + n + " sea multiplo de " + m;
    System.out.printf(resultado);
  }
}