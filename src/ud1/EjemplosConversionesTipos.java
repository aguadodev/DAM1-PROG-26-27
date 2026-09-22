package ud1;

import java.util.Scanner;

public class EjemplosConversionesTipos {
    public static void main(String[] args) {
        double a = 56;
        System.out.println(a);

        int b = (int) (5.6 + 4.5);
        System.out.println(b);

        float c = 37453872452438l;
        System.out.println(c);

        int numEntero = Integer.parseInt("345345");
        System.out.println(numEntero + 5);

        double numReal = Double.parseDouble("3.45345E3");
        System.out.println(numReal + 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una letra: ");
        char letra = sc.nextLine().charAt(0);
        sc.close();
        System.out.println(letra);

    }
}
