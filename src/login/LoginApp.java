package login;
import input.InputUtility;
import admin.AdminApp;
import customer.CustomerApp;
import user.User;
import user.UserData;

public class LoginApp {
    public static void loginProcess() {

        System.out.print("Masukkan username: ");
        String inputUsername = InputUtility.scanner.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = InputUtility.scanner.nextLine();

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
                AdminApp.main();
            } else {
                CustomerApp.main();
            }
        } else {
            System.out.println("Login gagal!");
        }

    }
}