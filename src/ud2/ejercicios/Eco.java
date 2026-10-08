package ud2.ejercicios;

import java.util.Scanner;

public class Eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Introduce un número N: ");
        int n = sc.nextInt();

        while (n > 0) {
            System.out.println("Eco");
            n--;
        }

    }
}
