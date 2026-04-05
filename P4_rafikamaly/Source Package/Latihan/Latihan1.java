
import java.util.Scanner;


public class Latihan1 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float realisasi, kehadiran, tugas, uts, uas, total;
      float b_kehadiran, b_tugas, b_uts, b_uas;

      System.out.print("Masukkan Total Pertemuan: ");
      realisasi = input.nextFloat();
      System.out.print("Masukkan Kehadiran: ");
      kehadiran = input.nextFloat();
      System.out.print("Masukkan Tugas: ");
      tugas = input.nextFloat();
      System.out.print("Masukkan UTS: ");
      uts = input.nextFloat();
      System.out.print("Masukkan UAS: ");
      uas = input.nextFloat();

      b_kehadiran = kehadiran / realisasi * 10;
      b_tugas = tugas * 20 / 100;
      b_uts = uts * 30 / 100;
      b_uas = uas * 40 / 100;
      total = b_kehadiran + b_tugas + b_uts + b_uas;

      System.out.println("Kehadiran       : " + kehadiran + "/" + realisasi);
      System.out.println("Bobot Kehadiran : " + b_kehadiran);
      System.out.println("Bobot Tugas     : " + b_tugas);
      System.out.println("Bobot UTS       : " + b_uts);
      System.out.println("Bobot UAS       : " + b_uas);
      System.out.println("Total Bobot     : " + total);
      
  }
}