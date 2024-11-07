package Model;

public abstract class Tiket {
    private double kg, km;

    public Tiket(double kg, double km) {
        this.kg = kg;
        this.km = km;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}