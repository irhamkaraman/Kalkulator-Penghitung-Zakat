package KalkulatorZakat;

// import java.util.Scanner;

public class ZakatEmas extends Zakat {
    private double beratEmas;

    public ZakatEmas(double beratEmas) {
        super(85);
        this.beratEmas = beratEmas;
    }

    @Override
    public void hitungZakat() {
        if (beratEmas <= nisab) {
            System.out.println("Nilai Emas tidak mencukupi syarat nisab emas.");
        } else {
            double konversiRp = beratEmas * 80000;
            this.jumlahZakat = konversiRp * 2.5 / 100;
            double konversiGram = jumlahZakat / 80000;
            System.out.println("Zakat emas yang harus dibayarkan adalah: " + konversiGram + " gram.");
        }
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }
}
