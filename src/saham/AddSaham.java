package saham;
import input.InputUtility;
import screen.Screen;

public class AddSaham {

    public static void tambahSahamBaru() {
        Screen.clearScreen();
        System.out.print("Masukkan nama saham: ");
        String nama = InputUtility.scanner.next();

        System.out.print("Masukkan harga saham: ");
        double harga = InputUtility.scanner.nextDouble();


        System.out.print("Masukkan jumlah lembar tersedia: ");
        int lembar = InputUtility.scanner.nextInt();
        Saham sahamBaru = new Saham(nama, harga, lembar);
        ListSaham.tambahSaham(sahamBaru);
        System.out.println("Saham berhasil ditambahkan!");
    }
}