package Latihan;

import java.util.Scanner;

/**
 *
 * @author Rafi Kamaly
 */
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "";
        int saldo, debit, kredit;
        saldo = 0;
        
        System.out.print("Nama Lengkap: ");
        nama = input.next();
        
        while (nama != ""){
            System.out.printf("\nSelamat datang, %s.\n", nama);
            System.out.printf("Saldo anda: %d", saldo);
            break;
        }
    }
}
