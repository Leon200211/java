package task_17;

public enum Planet {
    Mercury(3.302e23, 2440),
    Venus(4.869e24, 6052),
    Earth(5.974e24, 6378),
    Mars(6.419e23, 3397),
    Jupiter(1.899e27, 71490),
    Saturn(5.685e26, 60270),
    Uranus(8.685e25, 25560),
    Neptune(1.024e26, 24760);

    final double G = 6.67408e-11;
    double P;
    private double massKg;
    private double radiusKm;

    Planet(double massKg, double radiusKm){
        this.massKg = massKg;
        this.radiusKm = radiusKm;

        this.P = (G * massKg) / (radiusKm*radiusKm) / 1000000;
    }
    public double getP() {
        return P;
    }
}