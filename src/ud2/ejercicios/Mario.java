package ud2.ejercicios;

/** @author Yubay */

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        int alturaMario = -1;
        int numSaltosAbajo = 0;
        int numSaltosArriba = 0;
        boolean primeraEntradaValida = false;

        System.out.print(
                "Escribe una secuencia de alturas de las plataformas (-1 para terminar): ");
        altura = sc.nextInt();
        while (altura >= 0) {
            if (primeraEntradaValida) {
                if (alturaMario < altura) {
                    numSaltosArriba++;
                } else if (alturaMario > altura) {
                    numSaltosAbajo++;
                }
            } else {
                primeraEntradaValida = true;
            }
            alturaMario = altura;
            altura = sc.nextInt();
        }

        sc.close();

        System.out.println("Saltos arriba: " + numSaltosArriba);
        System.out.println("Saltos abajo: " + numSaltosAbajo);        

    }
}
