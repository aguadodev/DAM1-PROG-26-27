package ud2.ejercicios;
import java.util.Scanner;

/** @author Yubay */

public class FechaCorrecta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();
        int diasMes = 0;
        sc.close();
        
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = 28;
                break;
            default:
                System.out.println("El mes no es válido.");
        }
        if (mes >= 1 && mes <= 12) {
            if (dia >= 1 && dia <= diasMes) {
                System.out.println("La fecha es correcta.");
            } else {
                System.out.println("La fecha no es correcta.");
            }
        }
        
    }
}