package ud2.excepciones;

import java.util.Scanner;

public class LeerHastaCorrectoSinTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Escribe un número entero: ");
        while (!sc.hasNextInt()) {
            String str = sc.next();
            System.out.println(str + " NO es un entero");            
        }
        
        System.out.println("es un entero");
        numero = sc.nextInt();
        
        System.out.println("Número introducido: " + numero);
        sc.close();
    }
}
