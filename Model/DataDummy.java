package Model;

import java.util.HashMap;

public class DataDummy {
    private static HashMap<String, Tiket> listTiket = new HashMap<String, Tiket>();

    public static void createDummy() {
        TiketEkonomi[] listTiketEkonomi = {
                new TiketEkonomi(7, 10, 0),
                new TiketEkonomi(4, 5, 0),
                new TiketEkonomi(6, 8, 0)
        };

        TiketBusiness[] listTiketBusiness = {
                new TiketBusiness(10, 12, true),
                new TiketBusiness(4, 4, false),
                new TiketBusiness(8, 7, true)
        };

        TiketFirstClass[] listTiketFirstClass = {
                new TiketFirstClass(15, 10, true, "Sirloin Steak, Caesar's Salad"),
                new TiketFirstClass(6, 5, false, "Chicken Tenderloin, Cola"),
                new TiketFirstClass(3, 7, false, "Fried Rice, Orange Juice")
        };

        for (int i = 0; i < listTiketFirstClass.length; i++) {
            listTiket.put("" + i, listTiketEkonomi[i]);
            listTiket.put("" + (i + 3), listTiketBusiness[i]);
            listTiket.put("" + (i + 6), listTiketFirstClass[i]);
        }
    }

    public static HashMap<String, Tiket> getListTiket() {
        return listTiket;
    }

    public static void setListTiket(HashMap<String, Tiket> listTiket) {
        DataDummy.listTiket = listTiket;
    }

}
