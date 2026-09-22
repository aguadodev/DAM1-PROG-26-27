package ud1;

import java.util.Scanner;

/**
 * @author Lunna Mendonça Miranda
 */

/*
    ENUNCIADO: 
    Programa que pida un número entero al usuario y que indique si es par mediante un 
    literal booleano (true o false). 
*/

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserte un número entero: ");
        int n = sc.nextInt();

        sc.close();

        System.out.println((n % 2 == 0) ? "Es par" : "Es impar");
    }
}
