package SBN;

import input.InputUtility;
import screen.Screen;

public class AddSBN {
    public static void tambahSBNBaru() {
        Screen.clearScreen();
        System.out.print("Masukkan nama SBN: ");
        String nama = InputUtility.scanner.next();

        System.out.print("Masukkan bunga SBN: ");
        double bunga = InputUtility.scanner.nextDouble();

        System.out.print("Masukkan Jangka Waktu SBN: ");
        int jangkaWaktu = InputUtility.scanner.nextInt();

        System.out.print("Masukkan Tanggal Jatuh Tempo (DD-MM-YYYY): ");
        String tanggalJatuhTempo = InputUtility.scanner.next();

        System.out.print("Masukkan Kuota Nasional SBN: ");
        long kuotaNasional = InputUtility.scanner.nextLong();

        SBN SBNBaru = new SBN(nama, bunga, jangkaWaktu, tanggalJatuhTempo, kuotaNasional);
        ListSBN.tambahSBN(SBNBaru);
        System.out.println("SBN berhasil ditambahkan!");
    }
}
