package ud1;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EjemplosAPI {
    public static void main(String[] args) {

        //System.out.printf("Número con dos decimales: %.2f %n", 123.29834757863248568);
        String cadena = String.format("Número con dos decimales: %.2f %n", 123.29834757863248568);


        // Ejemplos de entrada (Scanner) y salida
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.next();
        
        System.out.print("Escribe un número entero: ");        
        int numero = sc.nextInt();

        System.out.print("Escribe un número con decimales: ");        
        double numeroReal = sc.nextDouble();
        sc.close();
        
        System.out.println(nombre + ", has escrito los números " + numero + " y " + numeroReal);
        

        // Ejemplos de clase Math
        System.out.println("EJEMPLOS Clase Math");
        System.out.println("===================");
        System.out.println("Número PI: " + Math.PI);
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));
        System.out.println("ceil(): " + Math.ceil(56.78));
        System.out.println("floor(): " + Math.floor(56.78));
        System.out.println("round(): " + Math.round(56.78));
        System.out.println("Máximo de 4 y 7: " + Math.max(4, 7));
        System.out.println("Mínimo de 4 y 7: " + Math.min(4, 7));
        System.out.println("Random: " + Math.random());
        System.out.println("5 elevado a 3: " + Math.pow(5, 3));
        System.out.println("Raíz cuadrada de 25: " + Math.sqrt(25));

        // Ejemplos con fechas y horas
        System.out.println("Hora del sistema: " + LocalTime.now());
        System.out.println("Fecha del sistema: " + LocalDate.now());
        System.out.println("Fecha/Hora del sistema: " + LocalDateTime.now());

    }
}
