package ud2.ejercicios;

import java.util.Scanner;

/** @author pcorealva */

public class ValidarDNIPablo {
     public static char letraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número del DNI (8 cifras): ");
        int dni = sc.nextInt();

        if (dni < 0 || dni > 99999999) {
            System.out.println("Número de DNI no válido");
        } else {
            System.out.println("Letra del DNI: " + letraDNI(dni));
        }

        sc.close();
    }
}
