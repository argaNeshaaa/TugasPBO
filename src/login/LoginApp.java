package login;
import admin.AdminApp;
import customer.CustomerApp;
import java.util.Scanner;
import user.User;

public class LoginApp {
    public static void loginProcess(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        boolean loginBerhasil = false;
        boolean isAdmin = false;

        for (User u : UserData.users) {
            if (u.getUsername().equals(inputUsername) && u.getPassword().equals(inputPassword)) {
                loginBerhasil = true;
                isAdmin = u.isAdmin();
                break;
            }
        }

        if (loginBerhasil) {
            if (isAdmin) {
                AdminApp.main(args);
            } else {
                CustomerApp.main(args);
            }
        } else {
            System.out.println("Login gagal!");
        }

        scanner.close();
    }
}
