package admin;

import input.InputUtility;
import saham.AddSaham;
import saham.ListSaham;
import saham.Saham;
import screen.Screen;

public class AdminSaham {
    public static boolean backChooseInvestment = false;
    public static void main() {
        boolean backListSaham = true;
        int TotalIndex = ListSaham.getList().size();
        backListSaham = true;
            while (backListSaham) {
            Screen.clearScreen();
            ListSaham.AllSaham();
            System.out.println(TotalIndex + 1 +" Tambah Saham");
            System.out.println(TotalIndex + 2 +" Kembali");
            System.out.print("Pilih Saham : ");
            int chooseSaham = InputUtility.scanner.nextInt();
            int indexNumber = chooseSaham - 1 ;

            // Ketika Angka yang diinput merupakan index dari array list saham
            if (chooseSaham > 0 && chooseSaham <= TotalIndex) {
                Saham saham = ListSaham.getList().get(indexNumber);
                Screen.clearScreen();
                System.out.printf(" %-10s %-15s %-10s%n", "Nama", "Harga", "Lot Tersedia");
                System.out.printf(" %-10s %-15.2f %-10d%n", 
                    saham.getNama(), 
                    saham.getHarga(), 
                    saham.getLotTersedia());
                System.out.printf(" %-25s%n %-25s%n","1.Ubah Harga","2.Kembali");
                System.out.print("Pilih Action : ");
                int ChangePrice = InputUtility.scanner.nextInt();

                // Ketika admin ingin mengubah harga
                if (ChangePrice == 1) {
                    System.out.print("Ubah Harga Menjadi : ");
                    double NewPrice = InputUtility.scanner.nextDouble();
                    saham.setHarga(NewPrice);
                    Screen.clearScreen();
                    
                    // Berhasil Merubah Harga
                    if (saham.getHarga() == NewPrice) {
                        System.out.println("Berhasil Mengubah Harga menjadi " + NewPrice);
                    } 
                    // Gagal Merubah Harga
                    else {
                        System.out.println("Gagal Mengubah Harga");
                    }

                    System.out.println("1.Kembali");
                    System.out.print("Action :");
                    int afterChangePrice = InputUtility.scanner.nextInt();

                    // Ketika admin ingin kembali ke daftar saham
                    if (afterChangePrice == 1) {
                        backListSaham = true;
                    } 
                    // Ketika tidak ingin kembali ke daftar saham
                    else {
                        backListSaham = false;
                    }
                }
                else{
                    backListSaham = true;
                }
            } 
            
            // Ketika admin ingin menambah saham
            else if (chooseSaham == TotalIndex + 1 ) {
                AddSaham.tambahSahamBaru();
                TotalIndex++;
            }

            // Ketika admin ingin kembali memili Investment
            else if (chooseSaham == TotalIndex + 2) {
                backListSaham = false;
                backChooseInvestment = true;
            }

        }
}
}
