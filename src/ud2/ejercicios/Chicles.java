package ud2.ejercicios;

public class Chicles {

    public static int totalChicles(int chiclesComprados, int envoltoriosParaRegalo, int chiclesRegalo) {
        if (chiclesComprados < 0 || envoltoriosParaRegalo < 0 || chiclesRegalo < 0 || chiclesRegalo > envoltoriosParaRegalo) {
            // Si hay casos especiales de entrada inválida termino con una "guard clause"
            return -1;
        } 

        int totalChicles = 0;
        // TODO Programar casos generales

        return totalChicles;
    }

    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));  // 31
        System.out.println(totalChicles(5, 5, 1));  // 6
        System.out.println(totalChicles(100, 10, 1));  // 111
        System.out.println(totalChicles(100, 5, 1));  // 100
        System.out.println(totalChicles(20, 2, 5));  // -1
        System.out.println(totalChicles(10, -1, 0));  // -1
    }

}
