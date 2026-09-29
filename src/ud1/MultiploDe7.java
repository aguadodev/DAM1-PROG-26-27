package ud1;

import java.util.Scanner;

/** @author Jpineport */

public class MultiploDe7 {

    public static void main(String[] args) {

        //Input + variable declaration.

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce un numero entero : ");
        int num = sc.nextInt();
        sc.close();

        // Output + operations.

        String numero = "\nA " + num + " hay que sumarle " + ((-(num % 7) + 7) % 7) + " para que sea multiplo de 7\n";
        System.out.println(numero);
    }

}