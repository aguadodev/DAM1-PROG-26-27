package ud2.ejerciciorevision.codigo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrecioParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = 0;

        try {
            System.out.print("Minutos de estancia: ");
            minutos = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero.");
        }
        sc.close();

        double precio = precioParking(minutos);
        if (precio < 0) {
            System.out.println("Tiempo no válido");
        } else {
            System.out.printf("Importe: %.2f €%n", precio);
        }
    }

    public static double precioParking(int minutos) {
        final double PRIMERA_HORA = 2.0;
        final double HORA_ADICIONAL = 1.5;
        final double MAXIMO = 18.0;

        if (minutos < 15) {
            return 0;
        }
        if (minutos < 0) {
            return -1;
        }
        int horasAdicionales = minutos / 60;
        double precio = PRIMERA_HORA + horasAdicionales * HORA_ADICIONAL;
        if (precio > MAXIMO) {
            precio = MAXIMO;
        }
        return precio;
    }
}
