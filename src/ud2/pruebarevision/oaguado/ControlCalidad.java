package ud2.pruebarevision.oaguado;

import java.util.Scanner;

public class ControlCalidad {
    public static void main(String[] args) {
        final int MAX_DEFECTUOSAS_SEGUIDAS = 3;
        final int MAX_PIEZAS = 25;
        final double UMBRAL = 80;

        Scanner sc = new Scanner(System.in);
        System.out.print("Resultado de cada pieza (1 = correcta, 0 = defectuosa): ");

        int revisadas = 0;
        int correctas = 0;
        int defectuosasSeguidas = 0;

        while (revisadas < MAX_PIEZAS && defectuosasSeguidas < MAX_DEFECTUOSAS_SEGUIDAS) { // CORREGIDO: <= debe ser <
            int pieza = sc.nextInt();
            revisadas++;
            if (pieza == 1) {
                correctas++;
                defectuosasSeguidas = 0; // CORREGIDO: Reinicio defectuosasSeguidas o contará defectuosas totales
            } else {
                defectuosasSeguidas++;
            }
        }
        sc.close();

        double porcentaje = (double) correctas / revisadas * 100; // CORREGIDO: Casteo a double un operando de la división

        System.out.println("Piezas revisadas: " + revisadas);
        System.out.println("Piezas correctas: " + correctas);
        System.out.printf("Porcentaje de piezas correctas: %.2f%%%n", porcentaje);
        if (porcentaje > UMBRAL) { // CORREGIDO: > en lugar de >=
            System.out.println("Lote APTO");
        } else {
            System.out.println("Lote NO APTO");
        }
    }
}
