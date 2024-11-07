package Controller;

import Model.*;

import java.util.ArrayList;

public class BiayaTiket {
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

    public static double hitungTotalBiaya(ArrayList<String> id) {
        double harga = 0;
        for (String tikets : id) {
            harga += hitungTiket(tikets);
        }
        return harga;
    }
}
