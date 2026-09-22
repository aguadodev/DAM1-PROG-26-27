package ud1;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Escribe un nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println(nombre);

        sc.close();
        System.out.println("FIN DE LECTURA");




        // Error: Una vez cerrado el Scanner anterior ya no podemos leer de la entrada estándar
        Scanner se = new Scanner(System.in);
        int num2 = se.nextInt();
        System.out.println(num2);
        se.close();


    }
}
