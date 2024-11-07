package KalkulatorZakat;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hapusRiwayatPerintah();
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Kalkulator Zakat");
        System.out.println("1.  Zakat Penghasilan");
        System.out.println("2.  Zakat Emas");
        System.out.println("3.  Zakat Perusahaan");
        System.out.println("4.  Zakat Perdagangan");
        System.out.println("0.  Keluar");
        System.out.print("Pilih Menu : ");
        
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Penghasilan.");
                System.out.print("Masukkan penghasilan Anda dalam satu bulan: ");
                double penghasilan = input.nextDouble();
                ZakatPenghasilan zakatPenghasilan = new ZakatPenghasilan(penghasilan);
                zakatPenghasilan.hitungZakat();
                break;

            case 2:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Emas.");
                System.out.print("Masukkan berat emas Anda dalam gram: ");
                double beratEmas = input.nextDouble();
                ZakatEmas zakatEmas = new ZakatEmas(beratEmas);
                zakatEmas.hitungZakat();
                break;

            case 3:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Perusahaan");
                System.out.print("Masukkan pendapatan sebelum pajak berupa rupiah: ");
                double pendapatan = input.nextDouble();
                ZakatPerusahaan zakatPerusahaan = new ZakatPerusahaan(pendapatan);
                zakatPerusahaan.hitungZakat();
                break;

            case 4:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Perdagangan");
                System.out.print("Masukkan Aset Lancar Berupa Rupiah: ");
                double asetLancar = input.nextDouble();
                System.out.print("Masukkan Laba dalam Rupiah: ");
                double laba = input.nextDouble();
                ZakatPerdagangan zakatPerdagangan = new ZakatPerdagangan(asetLancar, laba);
                zakatPerdagangan.hitungZakat();
                break;

            case 0:
                hapusRiwayatPerintah();
                System.out.println("Terima Kasih Telah Menggunakan Kalkulator Zakat.");
                System.exit(0);
                break;

            default:
                hapusRiwayatPerintah();
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }

    public static void hapusRiwayatPerintah() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error clearing console");
        }
    }
}
