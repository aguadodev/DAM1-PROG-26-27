package ud1;

import java.util.Scanner;

/** @author Juan **/

public class EjemploCompra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.1;

        System.out.print("Precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Número de unidades: ");
        double cantidadProducto = sc.nextInt();;
        sc.close();

        double importeTotal = precioProducto * cantidadProducto;
        double importeIva = importeTotal * IVA;
        double importeConIva = importeTotal + importeIva;
        System.out.println("Importe total (sin IVA): " + String.format("%.2f",importeTotal) + " euros");
        System.out.println("IVA: " + IVA * 100 + "%");
        System.out.println("Importe del IVA: " + String.format("%.2f", importeIva) + " euros");
        System.out.println("Importe total a pagar (con IVA): " + String.format("%.2f",importeConIva) + " euros.");
    }

}
