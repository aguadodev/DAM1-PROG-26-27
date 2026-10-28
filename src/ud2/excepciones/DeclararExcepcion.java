package ud2.excepciones;

import java.io.IOException;

public class DeclararExcepcion {
    public static void main(String[] args) {
        char letra;
        try {
            letra = leerLetra();
            System.out.println(letra);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char leerLetra() throws IOException {
        char car = ' ';
        System.out.println("Introduce un carácter");
        car = (char) System.in.read();
        return car;        
    }
}

