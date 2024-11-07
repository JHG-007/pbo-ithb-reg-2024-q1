package View;

import java.util.Scanner;

public class MainView {

    static Scanner scan = new Scanner(System.in);

    public static void menu() {
        System.out.print("1. Total semuanya \n2. Receipt\n Choose: ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                Print.printTotal();
                break;
            case 2:
                Print.printReceipt();
                break;

            default:
                break;
        }
    }
}
