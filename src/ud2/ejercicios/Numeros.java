package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Juan **/

public class Numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Es un número par");
            } else {
                System.out.println("Es un número impar");
            }
            if (num > 0) {
                System.out.println("Es un número positivo");
            } else {
                System.out.println("Es un número negativo");
            }
            System.out.println("El número al cuadrado es: " + num * num);
            System.out.print("Introduce otro número (0 para parar): ");
            num = sc.nextInt();
        }
        sc.close();
        System.out.println("Vuelve pronto!");
    }


}
