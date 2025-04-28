package login;
import input.InputUtility;
import admin.AdminApp;
import customer.CustomerApp;
import user.User;
import user.UserData;

public class LoginApp {
    private static String inputUsername = null;
    public static void loginProcess() {
        String inputPassword = null;
        boolean loginBerhasil = false;
        boolean isAdmin = false;

        System.out.print("Masukkan username: ");
        inputUsername = InputUtility.scanner.nextLine();

        System.out.print("Masukkan password: ");
        inputPassword = InputUtility.scanner.nextLine();


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
    public static String getInputUsername() {
        return inputUsername;
    }
}