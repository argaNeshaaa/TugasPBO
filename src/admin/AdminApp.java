package admin;
import java.util.Scanner;
import saham.*;
import screen.Screen;

public class AdminApp {
    public static void main() {
        Screen.clearScreen();
        header();
        chooseInvesmentAdmin();
    }

    private static void header() {
        System.out.println("        =============================");
        System.out.println("        == Investasi Saham dan SBN ==");
        System.out.println("        =============================");
    }
    private static void chooseInvesmentAdmin() {
        System.out.println("        == 1.Saham/2.SBN/3.Logout  ==");
        System.out.println("        =============================");
        System.out.println("");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih Investasi : ");
        int invesment = scanner.nextInt();

        if (invesment == 1) {
            boolean back = true;
            while (back) {
            ListSaham.AllSaham();
            System.out.println("11 Tambah Saham");
            System.out.println("12 Kembali");
            System.out.print("Pilih Saham : ");
            int chooseSaham = scanner.nextInt();
            int indexNumber = chooseSaham - 1 ;
            if (chooseSaham >= 0 && chooseSaham <= ListSaham.getList().size()) {
                Saham saham = ListSaham.getList().get(indexNumber);
                Screen.clearScreen();
                System.out.printf(" %-10s %-15s %-10s%n", "Nama", "Harga", "Lot Tersedia");
                System.out.printf(" %-10s %-15.2f %-10d%n", 
                saham.getNama(), 
                saham.getHarga(), 
                saham.getLotTersedia()
                );
                System.out.printf(" %-25s%n %-25s%n","1.Ubah Harga","2.Kembali");
                System.out.print("Pilih Action : ");
                int ChangePrice = scanner.nextInt();
                if (ChangePrice == 1) {
                    System.out.print("Ubah Harga Menjadi : ");
                    double NewPrice = scanner.nextDouble();
                    saham.setHarga(NewPrice);
                    System.out.println("Harga Saham Diubah Menjadi " + saham.getHarga());
                }
            } else if (chooseSaham == 11) {
                
            }

        }
        }
        else if (invesment == 2) {
            System.out.println("SBN Admin");
        }
        else if (invesment == 3) {
            System.out.println("Logout");
        }
        scanner.close();
    }
}

