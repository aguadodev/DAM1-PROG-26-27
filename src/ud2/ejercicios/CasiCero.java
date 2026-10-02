package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author mmartbarr
 *         CasiCero
 */

public class CasiCero {
    public static void main(String[] args) {
        System.out.print("Introduzca un número decimal-> ");
        Scanner sc = new Scanner(System.in);
        double numeroDecimal = sc.nextDouble();
        sc.close();

        if (-1 < numeroDecimal && numeroDecimal < 1 && numeroDecimal != 0) {
            System.out.println(numeroDecimal + " es un casi 0.");
        } else {
            System.out.println(numeroDecimal + " no es un casi 0.");

        }

    }

}
