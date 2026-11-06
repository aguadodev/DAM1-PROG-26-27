package ud2.examen.xxx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DistanciaGPS {
    static double distancia(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371;
        double lat1R = Math.toRadians(lat1);
        double lon1R = Math.toRadians(lon1);
        double lat2R = Math.toRadians(lat2);
        double lon2R = Math.toRadians(lon2);

        double a = Math.pow(Math.sin((lat2R - lat1R) / 2), 2) + Math.cos(lat1R) * Math.cos(lat2R) * Math.pow(Math.sin((lon2R - lon1R) / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }

    @Test
    void mismoPuntoDistanciaCero() {
        assertEquals(0.0, distancia(42.3897, -8.7099, 42.3897, -8.7099), 0.0001);
    }


    @Test
    void iesChanDoMonteAPontevedra() {
        // IES Chan do Monte (Marín) → centro de Pontevedra, ≈ 6.3 km
        assertEquals(7.10, distancia(42.3897, -8.7099, 42.4310, -8.6440), 0.1);
    }


    @Test
    void iesChanDoMonteAMarinCentro() {
        // IES Chan do Monte → centro de Marín, ≈ 1.2 km
        assertEquals(0.82, distancia(42.3897, -8.7099, 42.3930, -8.7010), 0.1);
    }


    @Test
    void pontevedraAMarin() {
        // Centro de Pontevedra → centro de Marín, ≈ 7.0 km
        assertEquals(6.30, distancia(42.4310, -8.6440, 42.3930, -8.7010), 0.5);
    }


    @Test
    void simetriaIdaYVuelta() {
        assertEquals(
            distancia(42.3897, -8.7099, 42.4310, -8.6440),
            distancia(42.4310, -8.6440, 42.3897, -8.7099),
            0.0001);
    }


}
