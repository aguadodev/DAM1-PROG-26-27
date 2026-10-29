package ud2.ejercicios;

import java.util.Scanner;

/** @author Raúl Entenza Villanueva */

public class GradosRadianes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los grados a convertir: ");
        double grados = sc.nextDouble();
        System.out.println(grados + " resulta en: " + gradosRadianes(grados));

    }

    public static double gradosRadianes(double grados) {
        return grados % 360 * Math.PI / 180;
    }
}
