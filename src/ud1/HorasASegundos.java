package ud1;
/**
 * @author Darianys Rosales
 */

import java.util.Scanner;

public class HorasASegundos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas (formato de 24h): ");
        int hora = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();
        sc.close();

        int horasMinutos = hora * 60 + minutos;
        int minutosSeg = horasMinutos * 60 + segundos;
        
        System.out.print("Total de segundos: " + minutosSeg);
    }
}
