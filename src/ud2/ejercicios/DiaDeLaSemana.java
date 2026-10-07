package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Lunna Mendonça Miranda
 */

/*
 * ENUNCIADO:
 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “lunes” 
 * y el 6 a “sábado”.
 */

public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un número comprendido entre 1 y 7, correspondiente a un día de la semana: ");
        int dia = sc.nextInt();
        sc.close();

        String diaStr = "";

        switch (dia) {
            case 1:
                diaStr = "lunes";
                break;

            case 2:
                diaStr = "martes";
                break;

            case 3:
                diaStr = "miércoles";
                break;

            case 4:
                diaStr = "jueves";
                break;

            case 5:
                diaStr = "viernes";
                break;

            case 6:
                diaStr = "sábado";
                break;

            case 7:
                diaStr = "domingo";
                break;

            default:
                break;
        }

        System.out.println("El día " + dia + " de la semana es " + diaStr + ".");
    }
}
