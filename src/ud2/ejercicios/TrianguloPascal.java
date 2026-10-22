package ud2.ejercicios;

/** @author Matías Centeno Plá */
public class TrianguloPascal {

    public static void main(String[] args) {

        int numFilas = 5;

        for (int n = 0; n < numFilas; n++) { // Controla en qué fila estamos
            for (int m = 0; m <= n; m++) { // Controla la posición del número dentro de esa fila

                int e = factorial(n) / (factorial(m) * factorial(n - m)); // Calcula el número con la formula a utilizar
                System.out.print(e + "  "); // Imprime el número
            }
            System.out.println();
        }
    }

    public static int factorial(int numero) {

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
