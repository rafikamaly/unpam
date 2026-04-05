import java.util.Scanner;

public class Tugas1 {
  public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int angka1, angka2, jumlah;

      System.out.println("Program Penjumlahan");
      System.out.println("Masukkan Angka Pertama: ");
      angka1 = input.nextInt();
      
      System.out.println("Masukkan Angka Kedua: ");
      angka2 = input.nextInt();

      jumlah = angka1 + angka2;
      System.out.println("Hasil dari " + angka1 + " + " + angka2 + " = " + jumlah);
  }
}