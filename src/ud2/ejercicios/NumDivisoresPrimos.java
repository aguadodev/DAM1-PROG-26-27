package ud2.ejercicios;

import java.util.Scanner;

/**
 * NumDivisoresPrimos
 */
public class NumDivisoresPrimos {

    public static boolean esPrimo(int n) {
        boolean primo = true;

        if (n < 2) {
            primo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }
        }

        return primo;
    }

    public static int numDivisoresPrimos(int n) {
        int contador = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (esPrimo(i)) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt(); // Aquí se guarda el número que escriba el usuario

        System.out.println("El número de divisores primos de " + n + " es: "
                + numDivisoresPrimos(n));

        sc.close();
    }
}