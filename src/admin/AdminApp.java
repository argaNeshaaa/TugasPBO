package admin;
import java.util.Scanner;
import saham.ListSaham;
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
            ListSaham.AllSaham();
            System.out.println("11 Tambah Saham");
            System.out.println("12 Kembali");
            System.out.print("Pilih Saham : ");
            int chooseSaham = scanner.nextInt();
            int indexNumber = chooseSaham - 1 ;
            if (chooseSaham >= 0 && chooseSaham <= ListSaham.getList().size()) {
                System.out.println(ListSaham.getList().get(indexNumber));
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

