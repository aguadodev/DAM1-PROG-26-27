package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Escribe un número entero: ");
            int numero = sc.nextInt();

            System.out.print("Escribe otro número entero: ");

            int numero2 = sc.nextInt();

            System.out.println("a / b = " + numero / numero2);

            /*
            System.out.print("Escribe una letra: ");
            char letra = sc.nextLine().charAt(0);
            System.out.println("Has elegido la letra " + letra);

            // recursivoInfinito();        
            */

            Integer.parseInt("45j");

            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Has introducido algo que no es un número entero: " + e.getMessage());            
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser cero. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado...");
        } finally {
            System.out.println("Esto se ejecuta siempre con o sin excepción.");
        }


        

        System.out.println("Fin del programa");
    }

    public static void recursivoInfinito() {
        double d = 0.0;
        recursivoInfinito();
    }
}
