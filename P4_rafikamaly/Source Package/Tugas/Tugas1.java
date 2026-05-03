
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total belanja: ");
        double total = input.nextDouble();
        double diskon = 0;

        if (total >= 200000) {
            diskon = 0.2;
        } else if (total >= 75000) {
            diskon = 0.1;
        }

        double bayar = total - (total * diskon);

        System.out.println("Total Bayar: " + bayar);
    }
}
