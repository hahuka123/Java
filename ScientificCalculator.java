import java.util.Scanner;

public class ScientificCalculator {

    // Method penjumlahan
    public static double add(double a, double b) {
        return a + b;
    }

    // Method pengurangan
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method perkalian
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method pembagian
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Tidak bisa dibagi 0!");
            return 0;
        }
        return a / b;
    }

    // Method pangkat
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    // Method sinus
    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    // Method cosinus
    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    // Method tangen
    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    // Method logaritma
    public static double log(double a) {
        return Math.log10(a);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("   SCIENTIFIC CALCULATOR");
            System.out.println("==============================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Pangkat");
            System.out.println("6. Akar Kuadrat");
            System.out.println("7. Sin");
            System.out.println("8. Cos");
            System.out.println("9. Tan");
            System.out.println("10. Log");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            choice = input.nextInt();

            double a, b;

            switch (choice) {

                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.println("Hasil = " + add(a, b));
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.println("Hasil = " + subtract(a, b));
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.println("Hasil = " + multiply(a, b));
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.println("Hasil = " + divide(a, b));
                    break;

                case 5:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    System.out.println("Hasil = " + power(a, b));
                    break;

                case 6:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    System.out.println("Hasil = " + sqrt(a));
                    break;

                case 7:
                    System.out.print("Masukkan sudut: ");
                    a = input.nextDouble();

                    System.out.println("Hasil Sin = " + sin(a));
                    break;

                case 8:
                    System.out.print("Masukkan sudut: ");
                    a = input.nextDouble();

                    System.out.println("Hasil Cos = " + cos(a));
                    break;

                case 9:
                    System.out.print("Masukkan sudut: ");
                    a = input.nextDouble();

                    System.out.println("Hasil Tan = " + tan(a));
                    break;

                case 10:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    System.out.println("Hasil Log = " + log(a));
                    break;

                case 0:
                    System.out.println("Calculator ditutup.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (choice != 0);

        input.close();
    }
}