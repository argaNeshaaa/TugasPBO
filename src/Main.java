import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        System.out.print("Masukkan username: ");
        username = input.nextLine();

        System.out.print("Masukkan password: ");
        password = input.nextLine();

        if (username.equals("admin") && password.equals("12345")) {
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("\n=== Pilih Menu Admin ===");
                System.out.println("1. Saham");
                System.out.println("2. SBN");
                System.out.println("3. Logout");
                System.out.print("Pilih: ");
                String pilihan = input.nextLine();

                switch (pilihan) {
                    case "1":
                        sahamMenu();
                        break;
                    case "2":
                        sbnMenu();
                        break;
                    case "3":
                        System.out.println("Logout berhasil.");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
            }
        } else {
            System.out.println("Username atau password salah.");
        }
    }

    public static void sahamMenu() {
        System.out.println("=== MENU SAHAM ===");
        // belum isi logika saham
    }

    public static void sbnMenu() {
        System.out.println("=== MENU SBN ===");
        //belum isi logika sbn
    }
}
