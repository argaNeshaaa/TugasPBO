package customer;
import input.InputUtility;
import saham.ListSahamCustomer;
import saham.SahamUser1;
import sbn.ListSBNCustomer;
import sbn.SBNUser1;
import screen.Screen;

public class Portofolio {
    public static boolean backChooseInvestment = false;
    public static void main() {
        boolean backChoosePorto = true;
        while (backChoosePorto) {
        Screen.clearScreen();
        System.out.println("        =============================");
        System.out.println("        ==        Portofolio       ==");
        System.out.println("        =============================");
        System.out.println("        == 1.Saham/2.SBN/3.Kembali ==");
        System.out.println("        =============================");
        System.out.println("");
        System.out.println("");

        System.out.print("Pilih Portofolio : ");
        int Portofolio = InputUtility.scanner.nextInt();
        if (Portofolio == 1) {
            int TotalIndex = ListSahamCustomer.getList().size();
           boolean backChoosePortoSaham = true;
        while (backChoosePortoSaham) {
        Screen.clearScreen();
        System.out.println("        =============================");
        System.out.println("        ==        Portofolio       ==");
        System.out.println("        =============================");
        System.out.println("        ==          Saham          ==");
        System.out.println("        =============================");
        System.out.println("");
        System.out.println("");
        ListSahamCustomer.AllPortoSaham();
        System.out.println(TotalIndex + 1 +" Kembali");
        System.out.print("Pilih Saham : ");
        int chooseSaham = InputUtility.scanner.nextInt();
        int indexNumber = chooseSaham - 1 ;
        if (chooseSaham > 0 && chooseSaham <= TotalIndex) {
            SahamUser1 SahamUser1 = ListSahamCustomer.getList().get(indexNumber);
            Screen.clearScreen();
            System.out.printf(" %-10s %-15s %-15s %-10s%n", "Nama", "Total Harga", "Total Beli", "Lot Dibeli");
            System.out.printf(" %-10s %-15.2f %-15.2f %-10d%n", 
                SahamUser1.getNama(), 
                SahamUser1.getHarga()*SahamUser1.getLotDibeli(),
                SahamUser1.getHargaBeli()*SahamUser1.getLotDibeli(),
                SahamUser1.getLotDibeli());
            System.out.printf(" %-25s%n", "1.Kembali");
            System.out.print("Pilih Action : ");
            int BackOrNo = InputUtility.scanner.nextInt();

            if (BackOrNo == 1) {
                backChoosePortoSaham = true;
            } else {
                backChoosePortoSaham = false;
            }
            
        }
        else if (chooseSaham == TotalIndex + 1) {
            backChoosePortoSaham = false;
            backChoosePorto = true;
        }
    }
        } else if (Portofolio == 2) {
            int TotalIndex = ListSBNCustomer.getList().size();
            boolean backChoosePortoSBN = true;
        while (backChoosePortoSBN) {
            Screen.clearScreen();
        System.out.println("        =============================");
        System.out.println("        ==        Portofolio       ==");
        System.out.println("        =============================");
        System.out.println("        ==           SBN           ==");
        System.out.println("        =============================");
        System.out.println("");
        System.out.println("");
        ListSBNCustomer.AllPortoSBN();
        System.out.println(TotalIndex + 1 +" Kembali");
        System.out.print("Pilih SBN : ");
        int chooseSBN = InputUtility.scanner.nextInt();
        int indexNumber = chooseSBN - 1 ;
        if (chooseSBN > 0 && chooseSBN <= TotalIndex) {
            SBNUser1 SBNUser1 = ListSBNCustomer.getList().get(indexNumber);
            Screen.clearScreen();
            System.out.printf(" %-10s %-25s %-25s%n", "Nama", "Nominal SBN Dimiliki", "Bunga SBN Setiap Bulan");
            System.out.printf(" %-10s %-25d %-25.2f%n", 
                SBNUser1.getNama(), 
                SBNUser1.getNominalInvestasi(),
                SBNUser1.getKuponSBN());
            System.out.printf(" %-25s%n", "1.Kembali");
            System.out.print("Pilih Action : ");
            int BackOrNo = InputUtility.scanner.nextInt();

            if (BackOrNo == 1) {
                backChoosePortoSBN = true;
                }
                else {
                backChoosePortoSBN = false;
                }
            }
                else if (chooseSBN == TotalIndex + 1) {
                    backChoosePortoSBN = false;
                    backChoosePorto = true;
            }   
        }
    }
         else if (Portofolio ==3) {
            backChoosePorto = false;
            backChooseInvestment = true;
        } else {
            backChoosePorto = false;
            backChooseInvestment = false;
        }
        }
    }
}
