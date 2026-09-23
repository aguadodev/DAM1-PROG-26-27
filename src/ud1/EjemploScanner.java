package ud1;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Escribe un nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println(nombre);

        System.out.print("Introduce un carácter: ");
        char caracter = sc.next().charAt(0); // se obtiene el primer carácter del String introducido por teclado
        System.out.println("Carácter introducido -> " + caracter);

        
        sc.close();
        System.out.println("FIN DE LECTURA");

        // Error: Una vez cerrado el Scanner anterior ya no podemos leer de la entrada
        // estándar
        Scanner se = new Scanner(System.in);
        int num2 = se.nextInt();
        System.out.println(num2);
        se.close();

    }
}
