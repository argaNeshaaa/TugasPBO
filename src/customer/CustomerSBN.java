package customer;

import SBN.AddSBN;
import SBN.ListSBN;
import SBN.SBN;
import input.InputUtility;
import screen.Screen;

public class CustomerSBN {
    public static boolean backChooseInvestment = false;
    public static void main() {
        boolean backListSBN = true;
        int TotalIndex = ListSBN.getList().size();
        while (backListSBN) {
        Screen.clearScreen();
        ListSBN.AllSBN();
        System.out.println(TotalIndex + 1 +" Kembali");
            System.out.print("Pilih SBN : ");
            int chooseSBN = InputUtility.scanner.nextInt();
            int indexNumber = chooseSBN - 1 ;
            // Ketika Angka yang diinput merupakan index dari array list SBN
            if (chooseSBN > 0 && chooseSBN <= TotalIndex) {
                SBN SBN = ListSBN.getList().get(indexNumber);
                Screen.clearScreen();
                System.out.printf("%-8s %-8s %-15s %-15s %-15s%n", "Nama", "Bunga", "Jangka Waktu", "Jatuh Tempo", "Kuota Nasional");
                System.out.printf("%-8s %-13.2f %-10d %-15s %-15d%n", 
                    SBN.getNama(), 
                    SBN.getBunga(), 
                    SBN.getJangkaWaktu(),
                    SBN.getTanggalJatuhTempo(),
                    SBN.getKuotaNasional());
                System.out.printf(" %-25s%n","1.Kembali");
                System.out.print("Pilih Action : ");
                int TakeSBN = InputUtility.scanner.nextInt();

                // Ketika admin ingin Kembali
                if (TakeSBN == 1) {
                    backListSBN = true;
                }
                else{
                    backListSBN = true;
                }
            } 
            
            // Ketika admin ingin menambah saham
            else if (chooseSBN == TotalIndex + 1 ) {
                AddSBN.tambahSBNBaru();
                TotalIndex++;
            }

            // Ketika admin ingin kembali memili Investment
            else if (chooseSBN == TotalIndex + 2) {
                backListSBN = false;
                backChooseInvestment = true;
            }
        }
    }
}
