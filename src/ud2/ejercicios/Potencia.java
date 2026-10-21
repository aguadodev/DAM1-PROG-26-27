package ud2.ejercicios;

/** @author David Dorado */

public class Potencia {
    public static double potenciaIterativa(double a, int n) {
        double r = 1;
        for (int i = 0; i < n; i++) {
            r *= a;
        }
        return r;
    }

    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * potenciaRecursiva(a, --n);
        }
    }

    public static void main(String[] args) {
        System.out.println(potenciaIterativa(2, 5));
        System.out.println(potenciaRecursiva(2, 5));
    }
}
