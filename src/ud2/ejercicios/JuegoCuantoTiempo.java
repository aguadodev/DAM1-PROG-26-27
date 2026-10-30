package ud2.ejercicios;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

/** @author Juan **/
public class JuegoCuantoTiempo {
    public static void main(String[] args) {
        final int MINIMO_SEGUNDOS = 5;
        final int MAXIMO_SEGUNDOS = 30;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int segundosAleatorios = rnd.nextInt(MINIMO_SEGUNDOS, MAXIMO_SEGUNDOS + 1);

        System.out.println("Pulsa Enter cuando hayan trasncurrido " + segundosAleatorios + " segundos.");
        LocalTime primerTiempo = LocalTime.now();
        int segundosIniciales = primerTiempo.getSecond();
        int minutosIniciales = primerTiempo.getMinute();
        sc.nextLine();
        sc.close();
        LocalTime segundoTiempo = LocalTime.now();
        int segundosFinales = segundoTiempo.getSecond();
        int minutosFinales = segundoTiempo.getMinute();
        int tiempoTotal = (segundosFinales + (minutosFinales * 60)) - (segundosIniciales + (minutosIniciales * 60));

        if (tiempoTotal == segundosAleatorios) {
            System.out.println("Has acertado los segundos!");

        } else if (tiempoTotal < segundosAleatorios) {
            int segundosFaltaron = segundosAleatorios - tiempoTotal;
            System.out.println("Fallaste. Has pulsado Enter " + segundosFaltaron + " segundos antes de lo necesario");

        } else if (tiempoTotal > segundosAleatorios) {
            int segundosSobraron = tiempoTotal - segundosAleatorios;
            System.out.println("Fallaste. Has pulsado Enter " + segundosSobraron + " segundos después de lo necesario");
        }
    }
}
