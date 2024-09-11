import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;

public class Tagihanlistrik10 {
    public static void main(String[] args) {
        int Tarif_per_KMh = 1500;
        int Batas_KWH = 500;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah penggunaan listrik: ");
        int penggunaankwh = input.nextInt();
        boolean melebihiBatas = penggunaankwh > Batas_KWH;
        int totalTagihan = penggunaankwh = Tarif_per_KMh;

        System.out.println("total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan listrik melebihi batas:" + melebihiBatas);

    }
}
