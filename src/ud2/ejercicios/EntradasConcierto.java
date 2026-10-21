package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Adán Martínez Iglesias
 * @brief Escribir un programa que calcule el dinero recaudado en un concierto.
 *        La aplicación solicitará el aforo máximo del local, el precio por
 *        entrada (suponemos que todas las entradas tienen el mismo precio) y el
 *        número de entradas vendidas. Hay que tener en cuenta que si el número
 *        de entradas vendidas no supera el 20% del aforo del local, se cancela
 *        el concierto. Si el número de entradas vendidas no supera el 50% del
 *        aforo del local, se realiza una rebaja del 25% del precio de la
 *        entrada.
 * @date 2026-10-17
 */

public class EntradasConcierto {

    public static double calcularRecaudacion(int aforoLocal, double precioEntrada, int asistentes) {
        final double POR_CIENTO = 100.0;
        final int DESCUENTO_ENTRADA = 25;
        final int MINIMO_EVENTO = 20;
        final int META_RENTABLE = 50;

        double dineroRecaudado;

        if (asistentes <= (aforoLocal * MINIMO_EVENTO / POR_CIENTO)) {
            dineroRecaudado = 0.0;
            System.out.println("El concierto se cancela por falta de asistentes");
        }

        else if (asistentes <= (aforoLocal * META_RENTABLE / POR_CIENTO)) {
            double rebajaIncentivo = (DESCUENTO_ENTRADA / POR_CIENTO) * precioEntrada;
            dineroRecaudado = asistentes * (precioEntrada - rebajaIncentivo);
            System.out.printf("El concierto no fue rentable. Aplicamos descuento del %d%%\n", DESCUENTO_ENTRADA);
        }

        else {
            dineroRecaudado = asistentes * precioEntrada;
            System.out.println("El concierto fue un éxito. vendimos a precio completo.");
        }

        return dineroRecaudado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el aforo máximo del local:");
        int aforoLocal = sc.nextInt();
        System.out.print("Introduce el precio de cada entrada:");
        double precioEntrada = sc.nextDouble();
        System.out.print("Introduce la cantidad de entradas vendidas:");
        int asistentes = sc.nextInt();
        sc.close();

        System.out.printf("Total de la recaudación: %.2f euros",
                calcularRecaudacion(aforoLocal, precioEntrada, asistentes));

    }
}
