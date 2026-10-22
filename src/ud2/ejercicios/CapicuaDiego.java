package ud2.ejercicios;

import java.util.Scanner;

/** @autor Diego Méndez Villar **/

public class CapicuaDiego
 {

    public static boolean esCapicua(long numero) {
        return numero == invertir(numero);
    }

    public static long invertir(long numero) {
        long invertido = 0;
        while (numero > 0) {
            long digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextInt();
        numero = Math.abs(numero);

        sc.close();

        if (esCapicua(numero)) {
            System.out.println("El número es capicúa");

        } else {
            System.out.println("El número no es capicúa");

        }
        System.out.print(invertir(numero));
    }

}