package ud2.ejercicios;

public class BinarioDecimal {
    /**
     * 
     * @autor Adrián Núñez
     */
    public static void main(String[] args) {
        int num = 10;

        System.out.println(num + " en decimal es: " + bAD(num));
    }

    public static int bAD(int num) {
        int res = 0;
        String numS = String.valueOf(num);
        int cont = numS.length();
        for (int i = 0; i < cont; i++) {
            res += num % Math.powExact(10, i + 1) / Math.powExact(10, i) * Math.powExact(2, i);
        }
        return res;
    }

}
