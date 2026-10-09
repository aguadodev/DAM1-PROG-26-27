package ud2.ejercicios;

public class BucleColores {

    public static void main(String[] args) {
        final int MAX = 500;

        for (int i = 0; i < MAX; i++) {
            String color = "\033[" + i + "m";
            System.out.println(color + "\\033[" + i + "m");
        }
        
        System.out.println("\033[0m");
    }
}
