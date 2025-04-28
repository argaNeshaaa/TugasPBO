package customer;

import java.util.ArrayList;
import login.*;
import input.InputUtility;
import saham.ListSaham;
import saham.ListSahamCustomer;
import saham.Saham;
import saham.SahamUser1;
import screen.Screen;

public class CustomerSaham {
    public static boolean backChooseInvestment = false;
    public static void main() {
    boolean backListSaham = true;
    int TotalIndex = ListSaham.getList().size();
    while (backListSaham) {
        Screen.clearScreen();
        ListSaham.AllSaham();
        System.out.println(TotalIndex + 1 +" Kembali");
        System.out.print("Pilih Saham : ");
        int chooseSaham = InputUtility.scanner.nextInt();
        int indexNumber = chooseSaham - 1 ;
        if (chooseSaham > 0 && chooseSaham <= TotalIndex) {
            Saham saham = ListSaham.getList().get(indexNumber);
            ArrayList<SahamUser1> semuaSaham = ListSahamCustomer.getList();
            Screen.clearScreen();
            System.out.printf(" %-10s %-15s %-10s%n", "Nama", "Harga", "Lot Tersedia");
            System.out.printf(" %-10s %-15.2f %-10d%n", 
                saham.getNama(), 
                saham.getHarga(), 
                saham.getLotTersedia());
            System.out.printf(" %-25s%n %-25s%n %-25s%n","1.Beli","2.Jual", "3.Kembali");
            System.out.print("Pilih Action : ");
            int BuyOrSell = InputUtility.scanner.nextInt();

            // Ketika ingin membeli saham
            if (BuyOrSell == 1) {
                System.out.print("Beli Berapa Lot : ");
                int LotBuy = InputUtility.scanner.nextInt();
                
                Screen.clearScreen();
                
                    // Berhasil Membeli Saham
                    boolean found = false;

                    for (SahamUser1 sahamUser : semuaSaham) {
                        if (LotBuy <= saham.getLotTersedia() && sahamUser.getNama().equals(saham.getNama())) {
                            int NewLot = saham.getLotTersedia() - LotBuy;
                            saham.setLotTersedia(NewLot);
                            System.out.println("Berhasil Membeli Saham Sebanyak " + LotBuy + " Lot");
                            sahamUser.setLotDibeli(sahamUser.getLotDibeli() + LotBuy);
                            System.out.println("Total Lot dimiliki: " + sahamUser.getLotDibeli() + " Lot");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        
                        String idUser =LoginApp.getInputUsername();  
                        SahamUser1 sahamBaru = new SahamUser1(saham.getNama(), saham.getHarga(), saham.getHarga(), LotBuy, idUser);
                        ListSahamCustomer.tambahSaham(sahamBaru);
                        ListSahamCustomer.AllSaham();
                    }
                 

                System.out.println("1.Kembali");
                System.out.print("Action :");
                int afterBuy = InputUtility.scanner.nextInt();

                // Ketika user ingin kembali ke daftar saham
                if (afterBuy == 1) {
                    backListSaham = true;
                } 
                // Ketika tidak ingin kembali ke daftar saham
                else {
                    backListSaham = false;
                }
            }

            // Menjual Saham
            else if (BuyOrSell == 2) {
                System.out.print("Jual Berapa Lot : ");
                int LotSell = InputUtility.scanner.nextInt();
                
                Screen.clearScreen();
                    
                    boolean found = false;

                    for (SahamUser1 sahamUser : semuaSaham) {
                        // Ketika memiliki saham tersebut dan lot yang ingin dijual tidak lebih besar dari jumlah lot yang dimiliki
                        if (LotSell <= saham.getLotTersedia() && sahamUser.getNama().equals(saham.getNama())) {
                            System.out.println("Berhasil Menjual Saham Sebanyak " + LotSell + " Lot");
                            int NewLot = saham.getLotTersedia() + LotSell;
                            saham.setLotTersedia(NewLot);
                            sahamUser.setLotDibeli(sahamUser.getLotDibeli() - LotSell);
                            System.out.println("Total Lot dimiliki: " + sahamUser.getLotDibeli() + " Lot");
                            System.out.println("1. Kembali");
                            System.out.print("Action : ");
                            int afterSell = InputUtility.scanner.nextInt();
                            if (afterSell == 1) {
                                backListSaham = true;
                            } else {
                                backListSaham = false;
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Kamu Tidak Memiliki Saham ini!!");
                        System.out.println("1.Kembali");
                        System.out.print("Action : ");
                        int SellFail = InputUtility.scanner.nextInt();
                        if (SellFail == 1) {
                            backListSaham = true;
                        } else {
                            backListSaham = false;
                        }
                        
                    }
                } 
            
        } else if(chooseSaham == TotalIndex + 1) {
            backListSaham = false;
            backChooseInvestment = true;
        }

        // Ketika admin ingin kembali memili Investment
        else {
            backListSaham = false;
            backChooseInvestment = false;
        }
    }

}
}
