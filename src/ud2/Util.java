package ud2;

public class Util {
    // FECHAS
    public static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
    }

    public static boolean esFechaCorrecta(int dia, int mes, int anho) {
        int diasMes = getDiasMes(mes, anho);

        if (mes < 1 || mes > 12 || dia < 1 || dia > diasMes)
            return false;
        else
            return true;
    }

    public static int getDiasMes(int mes, int anho) {
        int diasMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> esBisiesto(anho) ? 29 : 28;
            default -> 0;
        };
        return diasMes;
    }

    // NUMEROS
    public static boolean esPrimo(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static boolean esCapicua(long numero) {
        return numero == invertir(numero);
    }

    public static long invertir(long numero) {
        long invertido = 0;
        while (numero > 0) {
            long digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        return invertido;
    }

    public static int numDigitos(int n) {
        int dig = 1;
        while (n / Math.powExact(10, dig) > 0) {
            dig++;
        }
        return dig;
    }

    public static int primerDigito(int n) {
        int num = n / (int) Math.pow(10, numDigitos(n) - 1);
        return num;
    }

    public static long factorial(long n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // DIBUJOS
    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            // Imprime los espacios
            for (int e = 1; e <= n - i; e++)
                System.out.print(" ");

            // Imprime los asteriscos
            for (int a = 1; a <= i; a++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // VALIDACIONES
    public static char letraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }

    public static char letraDNISwitch(int numDNI) {

        int letra = numDNI % 23;
        switch (letra) {
            case 0:
                return 'T';

            case 1:
                return 'R';

            case 2:
                return 'W';

            case 3:
                return 'A';

            case 4:
                return 'G';

            case 5:
                return 'M';

            case 6:
                return 'Y';

            case 7:
                return 'F';

            case 8:
                return 'P';

            case 9:
                return 'D';

            case 10:
                return 'X';

            case 11:
                return 'B';

            case 12:
                return 'N';

            case 13:
                return 'J';

            case 14:
                return 'Z';

            case 15:
                return 'S';

            case 16:
                return 'Q';

            case 17:
                return 'V';

            case 18:
                return 'H';

            case 19:
                return 'L';

            case 20:
                return 'C';

            case 21:
                return 'K';

            case 22:
                return 'E';

            default:
                return ' ';

        }

    }

    public static boolean esValidoDNI(int numDNI, char letra) {
        return Util.numDigitos(numDNI) == 8 && letra == letraDNI(numDNI);
    }

}
