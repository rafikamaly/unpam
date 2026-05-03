
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur: ");
        int umur = input.nextInt();

        String kategori = (umur < 13) ? "Anak-anak"
                : (umur < 18) ? "Remaja"
                        : (umur < 60) ? "Dewasa" : "Lansia";

        System.out.println("Kategori umur: " + kategori);
    }
}
