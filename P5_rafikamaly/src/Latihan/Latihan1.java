package Latihan;

import java.util.Scanner;

/**
 *
 * @author Rafi Kamaly
 */
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float kehadiran, nilaiAkhir, validasi;
        
        System.out.println("Masukkan Kehadiran   : ");
        kehadiran = input.nextFloat();
        System.out.println("Masukkan Nilai Akhir : ");
        nilaiAkhir = input.nextFloat();
        
        validasi = 21 * 75 / 100;
        
        if (kehadiran > validasi) {
            if (nilaiAkhir >= 80) {
                System.out.println("Grade Nilai: A");
            } else if (nilaiAkhir >= 70) {
                System.out.println("Grade Nilai: B");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Grade Nilai: C");
            } else if (nilaiAkhir >= 55) {
                System.out.println("Grade Nilai: D");
            } else if (nilaiAkhir < 55) {
                System.out.println("Grade Nilai: E");
            }
        } else {
            if (nilaiAkhir >= 55){
                System.out.println("Tidak Lulus");
            }
        }
    }
}
