package ud2.ejercicios;

/**
 * @author Adrián Núñez Cal
 *         Digitos
 */

public class Digitos {
    public static void main(String[] args) {
        final int DIEZ = 10;
        int num = 1235;

        int dig = numDigitos(num);

        for (int i = 1; i <= dig; i++) {
            int unDig = num % (int) Math.powExact(DIEZ, i) / (int) Math.pow(DIEZ, i - 1);
            System.out.println(unDig);
        }

        // System.out.println(primerDigito(num));

    }

    public static int numDigitos(int n) {
        int dig = 1;
        while (n / Math.powExact(10, dig) > 0) {
            dig++;
        }
        return dig;
    }
    public  static  int primerDigito(int n){
        int num = n / (int) Math.pow(10, numDigitos(n)-1);
        return num;
    }

}
