package Latihan;

import java.util.Scanner;
import java.io.*;

public class Latihan3 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        byte jumlah = 0;
        byte[] dataArray;

        System.out.print("Jumlah data: ");

        try {
            input = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error");
        }

        jumlah = new Byte(input);
        dataArray = new byte[jumlah];

        for (byte i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + i + ": ");
            try {
                input = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Error");
            }
            dataArray[i] = new Byte(input);
        }

        System.out.println("\nIsi array:");
        for (byte i = 0; i < jumlah; i++) {
            System.out.print(dataArray[i]);
        }
    }
}
