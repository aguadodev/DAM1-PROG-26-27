package ud1;

import java.util.Scanner;

public class ConvertirExpresiones {
    public static void main(String[] args) {
        double a = 3. / 2 + 4. / 3;
        System.out.println("a: " + a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe los valores de x e y (puedes usar la coma como separador decimal): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();

        double b = 1 / (x - 5) - 3 * x * y / 4;
        System.out.println("b: " + b);
    }
}
