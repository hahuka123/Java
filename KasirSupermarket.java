import java.util.Scanner;

public class KasirSupermarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String namaKasir;
        String namaBarang;
        int jumlahBarang;
        double hargaBarang;
        double totalBelanja = 0;

        System.out.println("==================================");
        System.out.println("      SISTEM KASIR SUPERMARKET   ");
        System.out.println("==================================");

        // Input nama kasir
        System.out.print("Masukkan Nama Kasir : ");
        namaKasir = input.nextLine();

        // Input jumlah barang
        System.out.print("Masukkan Jumlah Jenis Barang : ");
        jumlahBarang = input.nextInt();
        input.nextLine();

        // Loop input barang
        for (int i = 1; i <= jumlahBarang; i++) {

            System.out.println("\nBarang ke-" + i);

            System.out.print("Nama Barang  : ");
            namaBarang = input.nextLine();

            System.out.print("Harga Barang : Rp ");
            hargaBarang = input.nextDouble();
            input.nextLine();

            totalBelanja += hargaBarang;
        }

        // Hitung diskon
        double diskon = 0;

        if (totalBelanja > 250000) {
            diskon = 0.25; // 25%
        } else if (totalBelanja > 100000) {
            diskon = 0.10; // 10%
        } else if (totalBelanja > 50000) {
            diskon = 0.05; // 5%
        }

        double jumlahDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - jumlahDiskon;

        // Cetak struk
        System.out.println("\n==================================");
        System.out.println("           STRUK BELANJA          ");
        System.out.println("==================================");
        System.out.println("Nama Kasir          : " + namaKasir);
        System.out.println("Total Sebelum Diskon: Rp " + totalBelanja);
        System.out.println("Diskon              : " + (diskon * 100) + "%");
        System.out.println("Potongan Harga      : Rp " + jumlahDiskon);
        System.out.println("Total Setelah Diskon: Rp " + totalBayar);
        System.out.println("==================================");
        System.out.println("      Terima Kasih Sudah Belanja ");
        System.out.println("==================================");

        input.close();
    }
}