package saham;
import java.util.ArrayList;
import screen.Screen;

class Saham {
    String nama;
    double harga;
    int lembarTersedia;

    public Saham(String nama, double harga, int lembarTersedia) {
        this.nama = nama;
        this.harga = harga;
        this.lembarTersedia = lembarTersedia;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public int getLembarTersedia(){
        return lembarTersedia;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setLembarTersedia(int lembarTersedia) {
        this.lembarTersedia = lembarTersedia;
    }
    public String toString() {
        return nama + "- Harga: Rp"+ harga + "- Lembar Tersedia: " + lembarTersedia;
    }
}


public class ListSaham {
    private static ArrayList<Saham> list = new ArrayList<>();

    static {
        list.add(new Saham("BBCA", 8850.0, 1440000));
        list.add(new Saham("AALI", 5800.0, 5500));
        list.add(new Saham("UNVR", 1495.0, 773630));
        list.add(new Saham("BMRI", 4989.0, 2830000));
        list.add(new Saham("BBRI", 3730.0, 2730000));
        list.add(new Saham("BBNI", 4170.0, 1450000));
        list.add(new Saham("AGRO", 204.0, 189770));
        list.add(new Saham("ICBP", 11000.0, 41480));
        list.add(new Saham("ACES", 500.0, 741700));
        list.add(new Saham("ANTM", 2150.0, 2520000));
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
        int lot = saham.getLembarTersedia() / 100;
        System.out.printf("%-3d %-10s Rp%-13.2f %-10d%n",i + 1, saham.getNama(), saham.getHarga(), lot);
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

