
import java.util.Scanner;


public class Tugas2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int a1, a2, hasil = 0;
      String operasi;

      System.out.println("Kalkulator Sederhana");
      System.out.println("Masukkan angka pertama: ");
      a1 = input.nextInt();

      System.out.println("Masukkan operasi (+ - / x)");
      operasi = input.next();

      System.out.println("Masukkan angka kedua: ");
      a2 = input.nextInt();

      if (operasi.equals("+")) {
        hasil = a1 + a2;
      }
      else if (operasi.equals("-")) {
        hasil = a1 - a2;
      }
      else if (operasi.equals("/")) {
        hasil = a1 / a2;
      }
      else if (operasi.equals("x")) {
        hasil = a1 * a2;
      }

      System.out.printf("Hasil dari %d %s %d = %d", a1, operasi, a2, hasil);
  }
}