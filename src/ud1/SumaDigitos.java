package ud1;

import java.util.Scanner;

/** @author Juan **/
public class SumaDigitos {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número de 3 cifras, para calcular la suma de sus cifras: ");
        int numTotal = sc.nextInt();
        sc.close();

        //Proceso
        int num1 = numTotal / 100;  //Trunca
        int num2 = numTotal / 10 % 10;
        int num3 = numTotal % 10; 
        int sumaNum = num1 + num2 + num3;
    
        //Salida
        System.out.println("La suma de los números: " + num1 + ", " + num2 + " y " + num3 + " es de:");
        System.out.print("La suma de los números es: " + sumaNum );
        





    }

}
