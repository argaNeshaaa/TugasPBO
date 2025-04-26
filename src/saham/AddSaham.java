package saham;
import java.util.Scanner;
import screen.Screen;

public class AddSaham {

    public static void tambahSahamBaru() {
        Screen.clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama saham: ");
        String nama = scanner.next();

        System.out.print("Masukkan harga saham: ");
        double harga = scanner.nextDouble();


        System.out.print("Masukkan jumlah lembar tersedia: ");
        int lembar = scanner.nextInt();
        Saham sahamBaru = new Saham(nama, harga, lembar);
        ListSaham.tambahSaham(sahamBaru);
        System.out.println("Saham berhasil ditambahkan!");
        scanner.close();
    }
}