package sbn;

import java.util.ArrayList;

public class ListSBN {
    public static class SBN {
        private String nama;
        private double bunga;
        private int jangkaWaktu;
        private String tanggalJatuhTempo;
        private long  kuotaNasional;

        public SBN(String nama, double bunga, int jangkaWaktu, String tanggalJatuhTempo, long kuotaNasional) {
            this.nama = nama;
            this.bunga = bunga;
            this.jangkaWaktu = jangkaWaktu;
            this.tanggalJatuhTempo = tanggalJatuhTempo;
            this.kuotaNasional = kuotaNasional;
        }

        @Override
        public String toString() {
            return "Nama SBN: " + nama +
                   ", Bunga: " + bunga + "%" +
                   ", Jangka Waktu: " + jangkaWaktu + " tahun" +
                   ", Jatuh Tempo: " + tanggalJatuhTempo +
                   ", Kuota Nasional: " + kuotaNasional;
        }
    }

    private static ArrayList<SBN> list = new ArrayList<>();

    static {
        list.add(new SBN("ORI020", 5.45, 3, "15-04-2027", 7_500_000_000L));
        list.add(new SBN("ORI021", 5.35, 3, "15-07-2027", 7_000_000_000L));
        list.add(new SBN("SR013", 6.05, 3, "10-03-2026", 8_500_000_000L));
        list.add(new SBN("SR016", 5.50, 3, "10-12-2026", 7_000_000_000L));
        list.add(new SBN("SR017", 5.40, 3, "10-03-2027", 6_500_000_000L));
        list.add(new SBN("SR018", 6.25, 3, "10-03-2028", 8_000_000_000L));
        list.add(new SBN("SBR009", 5.65, 2, "20-02-2027", 7_000_000_000L));
        list.add(new SBN("SBR010", 5.50, 2, "20-08-2027", 7_500_000_000L));
        list.add(new SBN("SBR011", 5.40, 2, "20-02-2028", 8_000_000_000L));
        list.add(new SBN("SBR012", 6.15, 2, "20-08-2028", 8_500_000_000L));
    }

    public static void AllSBN() {
        System.out.println("        ============================");
        System.out.println("        ========= List SBN =========");
        System.out.println("        ============================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static ArrayList<SBN> getList() {
        return list;
    }

    public static void tambahSBN(SBN sbn) {
        list.add(sbn);
    }
}

