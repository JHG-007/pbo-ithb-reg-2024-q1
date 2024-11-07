package Model;

public class TiketFirstClass extends Tiket implements Tiket_Interface {
    private boolean asuransi;
    private String makanan;

    public TiketFirstClass(double kg, double km, boolean asuransi, String makanan) {
        super(kg, km);
        this.asuransi = asuransi;
        this.makanan = makanan;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    @Override
    public double hitungBiayaTiket() {
        double harga = 0;
        if (asuransi == true) {
            harga = (this.getKm() * 15000) + (this.getKg() * 0) * 0.1;

        } else {
            harga = (this.getKm() * 15000) + (this.getKg() * 0);

        }
        return harga;
    }
}
