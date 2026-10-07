package ud2.ejercicios;

import java.util.Scanner;

public class ContarCifras2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        sc.close();

        if (num >= (-99999) && num <= 99999) {
            System.out.println("El número esta dentro del rango a evaluar");
            if (num > -10 && num < 10) {
                System.out.println("El número tiene 1 cifra");
            } else if (num <= -10 && num > -100 || num >= 10 && num < 100) {
                System.out.println("El número tiene 2 cifras");
            } else if (num <= -100 && num > -1000 || num >= 100 && num < 1000) {
                System.out.println("El número tiene 3 cifras");
            } else if (num <= -1000 && num > -10000 || num >= 1000 && num < 10000) {
                System.out.println("El número tiene 4 cifras");
            } else if (num <= -10000 && num > -100000 || num >= 10000 && num < 100000) {
                System.out.println("El número tiene 5 cifras");
            }
        } else {
            System.out.println("El número esta fuera del rango a evaluar");
        }
    }
}
