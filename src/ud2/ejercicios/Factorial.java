package ud2.ejercicios;

import java.util.Scanner;

/** @author MFallCarr */

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("El factorial de " + n + " es " + n + "! = " + factorial(n));

    }

    public static long factorial(long n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
