package ud1;

public class EjerciciosConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);

        double x = 9.99;
        int y = (int) x;
        System.out.println(y);

        short s = 5;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);

        int a2 = 5;
        int b2 = 2;
        double resultado = a2 / b2;
        System.out.println(resultado);

        int num = 80;
        char letra = (char) num;
        System.out.println(letra);
        letra += ('a' - 'A');
        System.out.println(letra);

        int x2 = 100;
        double y2 = 20.5;
        int resultado2 = x2 + (int) y2;
        System.out.println(resultado2);

        long grande = 9876543210L;
        int pequeno = (int) grande;
        System.out.println(pequeno);

        char c = 'A';
        int ascii = c;
        System.out.println(ascii);

        byte b3 = 127;
        b3++;
        System.out.println(b3);
        b3--;
        System.out.println(b3);

        int a4 = 5;
        double b4 = 6.4;
        float c4 = (float) b4 + a4 / 2.0f;
        System.out.println(c4);

        byte x5 = 50;
        int y5 = 200;
        double resultado5 = (double) (x5 + y5) / 3;
        System.out.println(resultado5);

        boolean resultado6 = 4 + 5 > 10 - 3;
        System.out.println(resultado6);

        int a6 = 8, b6 = 3, c6 = 6;
        c6 -= a6 / b6 + 2 * (b6++);
        System.out.println(c6);
        System.out.println(b6);

        boolean resultado7 = (8 * 2 + 1) >= (5 + 10 / 2) && 7 % 2 == 1;
        System.out.println(resultado7);

        int x8 = 4, y8 = 7;
        int resultado8 = ++x8 * (y8-- + 2) - x8++;
        System.out.println(resultado8);
        System.out.println(x8);
        System.out.println(y8);

    }
}
