package KalkulatorZakat;

public abstract class Zakat {
    protected double jumlahZakat;
    protected double nisab;

    public Zakat(double nisab) {
        this.nisab = nisab;
    }

    public abstract void hitungZakat();

    public double getJumlahZakat() {
        return jumlahZakat;
    }
}
