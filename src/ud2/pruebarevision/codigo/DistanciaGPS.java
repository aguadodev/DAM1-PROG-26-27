package ud2.pruebarevision.codigo;

public class DistanciaGPS {
    public static void main(String[] args) {
        // Madrid (Puerta del Sol) - Barcelona (Plaça de Catalunya)
        double d = distancia(40.4168, -3.7038, 41.3874, 2.1686);
        System.out.printf("Distancia: %.2f km%n", d);
    }

    public static double distancia(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371000;

        Math.toRadians(lat1);
        Math.toRadians(lon1);
        Math.toRadians(lat2);
        Math.toRadians(lon2);

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.pow(Math.sin(dLat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dLon) / 2, 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}
