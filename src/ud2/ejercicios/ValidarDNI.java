package ud2.ejercicios;

import java.util.Scanner;

import ud2.Util;

/** @author Juan **/
public class ValidarDNI {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numDNI ;
       

       do {
            System.out.print("Introduce un el DNI: ");
            numDNI = sc.nextInt();
            System.out.println("Introduce la letra del DNI: ");
            char letraValida = sc.next().charAt(0);
        } while (numDNI <= 9999999 || numDNI > 99999999);  
        System.out.println("Es válido tu DNI? --> " + esValidoDNI(numDNI, letraDNI(numDNI)));
        sc.close();
    }   

    public static char letraDNI(int numDNI) {
        
        int letra = numDNI % 23;
        switch (letra) {
            case 0:
                return 'T';

            case 1:
                return 'R';

            case 2:
                return 'W';

            case 3:
                return 'A';

            case 4:
                return 'G';

            case 5:
                return 'M';

            case 6:
                return 'Y';

            case 7:
                return 'F';

            case 8:
                return 'P';

            case 9:
                return 'D';

            case 10:
                return 'X';

            case 11:
                return 'B';

            case 12:
                return 'N';

            case 13:
                return 'J';

            case 14:
                return 'Z';

            case 15:
                return 'S';

            case 16:
                return 'Q';

            case 17:
                return 'V';

            case 18:
                return 'H';

            case 19:
                return 'L';

            case 20:
                return 'C';

            case 21:
                return 'K';

            case 22:
                return 'E';

            default:
                return ' ';

            }

        

    }
    
    public static boolean esValidoDNI(int numDNI, char letra) {
        return Util.numDigitos(numDNI) == 8 && letra == letraDNI(numDNI);
    }

    public static char validacionDNI (int numDNI, char letraValida) {
        switch (letraValida) {
            case 0:
               return letraValida = 'T';

            case 1:
                return letraValida = 'R';

            case 2:
                return letraValida = 'W';

            case 3:
                return letraValida = 'A';

            case 4:
                return letraValida = 'G';

            case 5:
                return letraValida = 'M';

            case 6:
               return  letraValida = 'Y';

            case 7:
               return  letraValida = 'F';

            case 8:
               return  letraValida = 'P';

            case 9:
               return  letraValida = 'D';

            case 10:
               return  letraValida = 'X';

            case 11:
               return  letraValida = 'B';

            case 12:
               return  letraValida = 'N';

            case 13:
               return  letraValida = 'J';

            case 14:
               return  letraValida = 'Z';

            case 15:
               return  letraValida = 'S';

            case 16:
               return  letraValida = 'Q';

            case 17:
               return  letraValida = 'V';

            case 18:
               return  letraValida = 'H';

            case 19:
               return  letraValida = 'L';

            case 20:
               return  letraValida = 'C';

            case 21:
               return  letraValida = 'K';

            case 22:
               return  letraValida = 'E';

            default:
               return  letraValida = ' ';

            }
    }
        

    
    
}
