package ud2.excepciones;

import java.util.Scanner;

public class FuncionLeerEntero {
    

    public static int leerEntero(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Entrada no válida. Escribe un número entero");            
        }

        return sc.nextInt();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = leerEntero(sc, "Escribe un número entero: ");
        System.out.println("Escribiste: " + numero);

        int numero2 = leerEntero(sc, "Escribe otro número: ");
        System.out.println("Escribiste: " + numero2);

        sc.close();

    }
}
