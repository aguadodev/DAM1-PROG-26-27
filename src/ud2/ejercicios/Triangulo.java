package ud2.ejercicios;

/**
 * @author: apesqfern
 * Triangulo de * según el número aportado por el usuario.
 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero n: ");
        int n = sc.nextInt();
        sc.close();

        imprimirTriangulo(n);

    }

    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            // Este se encarga de añadir espacio antes de los *
            // Este es un bucle que va a menos, se escribe menos veces
            for (int e = 1; e <= n - i; e++) {
                System.out.print(" ");
            }

            // Este pone el * con espacio siguiendole, para darle espacio al resto de *
            // Este es un bucle que va a más, se repite más veces
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
