// NIM : 25523173
// Nama : Hanif Huwaidi Kadzim

import java.util.Scanner;

public class Hanif_Method {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.println("=== Sistem Kasir Toko Berkah ===");
            System.out.print("Kasir yang bertugas : ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan Total Belanja: Rp");
            double belanja = input.nextDouble();

        
            double totalBayar = hitungTotalAkhir(belanja);

            
            cetakStruk(nama, totalBayar);
        
            input.nextLine(); 
            System.out.println("--------------------------------\n");
            
    }
    
    public static double hitungTotalAkhir(double totalBelanja) {
        double diskon;
        
        
        if (totalBelanja > 50000){
            diskon = 0.05 * totalBelanja;//Diskon 5%
        }
    else if (totalBelanja > 100000) {
            diskon = 0.1 * totalBelanja; // Diskon 10%
        } 
    else if (totalBelanja > 150000){
        diskon = 0.25 * totalBelanja;// Diskon 25%
    }
        else {
            diskon = 0;
        }
        
        return totalBelanja - diskon;
    }
    
    public static void cetakStruk(String namaPelanggan, double finalHarga) {
        System.out.println("\n--- STRUK PEMBAYARAN ---");
        System.out.println("Kasir : " + namaPelanggan);
        System.out.println("Total Bayar: Rp" + finalHarga);
        System.out.println("------------------------");
    }
}