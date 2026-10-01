package ud1.examen.oaguado;

import java.util.Scanner;

/**
 * @author oaguado
 * Esfera
 */
public class Esfera {
    public static void main(String[] args) {
        // Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el radio de una esfera: ");
        double radio = sc.nextDouble();
        sc.close();

        // Proceso
        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = 4. / 3 * Math.PI * Math.pow(radio, 3);

        // Salida
        System.out.printf("Área: %.2f unidades cuadradas %n", area);
        System.out.println("Volumen: " + String.format("%.2f", volumen) + " unidades cúbicas");

    }
}
