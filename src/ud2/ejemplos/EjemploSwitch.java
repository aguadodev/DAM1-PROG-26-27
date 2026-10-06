package ud2.ejemplos;

public class EjemploSwitch {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        int pos = 20;

        switch (pos) {
            case 1:
                System.out.println("Medalla de Oro");
                break;
            case 2:
                System.out.println("Medalla de Plata");
                break;
            case 3:
                System.out.println("Llegaste de tercer@");
                System.out.println("Medalla de Bronce");
                break;
            default:
                System.out.println("No hay podio");
        }

        System.out.println("Fin del programa");
    }
}
