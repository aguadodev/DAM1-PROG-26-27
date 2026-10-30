package ud2.ejercicios;

import java.util.Scanner;

/** @author Diego Méndez Villar **/

public class DecimalBinario {

    public static String decimalABinario(int n) {
        if (n == 0) {
            return "0";
        }

        boolean negativo = n < 0;
        long numero = Math.abs((long) n);

        String binario = "";

        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }

        if (negativo) {
            binario = "-" + binario;
        }

        return binario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        System.out.println(numero + " en binario es " + decimalABinario(numero));

        sc.close();
    }
}