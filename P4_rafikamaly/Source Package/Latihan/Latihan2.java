
import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total, tMakan, tTransport, tBelanja;

        System.out.print("Masukkan Uang Makan: ");
        makan = input.nextFloat();
        System.out.print("Masukkan Uang Transport: ");
        transport = input.nextFloat();
        System.out.print("Masukkan Uang Belanja: ");
        belanja = input.nextFloat();

        total = makan + transport + belanja;

        tMakan = makan / total * 100;
        tTransport = transport / total * 100;
        tBelanja = belanja / total * 100;

        System.out.printf("Total Makan       : Rp. %.2f (%.2f%%)\n", makan, tMakan);
        System.out.printf("Total Transport   : Rp. %.2f (%.2f%%)\n", transport, tTransport);
        System.out.printf("Total Belanja     : Rp. %.2f (%.2f%%)\n", belanja, tBelanja);
        System.out.printf("Total Pengeluaran : Rp. %.2f\n", total);

    }
}
