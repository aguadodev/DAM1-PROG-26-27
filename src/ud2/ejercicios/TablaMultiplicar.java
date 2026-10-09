package ud2.ejercicios;

/** @author Jpineport */

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("%sTabla de multiplicar de : %s", "\033[32m", "\033[33m");
        int num = sc.nextInt();
        sc.close();

        if (num > 0 && num < 11) {
            for (int i = 1; i < 11; i++) {
                System.out.printf("\n %d x %d = %d", num, i, (num * i));
            }
        } else {
            System.out.println("\033[31m" + "Tienes que escribir un número entre 1 y 10");
        }
        System.out.printf("%s", "\033[0m");
    }

}
