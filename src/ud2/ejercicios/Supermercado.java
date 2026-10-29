package ud2.ejercicios;

import java.util.Scanner;

/** @author Miguel Lores Penas */

public class Supermercado {
    public static double calculo(int cantidad, double precio) {
        double importe = cantidad * precio;
        return importe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int importe = 0;

        do {
        System.out.print("Introduce el precio de tu producto: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce la cantidad de productos: ");
        int cantidad = sc.nextInt();

        System.out.printf("Precio a pagar: %.2f €\n", calculo(cantidad, precio));

        System.out.println("Quieres pagar en efectivo o con tarjeta: ");
        String opcion = sc.next();

        if (opcion.equalsIgnoreCase("efectivo")) {
            System.out.println("Introduce el pago del cliente");
            double pago = sc.nextDouble();

            System.out.printf("Pago a devolver al cliente: %.2f €\n", pago - calculo(cantidad, precio));
            System.out.println("Pago terminado!");
            System.out.print("Quieres reiniciar el programa? (0 para terminar): ");
            importe = sc.nextInt();
        } else if (opcion.equalsIgnoreCase("tarjeta")) {
            System.out.println("Pago realizado!");

            System.out.print("Quieres reiniciar el programa? (0 para terminar): ");
            importe = sc.nextInt();
        }
        } while (importe != 0);
        sc.close();
    }
}
