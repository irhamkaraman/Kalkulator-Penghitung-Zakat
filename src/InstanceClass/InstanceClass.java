package InstanceClass;

public class InstanceClass {

    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Lazuardi Irham Karaman";
        mhs1.nim = 23533740;
        mhs1.kelas = 'B';
        mhs1.jurusan = "Teknik Informatika";
        mhs1.ipk = 3.8;

        System.out.println("Data Mahasiswa: ");
        tampilData(mhs1);
        getIPK(mhs1);
    }

    public static void tampilData(Mahasiswa mhs) {
        System.out.println("Name: " + mhs.nama);
        System.out.println("Nim: " + mhs.nim);
        System.out.println("Kelas: " + mhs.kelas);
        System.out.println("Jurusan: " + mhs.jurusan);
    }

    public static void getIPK(Mahasiswa mhs) {
        if (mhs.ipk >= 3.0) {
            System.out.println("Anda telah Lulus, dengan IPK: " + mhs.ipk);
        } else {
            System.out.println("anda Tidak Lulus dengan IPK: " + mhs.ipk);
            
        }
    }
}
