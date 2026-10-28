package ud2.ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Chicles {

    public static int totalChicles(int chiclesComprados, int envoltoriosParaRegalo, int chiclesRegalo) {
        if (chiclesComprados < 0 || envoltoriosParaRegalo < 0 || chiclesRegalo < 0 || chiclesRegalo > envoltoriosParaRegalo) {
            // Si hay casos especiales de entrada inválida termino con una "guard clause"
            return -1;
        } 

        int totalChicles = chiclesComprados;
        // TODO Programar casos generales
        

        return totalChicles;
    }

    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));  // 31
        System.out.println(totalChicles(5, 5, 1));  // 6
        System.out.println(totalChicles(100, 10, 1));  // 111
        System.out.println(totalChicles(100, 0, 0));  // 100
        System.out.println(totalChicles(20, 2, 5));  // -1
        System.out.println(totalChicles(10, -1, 0));  // -1
    }

    @Test 
    public void testChicles1() {
        assertEquals(31, totalChicles(25, 5, 1));
    }
    @Test 
    public void testChicles2() {
        assertEquals(6, totalChicles(5, 5, 1));
    }
    @Test 
    public void testChicles3() {
        assertEquals(111, totalChicles(100, 10, 1));
    }
    @Test 
    public void testChicles4() {
        assertEquals(100, totalChicles(100, 0, 0));
    }
    @Test 
    public void testChicles5() {
        assertEquals(-1, totalChicles(20, 2, 5));
    }
    @Test 
    public void testChicles6() {
        assertEquals(-1, totalChicles(10, -1, 0));
    }

}
