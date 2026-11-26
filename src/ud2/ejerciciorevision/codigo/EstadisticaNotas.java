package ud2.ejerciciorevision.codigo;

import java.util.Scanner;

public class EstadisticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Notas (0-10), -1 para terminar: ");

        int cantidad = 0;
        int suma = 0;
        int aprobados = 0;
        int maxima = 0;
        int minima = 0;

        int nota = sc.nextInt();
        while (nota != -1) {
            cantidad++;
            suma += nota;
            if (nota > maxima) {
                maxima = nota;
            }
            if (nota < minima) {
                minima = nota;
            }
            if (nota > 5) {
                aprobados++;
            }
            nota = sc.nextInt();
        }
        sc.close();

        if (cantidad == 0) {
            System.out.println("No hay notas");
        }

        double media = suma / cantidad;
        double porcentaje = aprobados * 100.0 / cantidad;

        System.out.println("Notas: " + cantidad);
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Máxima: " + maxima + "  Mínima: " + minima);
        System.out.printf("Aprobados: %d (%.2f%%)%n", aprobados, porcentaje);
        if (porcentaje > 50) {
            System.out.println("GRUPO APROBADO");
        } else {
            System.out.println("GRUPO NO APROBADO");
        }
    }
}
