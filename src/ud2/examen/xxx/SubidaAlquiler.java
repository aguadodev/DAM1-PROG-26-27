package ud2.examen.xxx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class SubidaAlquiler {

    static double subidaAlquiler(double rentaActual, double precioMaximoReferencia) {
        if (rentaActual < 0 || precioMaximoReferencia < 0 || rentaActual >= precioMaximoReferencia)
            return 0;

        final double MAX_PORCENTAJE_SUBIDA = 0.02;

        double subidaMaximaPorcentaje = rentaActual * MAX_PORCENTAJE_SUBIDA;

        double subidaMaximaPrecioReferencia = precioMaximoReferencia - rentaActual;

        return Math.min(subidaMaximaPorcentaje, subidaMaximaPrecioReferencia);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la renta actual: ");
        while (!sc.hasNextDouble()) {
            System.out.println("El valor introducido no es válido");
            sc.next();
        }
        double rentaActual = sc.nextDouble();
        System.out.print("Introduce el precio de referencia: ");
        while (!sc.hasNextDouble()) {
            System.out.println("El valor introducido no es válido");
            sc.next();
        }        
        double precioReferencia = sc.nextDouble();
        double subidaMaxima = subidaAlquiler(rentaActual, precioReferencia);
        System.out.println("La subida máxima del alquiler será de " + subidaMaxima + " euros");
        System.out.println("La nueva renta a pagar será de " + (rentaActual + subidaMaxima) + " euros");
        sc.close();
    }

    @Test
    void rentaNegativaDevuelveCero() {
        assertEquals(0.0, subidaAlquiler(-100.0, 500.0));
    }
    @Test
    void precioReferenciaNegativoDevuelveCero() {
        assertEquals(0.0, subidaAlquiler(500.0, -100.0));
    }
    @Test
    void ambosNegativosDevuelveCero() {
        assertEquals(0.0, subidaAlquiler(-1.0, -1.0));
    }
    @Test
    void rentaSuperiorAPrecioReferenciaNoSube() {
        // renta 600 > referencia 500 → subida 0
        assertEquals(0.0, subidaAlquiler(600.0, 500.0));
    }
    @Test
    void rentaIgualAPrecioReferenciaNoSube() {
        // renta == referencia → subida 0
        assertEquals(0.0, subidaAlquiler(500.0, 500.0));
    }
    @Test
    void rentaInferiorSubidaLimitadaAl2PorCiento() {
        // renta 400, referencia 500 → 2% de 400 = 8 < 100 (margen hasta referencia)
        assertEquals(8.0, subidaAlquiler(400.0, 500.0), 0.0001);
    }
    @Test
    void rentaInferiorSubidaLimitadaPorPrecioReferencia() {
        // renta 495, referencia 500 → 2% de 495 = 9.9, pero margen hasta referencia = 5
        // La subida máxima es 5 (no puede superar la referencia)
        assertEquals(5.0, subidaAlquiler(495.0, 500.0), 0.0001);
    }
    @Test
    void rentaMuyInferiorSubidaEsEl2PorCiento() {
        // renta 100, referencia 10000 → 2% de 100 = 2
        assertEquals(2.0, subidaAlquiler(100.0, 10000.0), 0.0001);
    }
    @Test
    void rentaCeroDevuelveCero() {
        // 2% de 0 = 0, no supera referencia
        assertEquals(0.0, subidaAlquiler(0.0, 500.0), 0.0001);
    }


}
