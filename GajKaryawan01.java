import java.util.Scanner;

public class GajKaryawan01 {
    public static void main(String[] args) {

        final double bonus = 0.10;
        final double pajak = 0.05;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah jam kerja karyawan dalam sebulan: ");
        double jamkerja = input.nextDouble();
        System.out.print("Masukkan upah per jam kerja");
        double upahPerJam = input.nextDouble();
        double gajiSebelumPajak = jamkerja = upahPerJam;
        double Bonus = gajiSebelumPajak * pajak;
        double totalGajiSebelumPajak = gajiSebelumPajak * bonus;
        double Pajak = totalGajiSebelumPajak - pajak;
        double gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.println("Gaji sebelum pajak: "+ gajiSebelumPajak);
        System.out.println("Bonus: "+ bonus);
        System.out.println("total gaji sebelum pajak: "+ totalGajiSebelumPajak);
        System.out.println("Pajak yang dikenakan: "+ pajak);
        System.out.println("Gaji bersih sebelum pajak: "+ gajiBersih);
    }
}
