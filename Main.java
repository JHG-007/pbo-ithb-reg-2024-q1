import View.MainView;
import Model.DataDummy;

public class Main {
    public static void main(String[] args) {
        DataDummy.createDummy();
        MainView.menu();
    }
}
