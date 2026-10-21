package ud2.ejercicios;

/** @author Jpineport */
public class MCD {

    /*
     * public static int MCD(int a, int b) {
     * -----int i;
     * -----for (i = a; true ; i--) {
     * ---------if ( a%i ==0 && b %i==0 )
     * -------------return i;
     * ----}
     * }
     */

    // ============================================================

    public static String sMCD(int a, int b) {

        int i;
        if (a == b || a == -b)
            return ">>" + Math.abs(a);
        if (a == 0 && b == 0)
            return ">> Indeterminado";
        if (a == 0 || b == 0)
            return ">> " + Math.abs(a + b);

        a = Math.abs(a);
        b = Math.abs(b);
        for (i = Math.min(a, b); i > 1; i--) { // can use true instead of i > 0 but
            if (a % i == 0 && b % i == 0) { // for one just comp doesnt worth the risk
                return ">> " + i; // considering the inneficient it is to begin with.
            }
        }
        return "";
    }
    // ============================================================

    public static int mcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a >= b)
            return mcd(a - b, b);
        return mcd(b - a, b);
    }

    // ============================================================
    public static int mcdII(int a, int b) {
        if (a == b || a == -b)
            return Math.abs(a);
        if (a == 0 && b == 0)
            return 0;
        if (a == 0 || b == 0)
            return Math.abs(a + b);
        a = Math.abs(a);
        b = Math.abs(b);
        return mcdII(Math.max(a, b) - Math.min(a, b), Math.min(a, b)); // it is worse due 3 more comparisons

    }

    public static int mcdIII(int a, int b) {
        if (a == b || a == -b)
            return Math.abs(a);
        if (a == 0 && b == 0)
            return 0;
        if (a == 0 || b == 0)
            return Math.abs(a + b);
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) { // still doing 1 more comp
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        return a;
    }

    public static int mcd_(int a, int b) {
        if( a == b)
            return a;
    if (a >= b)
            return mcd_(a - b, b);
        return mcd_(b - a, b);
    }

    public static int mcdIV(int a, int b) {
        if (a == b || a == -b)
            return Math.abs(a);
        if (a == 0 && b == 0)
            return 0;
        if (a == 0 || b == 0)
            return Math.abs(a + b);
        a = Math.abs(a);
        b = Math.abs(b);
        return mcd_(a , b);

}
    // ============================================================
    public static void main(String[] args) {
        System.out.println(mcd(-75, -15));
    }
}