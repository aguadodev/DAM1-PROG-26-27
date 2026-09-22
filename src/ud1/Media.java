package ud1;

/** @author Juan **/
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las notas para el cálculo de su media separadas por un espacio cada una: ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        sc.close();
       
        //Proceso
        double mediaArimetica = (nota1 + nota2 + nota3) / 3.0; // Es necesario que sea .0 ya que si no es un tipo int y redonde el resultado!!!

        //Salida
        System.out.printf("La media de las notas es: %.2f", mediaArimetica);

    }

}
