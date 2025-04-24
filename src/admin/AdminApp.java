package admin;
import java.util.Scanner;
import screen.Screen;

public class AdminApp {
    public static void main(String[] args) {
        Screen.clearScreen(args);
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
            System.out.println("Saham Admin");
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

