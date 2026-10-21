package ud2.ejercicios;

/**
 * @author Lunna Mendonça Miranda
 */

public class FormacionSoldados {
    public static void main(String[] args) {
        soldadosEnFormacion(71);
    }

    static void soldadosEnFormacion(int n) {

        while (n > 0) {
            int form;

            if (n <= 3) {
                form = n;
                System.out.printf("Formación en línea: %d soldados\n", form);
                for (int i = 0; i < form; i++) {
                    System.out.print("* ");
                }
            } else {
                form = (int) Math.sqrt(n);
                imprimirFormacion(form);
            }

            n -= Math.pow(form, 2);

        }
    }

    static void imprimirFormacion(int form) {
        System.out.printf("Formación cuadrada: %d soldados\n", form * form);
        for (int i = 0; i < form; i++) {
            for (int j = 0; j < form; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}