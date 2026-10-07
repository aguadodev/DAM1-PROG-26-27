package ud2.ejercicios;

import java.util.Scanner;

/** @author MFallCarr */

public class UnSegundoMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe las horas: ");
        int hora = sc.nextInt();
        System.out.print("Escribe los minutos: ");
        int minuto = sc.nextInt();
        System.out.print("Escribe los segundos: ");
        int segundo = sc.nextInt();
        sc.close();

        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;

            if (minuto == 60) {
                minuto = 0;
                hora++;

                if (hora == 24)
                    hora = 0;
            }
        }

        System.out.printf("Hora incrementada: %02d:%02d:%02d \n", hora, minuto, segundo);

    }
}