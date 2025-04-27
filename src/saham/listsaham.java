package saham;
import java.util.ArrayList;
import screen.Screen;

public class ListSaham {
    private static ArrayList<Saham> list = new ArrayList<>();

    static {
        list.add(new Saham("BBCA", 8850.0, 14400));
        list.add(new Saham("AALI", 5800.0, 5500));
        list.add(new Saham("UNVR", 1495.0, 7736));
        list.add(new Saham("BMRI", 4989.0, 28300));
        list.add(new Saham("BBRI", 3730.0, 27300));
        list.add(new Saham("BBNI", 4170.0, 14500));
        list.add(new Saham("AGRO", 204.0, 18977));
        list.add(new Saham("ICBP", 11000.0, 41480));
        list.add(new Saham("ACES", 500.0, 74170));
        list.add(new Saham("ANTM", 2150.0, 25200));
    }

public static void AllSaham() {
    Screen.clearScreen();
    System.out.println("        ============================");
    System.out.println("        ======== List Saham ========");
    System.out.println("        ============================");
    System.out.printf("%-3s %-10s %-15s %-10s%n", "No", "Nama", "Harga", "Lot Tersedia");
    System.out.println("-----------------------------------------------");
    int i = 0;
    for (Saham saham : list) {
        System.out.printf("%-3d %-10s Rp%-13.2f %-10d%n",i + 1, saham.getNama(), saham.getHarga(), saham.getLotTersedia());
        i++;
    }
}

public static ArrayList<Saham> getList() {
    return list;
}

public static void tambahSaham(Saham sahamBaru) {
    list.add(sahamBaru);
}

}

