package saham;

import java.util.ArrayList;

import screen.Screen;

public class ListSahamCustomer {
    

    private static ArrayList<SahamUser1> list = new ArrayList<>();

    static {
        list.add(new SahamUser1("BBCA", 8850.0,8000.0, 100, "user1"));
        list.add(new SahamUser1("AALI", 5800.0, 5000.0, 350, "user1"));
        list.add(new SahamUser1("UNVR", 1495.0, 1300.0, 900, "user1"));
        list.add(new SahamUser1("AGRO", 204.0, 170.0, 150, "user1"));
        list.add(new SahamUser1("ACES", 500.0, 450.0, 400, "user1"));
        
    }

    public static void AllSaham() {
    Screen.clearScreen();
    System.out.println("        ============================");
    System.out.println("        ======== List Saham ========");
    System.out.println("        ============================");
    AllPortoSaham();
    }

    public static void AllPortoSaham() {
    System.out.printf("%-3s %-10s %-15s %-15s %-10s%n", "No", "Nama", "Harga Sekarang", "Harga Beli", "Lot Dibeli");
    System.out.println("-----------------------------------------------");
    int i = 0;
    for (SahamUser1 SahamUser1 : list ) {
        System.out.printf("%-3d %-10s Rp%-13.2f Rp%-13.2f %-10d%n",i + 1, SahamUser1.getNama(), SahamUser1.getHarga(), SahamUser1.getHargaBeli(), SahamUser1.getLotDibeli());
        i++;
    }
    }
    
    public static ArrayList<SahamUser1> getList() {
        return list;
    }
    
    public static void tambahSaham(SahamUser1 sahamBaru) {
        list.add(sahamBaru);
    }
}
