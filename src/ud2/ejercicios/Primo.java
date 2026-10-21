package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         Primo
 */

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(esPrimo(n));
    }

    public static boolean esPrimo(int n) {
        if (n < 2) 
            return false;    

        for (int i = 2; i <= n / 2; i++) 
            if (n % i == 0) 
                return false;

        return true;
    }
}
