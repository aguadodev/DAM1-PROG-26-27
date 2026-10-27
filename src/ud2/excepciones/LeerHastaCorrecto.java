package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean lecturaCorrecta = false;
        System.out.println("Escribe un número entero: ");
        do {
            try {
                numero = sc.nextInt();
                lecturaCorrecta = true;
            } catch (InputMismatchException  e) {
                // Lectura incorrecta
                System.out.print("Entrada no válida. Introduce un número entero: ");
                sc.nextLine();
            }
        } while (!lecturaCorrecta);
        
        System.out.println("Número introducido: " + numero);
        sc.close();
    }
}
