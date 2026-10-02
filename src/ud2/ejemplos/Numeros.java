package ud2.ejemplos;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos números enteros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        

        if (a == b) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        if (a > b) {
            System.out.println("El primer número (" + a + ") es mayor");
            System.out.println("Números ordenados de mayor a menor: " + a + ", " + b);
        } else if (a < b) {
            System.out.println("El segundo número (" + b + ") es mayor");
            System.out.println("Números ordenados de mayor a menor: " + b + ", " + a);
        } else {
            System.out.println("Los números son iguales");
        }

        System.out.println("Nombre: ");
        //sc.nextLine();
        String nombre = sc.next();
        
        if (nombre.equals("Oscar")) {
            System.out.println("Hola profe");
        }



        /*
        boolean condicion1 = true;
        boolean condicion2 = false;
        boolean condicion3 = true;
        
        if (condicion1) {
            // Código
        } else if (condicion2) {

        } else if (condicion3) {

        } else {

        }
         */
        sc.close();
    }
}
