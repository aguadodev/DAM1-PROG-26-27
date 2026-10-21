package ud2.ejercicios;

/**
 * @author Adrián Núñez Cal
 * Digitos
 */

public class Digitos {
    public static void main(String[] args) {
        final int DIEZ = 10;
        int num = 1235;

        int dig = 1;

        while (num / Math.powExact(DIEZ, dig) > 0.) {
            dig++;

        }
        for(int i = 1; i <=dig; i++){
            int unDig = num% (int)Math.powExact(DIEZ, i)/ (int)Math.pow(DIEZ, i-1);
            System.out.println(unDig);
        }
    }

}
