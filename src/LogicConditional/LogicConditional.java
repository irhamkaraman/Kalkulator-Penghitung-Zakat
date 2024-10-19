package LogicConditional;

import java.util.Scanner;

public class LogicConditional {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Selamat datang di penilaian Mahasiswa");

    System.out.print("Masukkan nilai Kehadiran: ");
    int kehadiran = input.nextInt();
    int totalKehadiran = kehadiran * 20 / 100;

    System.out.print("Masukkan nilai Tugas: ");
    int tugas = input.nextInt();
    int totalTugas = tugas * 30 / 100;

    System.out.print("Masukkan nilai UTS: ");
    int uts = input.nextInt();
    int totalUts = uts * 20 / 100;

    System.out.print("Masukkan nilai UAS: ");
    int uas = input.nextInt();
    int totalUas = uas * 30 / 100;

    int totalNilai = totalKehadiran + totalTugas + totalUts + totalUas;

    if ( totalNilai >= 90 && totalNilai <= 100) {
      System.out.println("Nilai Anda A dengan total Nilai: " + totalNilai);
    } else if ( totalNilai >= 80 && totalNilai <= 89) {
      System.out.println("Nilai Anda A- dengan total Nilai: " + totalNilai);
    } else if ( totalNilai >= 70 && totalNilai <= 79) {
      System.out.println("Nilai Anda B dengan total Nilai: " + totalNilai);
    } else if ( totalNilai >= 65 && totalNilai <= 69) {
      System.out.println("Nilai Anda B- dengan total Nilai: " + totalNilai);
    } else if ( totalNilai >= 56 && totalNilai <= 64) {
      System.out.println("Nilai Anda C dengan total Nilai: " + totalNilai);
    } else if ( totalNilai >= 40 && totalNilai <= 55) {
      System.out.println("Nilai Anda D dengan total Nilai: " + totalNilai);
    } else if ( totalNilai >= 0 && totalNilai <= 39) {
      System.out.println("Nilai Anda E dengan total Nilai: " + totalNilai);
    } else {
      System.out.println("Nilai Anda tidak valid");
    }

    input.close();
  }

}
