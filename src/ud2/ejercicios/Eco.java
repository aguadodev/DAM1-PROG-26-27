package ud2.ejercicios;

/** @author David Epifanio*/

public class Eco {

    static void eco(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }
    public static void main(String[] args) {
        eco(5);
    }
}