package customer;

import input.InputUtility;
import screen.Screen;

public class CustomerApp {
public static void main() {
        Screen.clearScreen();
        chooseInvesmentCustomer();
    }

    private static void chooseInvesmentCustomer() {
        boolean backChooseInvestment = true;
        while (backChooseInvestment) {
        Screen.clearScreen();
        System.out.println("        =============================");
        System.out.println("        == Investasi Saham dan SBN ==");
        System.out.println("        =============================");
        System.out.println("        == 1.Saham/2.SBN/3.Portofolio/4.Logout  ==");
        System.out.println("        =============================");
        System.out.println("");
        System.out.println("");

        System.out.print("Pilih Investasi : ");
        int invesment = InputUtility.scanner.nextInt();

        if (invesment == 1) {
            CustomerSaham.main();
        }
        else if (invesment == 2) {
            CustomerSBN.main();
        }
        else if (invesment == 3) {
            Screen.clearScreen();
            System.out.println("Logout Berhasil");
            backChooseInvestment = false;
        }
    }
}
}
