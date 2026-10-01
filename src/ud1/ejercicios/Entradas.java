package ud1.ejercicios;

import java.util.Scanner;

/** @author Pablo Cores */

public class Entradas {
    public static void main(String[] args) {
        // Creamos el Scanner para preguntar el usuario el número de entradas.
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número de entradas de niños: ");
        int entNinos = sc.nextInt();
        System.out.print("Escribe el número de entradas de adultos: ");
        int entAdultos = sc.nextInt();
        sc.close();

        // Creo en las constantes.
        final double PRECIO_NINO = 15.50;
        final double PRECIO_ADULTO = 20;
        final double UMBRAL_DESCUENTO = 100;
        final double DESCUENTO = 0.05;

        // Aplico la variable (entradas) a las constantes (precios) y creo el precio total de las entradas.
        double inpNinos = entNinos * PRECIO_NINO; 
        double inpAdultos = entAdultos * PRECIO_ADULTO;
        double importeTotal = inpNinos + inpAdultos;
        System.out.println("Precio total de las entradas es: " + String.format("%.2f", importeTotal) + " euros");

        // Creo la operacion del caso que supere los 100€ para luego crear el ternario.
        double descuento = importeTotal >= UMBRAL_DESCUENTO ? importeTotal * DESCUENTO : 0;
        // Creo el ternario que de las dos opciones de solución y soy salida al programa.
        System.out.printf("Importe Total: %.2f euros%n", importeTotal);
        System.out.printf("Descuento: %.2f euros%n", descuento);
        System.out.printf("Importe Final: %.2f euros%n", importeTotal - descuento);

    }

}
