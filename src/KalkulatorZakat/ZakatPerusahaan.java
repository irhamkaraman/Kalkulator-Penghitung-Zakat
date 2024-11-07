package KalkulatorZakat;

// import java.util.Scanner;

public class ZakatPerusahaan extends Zakat {
    private double pendapatan;

    public ZakatPerusahaan(double pendapatan) {
        super(175000000); 
        this.pendapatan = pendapatan;
    }

    @Override
    public void hitungZakat() {
        if (pendapatan < nisab) {
            System.out.println("Perusahaan tidak mencukupi syarat nisab zakat.");
            System.out.println("Nisab Zakat Perusahaan minimal Rp. 175.000.000");
        } else {
            this.jumlahZakat = pendapatan * 2.5 / 100;
            System.out.println("Zakat yang harus dibayarkan adalah: " + jumlahZakat + " Rupiah.");
        }
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
}
