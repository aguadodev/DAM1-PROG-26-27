package ud2.ejercicios;

public class TablasMultiplicar {
    public static void main(String[] args) {

        // Bucle para 10 tablas de multiplicar
        for (int i = 1; i <= 10; i++) {
            // Bucle para la tabla de multiplicar del número i
            System.out.println("\nTABLA DE MULTIPLICAR DEL " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
