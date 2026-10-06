package ud1.examen.oaguado;

import java.util.Scanner;

/**
 * @author oaguado
 * TipoTriangulo
 */
public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las longitudes de los 3 lados de un triángulo: ");
        int ladoA = sc.nextInt();
        int ladoB = sc.nextInt();
        int ladoC = sc.nextInt();
        sc.close();

        boolean esEquilatero = ladoA == ladoB && ladoA == ladoC;
        boolean esEscaleno = ladoA != ladoB && ladoA != ladoC && ladoB != ladoC;
        
        /* El cálculo de triángulo isósceles es innecesario. Se puede obtener por descarte de los otros dos tipos.
        
        boolean esIsosceles = ladoA == ladoB && ladoA != ladoC 
                           || ladoA == ladoC && ladoA != ladoB
                           || ladoB == ladoC && ladoB != ladoA;*/

        String tipoTriangulo = esEquilatero ? "Equilátero" : esEscaleno ? "Escaleno" : "Isósceles";

        System.out.println(tipoTriangulo);

    }
}
