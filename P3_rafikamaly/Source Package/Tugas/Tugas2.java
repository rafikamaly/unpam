
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah uang: ");
        double uang = input.nextDouble();

        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String hasil = rupiah.format(uang);

        System.out.println("Format Rupiah: " + hasil);
    }
}
