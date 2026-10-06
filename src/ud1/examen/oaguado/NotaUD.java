package ud1.examen.oaguado;

import java.util.Scanner;

/**
 * @author oaguado
 * NotaUD
 */
public class NotaUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce as notas para calcular a nota da UD:");
        System.out.println("Nota Proba Teórica: ");
        double notaTeorica = sc.nextDouble();
        System.out.println("Nota Proba Práctica: ");
        double notaPractica = sc.nextDouble();
        System.out.println("Nota Traballo Aula (-1 se non hai rexistros): ");
        double notaTraballoAula = sc.nextDouble();
        sc.close();

        double nota = notaTraballoAula == -1 ? 
               notaTeorica * 0.4 + notaPractica * 0.6 :
              (notaTeorica * 0.4 + notaPractica * 0.6 + notaTraballoAula * 0.2) / 1.2;
        
        nota = notaTeorica < 5 || notaPractica < 5 ? Math.min(nota, 4) : nota;

        System.out.printf("Nota UD: %.1f \n", nota);

    }
}
