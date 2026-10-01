package ud2.ejercicios;
import java.util.Scanner;
/**
 * @author Adrián Pesqueira Fernandez
 */

public class Factura {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;

        Scanner sc = new Scanner(System.in);
        System.out.print("Qué precio tiene el producto sin IVA: ");
        double precio = sc.nextDouble();
        System.out.print("Cuántas unidades va a comprar? ");
        double unidades = sc.nextDouble();
        sc.close();

        double importeConIva = (unidades * precio) * (1 + IVA);

        if (importeConIva > 100) {
            double importeDescuento = importeConIva * DESCUENTO;
            importeConIva -= importeDescuento; 
            System.out.println("Enhorabuena, tiene un descuento del " + DESCUENTO * 100 + " %: " + String.format("%.2f",importeDescuento) + " euros.");          
        }

        System.out.println("El precio total con IVA es de: " + String.format("%.2f",importeConIva) + " euros");
    }
}
