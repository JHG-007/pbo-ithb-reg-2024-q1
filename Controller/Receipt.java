package Controller;

import Model.*;

public class Receipt {
    public static double hitungTiket(String id) {
        Tiket tiket = DataDummy.getListTiket().get(id);
        double harga = 0;
        if (tiket instanceof TiketEkonomi) {
            harga = ((TiketEkonomi) tiket).hitungBiayaTiket();
        }
         else if (tiket instanceof TiketBusiness) {
            harga = ((TiketBusiness) tiket).hitungBiayaTiket();
        } 
        else {
            harga = ((TiketFirstClass) tiket).hitungBiayaTiket();
        }
        return harga;
    }
}
