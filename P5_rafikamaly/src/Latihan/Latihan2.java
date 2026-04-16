package Latihan;

import java.util.Scanner;

/**
 *
 * @author Rafi Kamaly
 */
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaPertama, angkaKedua, hasil = 0, pilihan;
        
        System.out.println("=== PILIH MENU ===");
        System.out.print("1. +\n2. -\n3. x\n4. :\n\nMasukkan Pilihan: ");
        pilihan = input.nextInt();
        System.out.print("Masukkan Angka Pertama  : ");
        angkaPertama = input.nextInt();
        System.out.print("Masukkan Angka Kedua    : ");
        angkaKedua = input.nextInt();
        
        if (pilihan == 1) {
            hasil = angkaPertama + angkaKedua;
        } else if (pilihan == 2) {
            hasil = angkaPertama - angkaKedua;
        } else if (pilihan == 3) {
            hasil = angkaPertama * angkaKedua;
        } else if (pilihan == 4) {
            hasil = angkaPertama / angkaKedua;
        }
        
        System.out.println("\nHasilnya adalah " + hasil);
    }
}
