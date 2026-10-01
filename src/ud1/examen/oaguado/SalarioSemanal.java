package ud1.examen.oaguado;

import java.util.Scanner;

/**
 * @author oaguado
 *         SalarioSemanal
 */
public class SalarioSemanal {
    public static void main(String[] args) {
        final int HORAS_SEMANALES = 40;
        final double SALARIO_HORA = 12.5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce en número de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        sc.close();
        
        double salario = horasTrabajadas <= HORAS_SEMANALES ? horasTrabajadas * SALARIO_HORA
                : HORAS_SEMANALES * SALARIO_HORA + (horasTrabajadas - HORAS_SEMANALES) * SALARIO_HORA * 2;

        System.out.printf("Salario total: %.2f euros", salario);
    }
}
