package View;


import Controller.*;
import Model.*;

import java.util.ArrayList;
public class Print {
    public static void printReceipt(){
        double total =  BiayaTiket.hitungTotalBiaya(null);
        System.out.print("Total: " + total);
    }

    public static void printTotal(){
        ArrayList<String> listTiket = new ArrayList<>();
        System.out.println();
    }
}
