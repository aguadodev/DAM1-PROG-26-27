package ud1;

import java.util.Scanner;

/** @author Óscar */

public class Ejemplos {
    public static void main(String[] args) {
        final double PI = 3.141516;
        final int NOTA_PARA_APROBAR = 5;

        float importe = 120.75f;
        long numeroGrande = 20000000000l;
        char letra = 'A';
        boolean aprobado = true;
        String nombre = null;

        System.out.println("Importe total: " + importe + " euros");

        var con = System.console();
        if (con != null) {
            Scanner sc = new Scanner(con.reader());
            int i = sc.nextInt();
            System.out.println("Escribiste: " + i);
        }
        

    }
}
