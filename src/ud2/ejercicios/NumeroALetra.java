package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Darianys Rosales
 *         NumeroALetra
 */
public class NumeroALetra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 99: ");
        int num = sc.nextInt();

        while (num >= 1 && num <= 99) {

            int decena = num / 10;
            int unidad = num % 10;
            String resultado = "";

            if (num >= 10 && num <= 19) {

                if (num == 10)
                    resultado = "diez";
                else if (num == 11)
                    resultado = "once";
                else if (num == 12)
                    resultado = "doce";
                else if (num == 13)
                    resultado = "trece";
                else if (num == 14)
                    resultado = "catorce";
                else if (num == 15)
                    resultado = "quince";
                else if (num == 16)
                    resultado = "dieciséis";
                else if (num == 17)
                    resultado = "diecisiete";
                else if (num == 18)
                    resultado = "dieciocho";
                else if (num == 19)
                    resultado = "diecinueve";

            } else if (num >= 20 && num <= 29) {

                if (num == 20) {
                    resultado = "veinte";
                } else {
                    resultado = "veinti";
                    if (unidad == 1)
                        resultado += "uno";
                    else if (unidad == 2)
                        resultado += "dos";
                    else if (unidad == 3)
                        resultado += "tres";
                    else if (unidad == 4)
                        resultado += "cuatro";
                    else if (unidad == 5)
                        resultado += "cinco";
                    else if (unidad == 6)
                        resultado += "seis";
                    else if (unidad == 7)
                        resultado += "siete";
                    else if (unidad == 8)
                        resultado += "ocho";
                    else if (unidad == 9)
                        resultado += "nueve";
                }
            } else {
                String textoDecena = "";
                String textoUnidad = "";

                if (decena == 0) {
                    if (unidad == 1)
                        resultado = "uno";
                    else if (unidad == 2)
                        resultado = "dos";
                    else if (unidad == 3)
                        resultado = "tres";
                    else if (unidad == 4)
                        resultado = "cuatro";
                    else if (unidad == 5)
                        resultado = "cinco";
                    else if (unidad == 6)
                        resultado = "seis";
                    else if (unidad == 7)
                        resultado = "siete";
                    else if (unidad == 8)
                        resultado = "ocho";
                    else if (unidad == 9)
                        resultado = "nueve";

                } else {
                    if (decena == 3)
                        textoDecena = "treinta";
                    else if (decena == 4)
                        textoDecena = "cuarenta";
                    else if (decena == 5)
                        textoDecena = "cincuenta";
                    else if (decena == 6)
                        textoDecena = "sesenta";
                    else if (decena == 7)
                        textoDecena = "setenta";
                    else if (decena == 8)
                        textoDecena = "ochenta";
                    else if (decena == 9)
                        textoDecena = "noventa";

                    if (unidad == 0) {
                        resultado = textoDecena;

                    } else {
                        if (unidad == 1)
                            textoUnidad = "uno";
                        else if (unidad == 2)
                            textoUnidad = "dos";
                        else if (unidad == 3)
                            textoUnidad = "tres";
                        else if (unidad == 4)
                            textoUnidad = "cuatro";
                        else if (unidad == 5)
                            textoUnidad = "cinco";
                        else if (unidad == 6)
                            textoUnidad = "seis";
                        else if (unidad == 7)
                            textoUnidad = "siete";
                        else if (unidad == 8)
                            textoUnidad = "ocho";
                        else if (unidad == 9)
                            textoUnidad = "nueve";

                        resultado = textoDecena + " y " + textoUnidad;
                    }
                }
            }
            System.out.println("El número en letras es: " + resultado);
            System.out.println();
            System.out.print("Introduce un número entre 1 y 99: ");
            num = sc.nextInt();

        }
        sc.close();
        System.out.println("El número debe estar entre 1 y 99.");
    }
}
