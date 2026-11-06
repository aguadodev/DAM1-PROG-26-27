package ud3.ejemplos;

public class EjemploReferencias {
    public static void main(String[] args) {
        int a[], b[], c[]; // variables
        b = new int[4]; // tabla de cuatro enteros accesible mediante la variable b
        c = new int[5]; // tabla de cinco enteros accesible mediante la variable c
        // new int[3]; // tabla cuya referencia no se asigna a ninguna variable
        a = c;

        a[2] = 5;
        System.out.println(c[2]);

        c = null;
        a = null;

        System.out.println(c[2]);


        System.out.println("Fin de programa");
    }
}
