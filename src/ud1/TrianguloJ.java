package ud1;

import javax.swing.JOptionPane;

/** @author Polo **/

public class TrianguloJ {

    public static void main(String[] args) {

        double b = Double.parseDouble(JOptionPane.showInputDialog("Base del triángulo (cm)"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Altura del triángulo (cm)"));

        double area = b * h / 2;
        JOptionPane.showMessageDialog(null, "El área del triángulo es " + area + " cm.");

    }
}
