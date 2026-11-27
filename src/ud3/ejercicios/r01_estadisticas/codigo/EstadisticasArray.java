package ud3.ejercicios.r01_estadisticas.codigo;

public class EstadisticasArray {

    static double media(int[] t) {
        if (t.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return suma / t.length;
    }

    static int minimo(int[] t) {
        int minimo = 0;
        for (int n : t) {
            if (n < minimo) {
                minimo = n;
            }
        }
        return minimo;
    }

    static int contarPositivos(int[] t) {
        int cont = 0;
        for (int n : t) {
            if (n >= 0) {
                cont++;
            }
        }
        return cont;
    }

    static boolean todosPositivos(int[] t) {
        for (int n : t) {
            if (n > 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean algunoNegativo(int[] t) {
        for (int n : t) {
            if (n < 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] t = {4, -2, 7, 0, 5};
        System.out.println("Media: " + media(t));
        System.out.println("Mínimo: " + minimo(t));
        System.out.println("Positivos: " + contarPositivos(t));
        System.out.println("¿Todos positivos? " + todosPositivos(t));
        System.out.println("¿Alguno negativo? " + algunoNegativo(t));
    }
}
