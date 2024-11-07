package KalkulatorZakat;

// import java.util.Scanner;

public class ZakatPenghasilan extends Zakat {
    private double penghasilan;

    public ZakatPenghasilan(double penghasilan) {
        super(6859394); 
        this.penghasilan = penghasilan;
    }

    @Override
    public void hitungZakat() {
        if (penghasilan <= nisab) {
            System.out.println("Penghasilan tidak mencukupi syarat nisab zakat.");
        } else {
            this.jumlahZakat = penghasilan * 2.5 / 100;
            System.out.println("Zakat yang harus dibayarkan adalah: " + jumlahZakat);
        }
    }

    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }
}
