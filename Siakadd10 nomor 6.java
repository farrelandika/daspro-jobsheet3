import java.util.Scanner;

public class Siakadd10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("masukan nama:");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM:");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas:");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen:");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaikuis*0.20) + (nilaiTugas*0.15) + (nilaiUTS*0.30) + (nilaiUAS*0.35) ;
        
        System.out.println("Mahasiswa dengan nama" + nama);AF
        ;.println("\tNIM" + nim);
        System.out.println("\tKELAS" + kelas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
        