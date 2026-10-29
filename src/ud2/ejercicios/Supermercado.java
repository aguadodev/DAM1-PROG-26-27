package ud2.ejercicios;

import java.util.Scanner;

import ud2.Util;

/** @author Miguel Lores Penas */

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int importe = 0;
        double totalAPagar = 0;

        do {
            double precio = Util.leerDouble(sc, "Introduce el precio de tu producto (0 para terminar): ");

            while (precio > 0) {
                int cantidad = Util.leerEntero(sc, "Introduce la cantidad de productos: ");
                totalAPagar += calculo(cantidad, precio);

                precio = Util.leerDouble(sc, "Introduce el precio del siguiente producto (0 para terminar): ");
            }

            System.out.printf("Total a pagar: %.2f €\n", totalAPagar);

            // Repetir mientras no se realice el pago    
            boolean pagoRealizado = false;
            while (!pagoRealizado) {
                System.out.println("Quieres pagar en [efectivo] o con [tarjeta]: ");
                String opcion = sc.next();

                if (opcion.equalsIgnoreCase("efectivo")) {
                    double pago = Util.leerDouble(sc, "Introduce el importe del pago del cliente: ");

                    double cambio = pago - totalAPagar;
                    System.out.printf("Pago a devolver al cliente: %.2f €\n", cambio);
                    imprimirCambio(cambio);
                    System.out.println("Pago terminado!");
                    pagoRealizado = true;
                    
                } else if (opcion.equalsIgnoreCase("tarjeta")) {
                    System.out.println("Pago realizado!");
                    pagoRealizado = true;
                } else {
                    System.out.println("Método de pago incorrecto.");
                }
            }

            importe = Util.leerEntero(sc, "Quieres reiniciar el programa? (0 para terminar): ");

        } while (importe != 0);
        sc.close();
    }

    public static double calculo(int cantidad, double precio) {
        double importe = cantidad * precio;
        return importe;
    }

    public static void imprimirCambio(double cambio) {
        int cambioEntero = (int) (cambio * 100);

        int billetes50 = cambioEntero / 5000; 
        cambioEntero %= 5000;
        int billetes20 = cambioEntero / 2000;
        cambioEntero %= 2000;
        int billetes10 = cambioEntero / 1000;
        cambioEntero %= 1000;
        int billetes5 = cambioEntero / 500;
        cambioEntero %= 500;
        int monedas2 = cambioEntero / 200;
        cambioEntero %= 200;
        int monedas1 = cambioEntero / 100;
        cambioEntero %= 100;
        int monedas50 = cambioEntero / 50;
        cambioEntero %= 50;
        int monedas20 = cambioEntero / 20;
        cambioEntero %= 20;
        int monedas10 = cambioEntero / 10;
        cambioEntero %= 10;
        int monedas5 = cambioEntero / 5;
        cambioEntero %= 5;
        int monedas2Cent = cambioEntero / 2;
        cambioEntero %= 2;
        int monedas1Cent = cambioEntero;
        if (billetes50 > 0) {
            System.out.println("Billetes de 50 euros: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20 euros: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10 euros: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5 euros: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
        if (monedas50 > 0) {
            System.out.println("Monedas de 50 centimos: " + monedas50);
        }
        if (monedas20 > 0) {
            System.out.println("Monedas de 20 centimos: " + monedas20);
        }
        if (monedas10 > 0) {
            System.out.println("Monedas de 10 centimos: " + monedas10);
        }
        if (monedas5 > 0) {
            System.out.println("Monedas de 5 centimos: " + monedas5);
        }
        if (monedas2Cent > 0) {
            System.out.println("Monedas de 2 centimos: " + monedas2Cent);
        }
        if (monedas1Cent > 0) {
            System.out.println("Monedas de 1 centimo: " + monedas1Cent);
        }
    }


}
