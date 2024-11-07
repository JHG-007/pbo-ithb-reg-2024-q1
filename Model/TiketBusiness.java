package Model;

public class TiketBusiness extends Tiket implements Tiket_Interface {
    private boolean orderFood;

    public TiketBusiness(double kg, double km, boolean orderFood) {
        super(kg, km);
        this.orderFood = orderFood;
    }

    public boolean isOrderFood() {
        return orderFood;
    }

    public void setOrderFood(boolean orderFood) {
        this.orderFood = orderFood;
    }

    @Override
    public double hitungBiayaTiket() {
        double harga = 0;
        if (this.getKg() > 5) {
            harga = (this.getKm() * 7500) + (this.getKg() * 1500);
        } else {
            harga = (this.getKm() * 7500) + (this.getKg());
        }

        if (orderFood == true) {
            harga = harga * 0.1;
        }
        return harga;
    }
}