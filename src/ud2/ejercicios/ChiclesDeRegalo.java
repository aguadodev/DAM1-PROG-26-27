package ud2.ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


import java.util.Scanner;


/** @author Aiko Serrano Soto */
public class ChiclesDeRegalo {
    public static int totalChicles(int chiclesIniciales, int envoltoriosNecesarios, int chiclesGratisEnLaOferta) {
        int envoltoriosPendientes = chiclesIniciales;
        int totalChicles = chiclesIniciales;
        if (chiclesIniciales < 0 || envoltoriosNecesarios < 0 || chiclesGratisEnLaOferta < 0 || chiclesGratisEnLaOferta > envoltoriosNecesarios) {
            return -1;
        } else if (envoltoriosNecesarios == 0) {
            return chiclesIniciales;
        }
        while (envoltoriosPendientes >= envoltoriosNecesarios) {
            int chiclesDeRegalo = envoltoriosPendientes / envoltoriosNecesarios * chiclesGratisEnLaOferta;
            int envoltorioSobrantes = envoltoriosPendientes % envoltoriosNecesarios;
            // envoltoriosPendientes = (envoltoriosPendientes / envoltoriosNecesarios) * chiclesGratisEnLaOferta;
            totalChicles = totalChicles + chiclesDeRegalo;
            envoltoriosPendientes = envoltorioSobrantes + chiclesDeRegalo;
        }
        return totalChicles;
    }
    public static void main(String[] args) {
        System.out.println(totalChicles(102 , 5, 2));
        final int ENVOLTORIOS_NECESARIOS = 5;
        final int CHICLES_GRATIS = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos chicles compraste inicialmente? ");
        int chiclesIniciales = sc.nextInt();
        sc.close();
        int totalchicles = totalChicles(chiclesIniciales, ENVOLTORIOS_NECESARIOS, CHICLES_GRATIS);
        int chiclesGratis = totalchicles - chiclesIniciales;
        if (totalchicles == -1) {
            System.out.println("No hay oferta");
        } else {
            System.out.println("Ha conseguido un total de " + totalchicles + " con " + chiclesGratis + " gratis");
        }
        System.out.println(totalChicles(25 , 5, 1));
        System.out.println(totalChicles(5 , 5, 1));
        System.out.println(totalChicles(100 , 10, 1));
        System.out.println(totalChicles(100 , 0, 0));
        System.out.println(totalChicles(20 , 2, 5));
        System.out.println(totalChicles(10 , -1, 1));
        
    }


    @Test 
    public void testChicles1() {
        assertEquals(31, totalChicles(25, 5, 1));
    }
    @Test 
    public void testChicles2() {
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
    public void testChiclesTercerParametroMayor() {
        assertEquals(-1, totalChicles(20, 2, 5));
    }
    @Test 
    public void testChiclesParametroErroneo() {
        assertEquals(-1, totalChicles(10, -1, 0));
    }
    @Test 
    public void testChicles7() {
        assertEquals(124, totalChicles(100, 10, 2));
    }
    @Test 
    public void testChicles8() {
        assertEquals(126, totalChicles(102, 10, 2));
    }
    @Test 
    public void testChicles9() {
        assertEquals(168, totalChicles(102, 5, 2));
    }


}
