package ud3.ejemplos;

import java.util.Arrays;

import ud3.ArraysUtil;

public class EjemplosClaseArrays {
    public static void main(String[] args) {
        
        /*System.out.println("NUMEROS");
        int[] numeros = ArraysUtil.arrayAleatorio(10, 1, 20);

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        System.out.println("Existe el 15? : " + ArraysUtil.buscar(numeros, 15));
        int posicion = Arrays.binarySearch(numeros, 15);
        System.out.println("BinarySearch (15): " + posicion);
        if (posicion < 0) {
            int indiceDeInsercion = -posicion -1;
            System.out.println("Debería insertarse en la posición " + indiceDeInsercion);
        }
        */


        
        System.out.println("STRINGS");
        String[] alumnos = { "Juan A", "Matías C", "Pablo C", "David D", "Raúl E", "David E",
                "Marcos FC", "Pelayo F", "Marcos FS", "Brais G", "Fran L", "Marco L", "Maria M", "Tomas M", "Adán M",
                "Daniel M", "Diego M",
                "Lunna M", "Hendrix M", "Alexandre M", "Adrian N", "Adrian P", "Jorge P", "Martín R", "Juan S",
                "Martín S", "Aiko S", "Angel S", "Darianys V", "Yubay W", "Miguel L" };
      
        Arrays.sort(alumnos);
        System.out.println(Arrays.toString(alumnos));

        String nuevoAlumno = "Carlos";
        System.out.println("Existe el " + nuevoAlumno + "? : " + ArraysUtil.buscar(alumnos, nuevoAlumno));

        int posicion = Arrays.binarySearch(alumnos, nuevoAlumno);
        System.out.println("BinarySearch (" + nuevoAlumno + "): " + posicion);
        if (posicion < 0) {
            int indiceDeInsercion = -posicion -1;
            System.out.println("Debería insertarse en la posición " + indiceDeInsercion);
        }                
        
        String[] alumnos2 = Arrays.copyOf(alumnos, alumnos.length);
        System.out.println("ALUMNOS2:\n" + Arrays.toString(alumnos2));

        System.out.println("Son iguales (==)? " + (alumnos == alumnos2));
        System.out.println("Son iguales (equals)? " + Arrays.equals(alumnos, alumnos2));
        
        
        


    }
}
