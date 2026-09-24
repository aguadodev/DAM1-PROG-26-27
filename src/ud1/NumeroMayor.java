package ud1;

import java.util.Random;

public class NumeroMayor {
    public static void main(String[] args) {
        final int NUMERO_INICIAL = 238;
        final int NUMERO_FINAL = 567;

        int numRandom = (int) (NUMERO_INICIAL + Math.random() * (NUMERO_FINAL - NUMERO_INICIAL + 1));

        Random rnd = new Random();
        int numRandom2 = rnd.nextInt(NUMERO_INICIAL, NUMERO_FINAL + 1);
        int numRandom3 = rnd.nextInt(NUMERO_INICIAL, NUMERO_FINAL + 1);
        int numRandom4 = rnd.nextInt(NUMERO_INICIAL, NUMERO_FINAL + 1);
        
        System.out.println("Número1: " + numRandom);
        System.out.println("Número2: " + numRandom2);
        System.out.println("Número3: " + numRandom3);
        System.out.println("Número4: " + numRandom4);
        
        // Mayor de 2 números
        //int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        //int mayor = Math.max(numRandom, numRandom2);

        // Mayor de 3 números
        //int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        //mayor = mayor > numRandom3 ? mayor : numRandom3;

        //int mayor = Math.max(Math.max(numRandom, numRandom2), numRandom3);

        // Mayor de 4 números
        int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        mayor = mayor > numRandom3 ? mayor : numRandom3;        
        mayor = mayor > numRandom4 ? mayor : numRandom4;        

        System.out.println("Mayor: " + mayor);
    }
}
