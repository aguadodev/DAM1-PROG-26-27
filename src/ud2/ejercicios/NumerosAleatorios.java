package ud2.ejercicios;

public class NumerosAleatorios {
    public static void main(String[] args) {
        final int NUM = 10;
        
        // Inicialización del contador
        int n = 1;
        while (n <= NUM) { // condición
            System.out.println(n + ". " + Math.random());
            // Incrementar contador
            n++;
        }

    }
}
