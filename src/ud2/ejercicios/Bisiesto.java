package ud2.ejercicios;

import java.util.Scanner;

/** @author Diego Méndez Villar **/

public class Bisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año que quieras comprobar si es o ha sido bisiesto:  ");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 400 == 0 || numero % 4 == 0 && numero % 100 != 0) {

            System.out.println("El año " + numero + " es un año bisiesto");

        } else {

            System.out.println("El año " + numero + " no es un año bisiesto");
        }
    }
}
