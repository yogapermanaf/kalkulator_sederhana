package Yoga_Kalkulator;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Yoga_Kalkulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int menu, bilangan1, bilangan2, hasil;
        String operasi;

        System.out.println("Pilih menu:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa bagi");

        menu = input.nextInt();

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextInt();

        switch (menu) {
            case 1:
                hasil = bilangan1 + bilangan2;
                operasi = "Penjumlahan";
                break;
            case 2:
                hasil = bilangan1 - bilangan2;
                operasi = "Pengurangan";
                break;
            case 3:
                hasil = bilangan1 * bilangan2;
                operasi = "Perkalian";
                break;
            case 4:
                hasil = bilangan1 / bilangan2;
                operasi = "Pembagian";
                break;
            case 5:
                hasil = bilangan1 % bilangan2;
                operasi = "Sisa bagi";
                break;
            default:
                hasil = 0;
                operasi = "Tidak dikenali";
                break;
        }

        System.out.println("Hasil " + operasi + " " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
        
        try {
            PrintWriter writer = new PrintWriter(new File("result.txt"));
            writer.println("Hasil " + operasi + " " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
