package ud2.ejercicios;

import java.util.Scanner;

public class NotaEnTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota del 1 al 10: ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Has sacado un insuficiente");
                break;
            case 5:
                System.out.println("Has sacado un suficiente");
                break;
            case 6:
                System.out.println("Has sacado un bien");
                break;                
            case 7, 8:
                System.out.println("Has sacado un notable");
                break;                
            case 9, 10:
                System.out.println("Has sacado un sobresaliente");
                break;                
            default:
                System.out.println("ERROR");

        }

    }
}
