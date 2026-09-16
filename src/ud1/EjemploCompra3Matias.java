package ud1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/** @author Matías Centeno Plá */

public class EjemploCompra3Matias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el precio del producto");
        double precio = sc.nextDouble();

        System.out.println("Indica las unidades que se van a comprar");
        int cantidad = sc.nextInt();
        sc.close();
        System.out.println("==================");

        double precioCalculado = cantidad * precio;
        System.out.printf("La cantidad total es de %.2f euros %n", precioCalculado);
        System.out.println();
        System.out.println("Fecha: " + LocalDate.now());
        System.out.println("Hora: " + LocalTime.now());
        
      

        
    }
}
