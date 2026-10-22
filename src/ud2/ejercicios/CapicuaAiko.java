package ud2.ejercicios;

import java.util.Scanner;

/** @author Aiko Serrano Soto */

public class CapicuaAiko {
    public static boolean esCapicua(long n) {
        String num = String.valueOf(n);
        int longitud = num.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (num.charAt(i) != num.charAt(longitud - ( i + 1 ))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        Long num = sc.nextLong();
        sc.close();
        System.out.println("La afirmación de que el " + num + " es capiccua es " + esCapicua(num));
    }
}
