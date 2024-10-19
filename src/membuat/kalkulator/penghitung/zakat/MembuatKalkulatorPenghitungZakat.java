/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package membuat.kalkulator.penghitung.zakat;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class MembuatKalkulatorPenghitungZakat {
    public static void main(String[] args) {

        hapusRiwayatPerintah();

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Kalkulator Zakat");
        System.out.println("1.  Zakat Penghasilan");
        System.out.println("2.  Zakat Emas");
        System.out.println("3.  Zakat Perusahaan");
        System.out.println("3.  Zakat Perdagangan");
        System.out.println("0.  Keluar");
        System.out.print("Pilih Menu : ");
        
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Penghasilan.");
                zakatPenghasilan();
                break;

            case 2:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Emas.");
                zakatEmas();
                break;

            case 3:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Perusahaan");
                zakatPerusahaan();
                break;

            case 4:
                hapusRiwayatPerintah();
                System.out.println("Anda memilih Zakat Perdagangan");
                zakatPerdagangan();
                break;

            case  0:
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

    public static void zakatPenghasilan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan penghasilan Anda dalam satu bulan: ");
        int penghasilan = input.nextInt();

        if  (penghasilan <= 6859394) {
            System.out.println("Penghasilan tidak mencukupi syarat nisab zakat");
        } else {
            double zakat = penghasilan*2.5/100;
            System.out.println("Zakat yang harus dibayarkan adalah: " + zakat);
        }
        input.close();
    }

    public static void zakatEmas() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat emas Anda dalam gram: ");
        int beratEmas = input.nextInt();

        if  (beratEmas <= 85) {
            System.out.println("Nilai Emas tidak mencukupi syarat nisab emas");
        } else {
            int konversiRp = beratEmas*80000;
            double zakatEmas = konversiRp*2.5/100;
            double konversiGram = zakatEmas/80000;
            System.out.println("Zakat emas yang harus dibayarkan adalah: " + konversiGram);
        }
        input.close();
    }

    public static void zakatPerusahaan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zakat perusahaan dibagi dua, silahkan masukkan angka yang ingin anda gunakan untuk menghitung zakat perusahaan");
        System.out.println("1. Jasa");
        System.out.println("2. Dagang");
        System.out.print("Pilih jenis perusahaan Anda: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            hapusRiwayatPerintah();
            System.out.print("Masukkan pendapatan sebelum pajak berupa rupiah: ");
            int pendapatan = input.nextInt();

            if (pendapatan >= 175000000) {
                double hitungZakat = pendapatan*2.5/100;
                System.out.println("Zakat yang harus dibayarkan adalah: " + hitungZakat + "Rupiah");
            } else {
                System.out.println("Perusahan tidka mencukupi syarat nisab zakat");
                System.out.println("Nisab Zakat Jasa minimal Rp. 175.000.000");
            }
        } else if (pilihan <=2)  {
            hapusRiwayatPerintah();
            System.out.print("Masukkan Aset lancar Perusahaan pertahun ex:1000000: ");
            int asetLancar = input.nextInt();

            System.out.print("Masukkan Hutang Jangka Pendek ex:1000000: ");
            int hutang = input.nextInt();

            int hitungInput = asetLancar -  hutang;

            if (hitungInput >= 680000000) {
                double hitungZakat = hitungInput*2.5/100;
                System.out.println("Zakat Dagang/Indurstri yang wajib anda keluarkan bernilai " +  hitungZakat + "Rupiah");
            } else {
                System.out.println("Sisa aset perusahaan bernilai " + hitungInput + "Rupiah");
                System.out.println("Perusahaan tidak mencukupi syarat nisab zakat");
                System.out.println("Nisab Zakat Dagang/Indurstri Minimal RP. 68.000.000"); 
            }
        } else {
            System.out.println("Angka yang anda masukkan pilihan tidak tersedia");
        }
        input.close();
    }

    public static void zakatPerdagangan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Aset Lancar Berupa Rupiah: ");
        int asetLancar = input.nextInt();

        System.out.print("Masukkan Laba dalam Rupiah: ");
        int laba = input.nextInt();

        int  hitungAset = asetLancar + laba;
        if (hitungAset >= 81945667) {
            double hitungZakat = hitungAset*2.5/100;
            System.out.println("Zakat Perdagangan yang wajib dibayarkan adalah: " +  hitungZakat + "Rupiah");
        } else {
            System.out.println("Total aset Perdagangan bernilai " + hitungAset + " Rupiah");
            System.out.println("Aset Perdagangan tidak mencukupi syarat nisab zakat");
            System.out.println("Nisab Zakat Perdagangan Minimal Rp 81.945.667,-");
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
