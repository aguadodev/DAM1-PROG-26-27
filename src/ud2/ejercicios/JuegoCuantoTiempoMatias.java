package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;

/** @author Matias Centeno Plá */
public class JuegoCuantoTiempoMatias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        final int SEGUNDO_MINIMO = 1;
        final int SEGUNDO_MAXIMO = 15;
        int segRandom = rnd.nextInt(SEGUNDO_MINIMO, SEGUNDO_MAXIMO + 1);
        System.out.println("Pulsa enter cuando creas que estas en el segundo " + segRandom);
        long inicio = System.currentTimeMillis();

        sc.nextLine();
        sc.close();
        long fin = System.currentTimeMillis();

        long segundoTermina = Math.abs((inicio - fin) / 1000);

        if (segundoTermina == segRandom) {
            System.out.println("Lo has clavado!!!");
        } else if (segundoTermina < segRandom) {

            System.out.println("Te han faltado " + (Math.abs(segundoTermina - segRandom)) + " segundos");
        } else {

            System.out.println("Te han sobrado " + (Math.abs(segRandom - segundoTermina)) + " segundos");
        }
        

    }
}
