package admin;
import input.InputUtility;
import screen.Screen;

public class AdminApp {
    public static void main() {
        Screen.clearScreen();
        chooseInvesmentAdmin();
    }

    private static void chooseInvesmentAdmin() {
        boolean backChooseInvestment = true;
        while (backChooseInvestment) {
        Screen.clearScreen();
        System.out.println("        =============================");
        System.out.println("        == Investasi Saham dan SBN ==");
        System.out.println("        =============================");
        System.out.println("        == 1.Saham/2.SBN/3.Logout  ==");
        System.out.println("        =============================");
        System.out.println("");
        System.out.println("");

        System.out.print("Pilih Investasi : ");
        int invesment = InputUtility.scanner.nextInt();

        if (invesment == 1) {
            AdminSaham.main();
        }
        else if (invesment == 2) {
            AdminSBN.main();
        }
        else if (invesment == 3) {
            Screen.clearScreen();
            System.out.println("Logout Berhasil");
            backChooseInvestment = false;
        }
    }
}
}

