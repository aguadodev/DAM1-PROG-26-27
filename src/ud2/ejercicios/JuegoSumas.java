package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class JuegoSumas {
    public static void main(String[] args) {
        final int MIN_OP = 1;
        final int MAX_OP = 100;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int operando1, operando2, resultado;
        int resultadoUsuario;
        int contAciertos = 0;

        System.out.println("Resuelve las sumas: ");
        do {
            // Generar operandos aleatorios
            operando1 = rnd.nextInt(MIN_OP, MAX_OP + 1);
            operando2 = rnd.nextInt(MIN_OP, MAX_OP + 1);
            resultado = operando1 + operando2;

            // Mostrar operación
            System.out.printf("%d + %d = ", operando1, operando2);

            // Pedir resultado al usuario
            resultadoUsuario = sc.nextInt();

            // Contar acierto
            if (resultadoUsuario == resultado)
                contAciertos++;
            
        } while (resultadoUsuario == resultado);

        sc.close();

        System.out.println("Has realizado correctamente " + contAciertos + " sumas.");

    }
}
