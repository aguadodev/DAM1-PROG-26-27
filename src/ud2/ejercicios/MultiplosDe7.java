package ud2.ejercicios;

public class MultiplosDe7 {
    public static void main(String[] args) {
        final int MAX = 20;
        final int DIVISOR = 23;

        System.out.println("Solución 1");
        for (int i = 1; i < MAX; i++) {
            if (i % DIVISOR == 0) 
                System.out.println(i);
        }

        System.out.println("Solución 2");
        for (int i = DIVISOR; i < MAX; i += DIVISOR)
            System.out.println(i);
    
    }
}
