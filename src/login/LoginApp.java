package login;
import java.util.Scanner;
import admin.AdminApp;
import customer.CustomerApp;
import user.User;
import user.UserData;

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
            if (u.username.equals(inputUsername) && u.password.equals(inputPassword)) {
                loginBerhasil = true;
                isAdmin = u.isAdmin;
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