package ud2.ejercicios;

import java.util.Scanner;

/** @author Yubay */

public class FechaCorrecta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();
        sc.close();
        
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        int diasMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {yield 31;}
            case 4, 6, 9, 11 -> {yield 30;}
            case 2 -> {yield bisiesto ? 29 : 28;}
            default -> {yield 0;}
        };
        if (diasMes == 0) {
            System.out.println("El mes no es válido");
        } else if (dia >= 1 && dia <= diasMes) {
                System.out.println("La fecha es correcta.");
                System.out.printf("%02d/%02d/%04d%n", dia, mes, anio);
            } else {
                System.out.println("La fecha no es correcta.");
            }
        }   
}