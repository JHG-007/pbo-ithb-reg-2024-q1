package Model;

public class TiketEkonomi extends Tiket implements Tiket_Interface {
    private double parasutTambahan;

    public TiketEkonomi(double kg, double km, double parasutTambahan) {
        super(kg, km);
    }

    public double getParasutTambahan() {
        return parasutTambahan;
    }

    public void setParasutTambahan(double parasutTambahan) {
        this.parasutTambahan = parasutTambahan;
    }

    @Override
    public double hitungBiayaTiket() {
        double harga = 0;
        if (this.getKg() > 5) {
            harga = (this.getKm() * 7500) + (this.getKg() * 1500) + 5000;

        } else {
            harga = (this.getKm() * 7500) + (this.getKg() * 0) + 5000;
        }
        return harga;
    }
}
