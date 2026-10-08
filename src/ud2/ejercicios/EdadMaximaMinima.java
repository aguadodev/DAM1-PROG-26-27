package ud2.ejercicios;

/**
 * @author: apesqfern
*/

import java.util.Scanner;

public class EdadMaximaMinima {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce edades de alumnado: (-1 para terminar) ");

        // Lectura anticipada
        int edad = sc.nextInt();
        int edad_max = edad == -1 ? 0 : edad;
        int edad_min = edad == -1 ? 0 : edad;

        // Epieza el bucle
        while (edad != -1) {
            // Aqui comparamos para ver si edad es mayor que la que teniamos al principio
            edad_max = edad > edad_max ? edad : edad_max;
            // Aqui comparamos para ver si edad es menor que la que teniamos al principio
            edad_min = edad < edad_min ? edad : edad_min;
            System.out.print("Introduce otra edad, recuerda -1 para finalizar: ");
            edad = sc.nextInt();
        }
        sc.close();
        System.out.println("==========================");
        System.out.println("La edad máxima es: " + edad_max);
        System.out.println("La edad mínima es: " + edad_min);
        System.out.println("==========================");
    }
}
