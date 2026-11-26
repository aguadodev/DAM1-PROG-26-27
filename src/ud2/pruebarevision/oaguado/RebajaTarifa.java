package ud2.pruebarevision.oaguado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RebajaTarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double factura = 0;
        double minimo = 0;
        boolean datosCorrectos = false;

        while (!datosCorrectos) {
            try {
                System.out.print("Importe de la factura: ");
                factura = sc.nextDouble();
                System.out.print("Importe mínimo de la tarifa: ");
                minimo = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido. Vuelve a intentarlo.");
            }
        }
        sc.close();

        double rebaja = rebaja(factura, minimo);
        System.out.printf("Rebaja: %.2f €%n", rebaja);
        System.out.printf("Factura final: %.2f €%n", factura - rebaja);
    }

    public static double rebaja(double factura, double minimo) {
        if (factura < 0 && minimo < 0) {
            return 0;
        }
        if (factura <= minimo) {
            return 0;
        }
        double rebaja = factura * 0.5;
        if (factura - rebaja < minimo) {
            rebaja = minimo - factura;
        }
        return factura - rebaja;
    }
}
