package KalkulatorZakat;

// import java.util.Scanner;

public class ZakatPerdagangan extends Zakat {
    private double asetLancar;
    private double laba;

    public ZakatPerdagangan(double asetLancar, double laba) {
        super(81945667); 
        this.asetLancar = asetLancar;
        this.laba = laba;
    }

    @Override
    public void hitungZakat() {
        double totalAset = asetLancar + laba;
        if (totalAset >= nisab) {
            this.jumlahZakat = totalAset * 2.5 / 100;
            System.out.println("Zakat Perdagangan yang wajib dibayarkan adalah: " + jumlahZakat + " Rupiah.");
        } else {
            System.out.println("Aset Perdagangan tidak mencukupi syarat nisab zakat.");
            System.out.println("Nisab Zakat Perdagangan Minimal Rp 81.945.667,-");
        }
    }

    public void setAsetLancar(double asetLancar) {
        this.asetLancar = asetLancar;
    }

    public void setLaba(double laba) {
        this.laba = laba;
    }
}
