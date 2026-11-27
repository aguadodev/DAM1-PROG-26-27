package ud3.ejercicios.c02_carrito;

public class Carrito {

    static boolean contiene(int[] carrito, int codigo) {
        return false;
    }

    static int[] anadir(int[] carrito, int codigo) {
        return new int[0];
    }

    static int[] quitar(int[] carrito, int codigo) {
        return new int[0];
    }

    static int[] sinDuplicados(int[] t) {
        return new int[0];
    }

    static int[] unir(int[] c1, int[] c2) {
        return new int[0];
    }

    static int[] comunes(int[] c1, int[] c2) {
        return new int[0];
    }

    static void imprimir(int[] t) {
        for (int e : t)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] carrito = {7, 3, 9};
        carrito = anadir(carrito, 5);
        imprimir(carrito);
        carrito = quitar(carrito, 3);
        imprimir(carrito);
    }
}
