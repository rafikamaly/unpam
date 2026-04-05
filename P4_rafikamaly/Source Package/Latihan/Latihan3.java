public class Latihan3 {

    public static void main(String[] args) {
 
        float makan = 35000;
        float transport = 20000;
        float belanja = 45000;

        float total = makan + transport + belanja;

        float diskon = total / 100 * 10;
        float bayar = total - diskon;

        System.out.printf("Makan              : Rp. %.2f\n", makan);
        System.out.printf("Transport          : Rp. %.2f\n", transport);
        System.out.printf("Belanja            : Rp. %.2f\n\n", belanja);
        System.out.printf("Total Harga        : Rp. %.2f\n", total);
        System.out.printf("Diskon Harga 10%%   : Rp. %.2f\n\n", diskon);
        System.out.printf("Total Pembayaran   : Rp. %.2f\n", bayar);

    }
}
