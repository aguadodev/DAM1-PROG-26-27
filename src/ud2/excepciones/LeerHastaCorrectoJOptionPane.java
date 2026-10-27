package ud2.excepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeerHastaCorrectoJOptionPane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean lecturaCorrecta = false;
        do {
            try {
                String numStr = JOptionPane.showInputDialog("Escribe un número entero:");
                numero = Integer.parseInt(numStr);
                lecturaCorrecta = true;
            } catch (NumberFormatException  e) {
                // Lectura incorrecta
                JOptionPane.showMessageDialog(null, "ERROR: No es un número entero");
            }
        } while (!lecturaCorrecta);
        
        JOptionPane.showMessageDialog(null, "Número introducido: " + numero);
    }
}
