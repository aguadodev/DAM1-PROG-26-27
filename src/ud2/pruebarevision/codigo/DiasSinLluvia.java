package ud2.pruebarevision.codigo;

import java.util.Scanner;

public class DiasSinLluvia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int rachaActual = 0;
        int inicioActual = 0;
        int mejorRacha = 0;
        int inicioMejor = 0;

        int litros = sc.nextInt();
        while (litros != -1) {
            dia++;
            if (litros == 0) {
                if (rachaActual == 0) {
                    inicioActual = dia;
                }
                rachaActual++;
            } else {
                if (rachaActual >= mejorRacha) {
                    mejorRacha = rachaActual;
                    inicioMejor = inicioActual;
                }
                rachaActual = 0;
            }
            litros = sc.nextInt();
        }
        sc.close();

        System.out.println(inicioMejor + " " + mejorRacha);
    }
}
