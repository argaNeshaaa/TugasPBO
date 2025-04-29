package customer;

import java.util.ArrayList;

import input.InputUtility;
import login.LoginApp;
import sbn.ListSBN;
import sbn.ListSBNCustomer;
import sbn.SBN;
import sbn.SBNUser1;
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
                ArrayList<SBNUser1> semuaSBN = ListSBNCustomer.getList();
                Screen.clearScreen();
                System.out.printf("%-8s %-8s %-15s %-15s %-15s%n", "Nama", "Bunga", "Jangka Waktu", "Jatuh Tempo", "Kuota Nasional");
                System.out.printf("%-8s %-13.2f %-10d %-15s %-15d%n", 
                    SBN.getNama(), 
                    SBN.getBunga(), 
                    SBN.getJangkaWaktu(),
                    SBN.getTanggalJatuhTempo(),
                    SBN.getKuotaNasional());
                System.out.printf(" %-25s%n %-25s%n","1.Beli SBN","2.Kembali");
                System.out.print("Pilih Action : ");
                int TakeSBN = InputUtility.scanner.nextInt();

                // Ketika admin ingin Kembali
                if (TakeSBN == 1) {
                    System.out.print("Nominal Pembelian : ");
                    int nominalPembelian = InputUtility.scanner.nextInt();
                    Screen.clearScreen();
                    boolean found = false;

                    for (SBNUser1 SBNUser : semuaSBN) {
                        if (nominalPembelian <= SBN.getKuotaNasional() && SBNUser.getNama().equals(SBN.getNama())) {
                            System.out.println("Berhasil Membeli SBN Sebanyak Rp" + nominalPembelian);
                            long NewKuota = SBN.getKuotaNasional() - nominalPembelian;
                            SBN.setKuotaNasiona(NewKuota);
                            SBNUser.setNominalInvestasi(SBNUser.getNominalInvestasi() + nominalPembelian);
                            System.out.println("Total SBN dimiliki: Rp " + SBNUser.getNominalInvestasi());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        String idUser =LoginApp.getInputUsername();  
                        SBNUser1 SBNBaru = new SBNUser1(SBN.getNama(), SBN.getBunga(), SBN.getJangkaWaktu(), SBN.getTanggalJatuhTempo(), SBN.getKuotaNasional(), nominalPembelian, idUser);
                        ListSBNCustomer.BeliSBNBaru(SBNBaru);
                        ListSBNCustomer.AllSBN();
                    }

                    System.out.println("1.Kembali");
                    System.out.print("Action :");
                    int afterBuy = InputUtility.scanner.nextInt();

                    if (afterBuy == 1) {
                        backListSBN = true;
                    } 
                    // Ketika tidak ingin kembali ke daftar saham
                    else {
                        backListSBN = false;
                    }
                }
            } 

            // Ketika admin ingin kembali memili Investment
            else if (chooseSBN == TotalIndex + 1) {
                backListSBN = false;
                backChooseInvestment = true;
            }
        }
    }
}
