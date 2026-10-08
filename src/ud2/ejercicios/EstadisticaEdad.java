package ud2.ejercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author Tomás Martínez Gallo
 * 
 * 
 *         EstadisticaEdad
 */
public class EstadisticaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad:");
        int edad = sc.nextInt();
        int contEdad = 0;
        int contMayor = 0;
        int sumaEdad = 0;
        while (edad >= 0) {
            contEdad++;
            sumaEdad = sumaEdad + edad;
            if (edad >= 18) {
                contMayor++;
            }
            System.out.print("Edad: ");
            edad = sc.nextInt();
        }
        System.out.println("Número de alumnos: " + contEdad);
        System.out.println("Suma edades: " + sumaEdad);
        double media = (double) sumaEdad / contEdad;
        System.out.println("Media edad: " + media);
        System.out.println("Mayores edad: " + contMayor);

        sc.close();
    }
}
