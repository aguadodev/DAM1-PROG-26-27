package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fran
 *         IMC
 */

public class IMC {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        clasificacion(imc(getKg(), getCm()));
    }

    static void clasificacion(double imc) {
        if (imc < 18.50) {
            System.out.println("Bajo Peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }

    static double getCm() {
        double cm = 0;
        boolean si = true;
        while (si) {
            try {
                System.out.print("Introduce los CM: ");
                cm = sc.nextDouble();
                si = false;
                return cm;
            } catch (InputMismatchException e) {
                System.out.println("No se aceptan letras o caracteres especiales");
                sc.next();
                si = true;
            }
        }

        return cm;
    }

    private static double getKg() {
        double kg = 0;
        boolean si = true;
        while (si) {
            try {
                System.out.print("Introduce los KG: ");
                kg = sc.nextDouble();
                si = false;
                return kg;
            } catch (InputMismatchException e) {
                System.out.println("No se aceptan letras o caracteres especiales");
                sc.next();
                si = true;
            }
        }

        return kg;

    }

    static double imc(double kg, double cm) {

        if (kg >= 20 && kg <= 300 && cm >= 50 && cm <= 250) {
            double imc = kg / Math.pow(cm / 100, 2);
            return imc;
        } else {
            System.out.println("Valores fuera de rango, inténtelo de nuevo: ");
            return imc(getKg(), getCm());
        }

    }

}
