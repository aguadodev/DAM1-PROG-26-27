package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploThrow {

    public static void main(String[] args) {
        final int NUM_NOTAS = 10;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= NUM_NOTAS; i++) {
            try {
                int nota = sc.nextInt();
                comprobarNota(nota);
                System.out.println("Nota " + nota + " válida.");
            } catch (InputMismatchException e) {
                System.out.println("Error en la nota nº " + i + ": no es un número entero.");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la nota nº " + i + ": " + e.getMessage());
            }
        }
        sc.close();
    }

    // Método estático: lanza excepción si la nota no es válida
    static void comprobarNota(int nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("La nota " + nota + " está fuera del rango 0-10.");
        }
        // si no se lanza, el método termina normalmente
    }
}
