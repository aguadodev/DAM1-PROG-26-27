package ud2.ejercicios;

import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
