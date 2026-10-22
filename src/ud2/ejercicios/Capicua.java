package ud2.ejercicios;

import java.util.Scanner;

/** @author David Dorado */

public class Capicua {
    public static boolean esCapicua(long n) {
        long digito1 = n;
        long digito2 = n;
        long digito3 = n;
        long digito4 = n;

        if (n < 10) {
            return false;
        } else if (n >= 10 && n <= 99) {
            digito1 /= 10;
            digito2 %= 10;
        } else if (n >= 100 && n <= 999) {
            digito1 /= 100;
            digito2 %= 10;
        } else {
            digito1 /= 1000;
            digito2 = n / 100 % 10;
            digito3 = n / 10 % 10;
            digito4 %= 10;
        }

        if (n < 1000 && digito1 == digito2 || digito1 == digito4 && digito2 == digito3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero del 0 al 9999: ");
        long numero = sc.nextInt();
        if (numero >= 0 && numero <= 9999) {
            System.out.println(esCapicua(numero));
        } else {
            System.out.println("Fuera del rango");
        }

        sc.close();
    }
}
