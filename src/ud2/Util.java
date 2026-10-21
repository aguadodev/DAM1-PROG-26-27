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

}
