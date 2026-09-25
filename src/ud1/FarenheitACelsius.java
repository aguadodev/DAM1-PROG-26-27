package ud1;

import java.util.Scanner;

public class FarenheitACelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Farenheit: ");
        double F = sc.nextDouble();
        sc.close();
        
       double C = (F-32) * 5/9;
       System.out.println("Celsius: " + C);
        
    }

}
