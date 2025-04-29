package sbn;

import java.util.ArrayList;

import screen.Screen;

public class ListSBNCustomer {
    
    private static ArrayList<SBNUser1> list = new ArrayList<>();

    static {
        list.add(new SBNUser1("ORI020", 5.45, 3, "15-04-2027", 7_500_000_000L, 9000000, "user1"));
        list.add(new SBNUser1("SBR009", 5.65, 2, "20-02-2027", 7_000_000_000L, 10000000, "user1"));
        list.add(new SBNUser1("SR013", 6.05, 3, "10-03-2026", 8_500_000_000L, 70000000, "user1"));
        list.add(new SBNUser1("SR017", 5.40, 3, "10-03-2027", 6_500_000_000L, 10000000, "user1"));
        list.add(new SBNUser1("SBR012", 6.15, 2, "20-08-2028", 8_500_000_000L, 10000000, "user1"));
    }

    public static void AllSBN() {
        Screen.clearScreen();
        System.out.println("        ============================");
        System.out.println("        ========= List SBN =========");
        System.out.println("        ============================");
        AllPortoSBN();

    }

    public static void AllPortoSBN() {
        System.out.printf("%-3s %-8s %-8s %-15s %-15s %-15s %-20s%n", "No", "Nama", "Bunga", "Jangka Waktu", "Jatuh Tempo", "Kuota Nasional","Nominal Pembelian");
        System.out.println("-----------------------------------------------------------------------");
        int i = 0;
    for (SBNUser1 SBNUser1 : list) {
        System.out.printf("%-3d %-8s %-13.2f %-10d %-15s %-15d %-20s%n",i + 1, SBNUser1.getNama(), SBNUser1.getBunga(), SBNUser1.getJangkaWaktu(), SBNUser1.getTanggalJatuhTempo(), SBNUser1.getKuotaNasional(), SBNUser1.getNominalInvestasi());
        i++;
    }
    }
    public static ArrayList<SBNUser1> getList() {
        return list;
    }

    public static void BeliSBNBaru(SBNUser1 SBNBaru) {
        list.add(SBNBaru);
    }
}
