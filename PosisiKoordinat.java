import java.util.Scanner;

public class PosisiKoordinat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;

        // Input
        System.out.print("Masukkan nilai x: ");
        x = input.nextDouble();
        System.out.print("Masukkan nilai y: ");
        y = input.nextDouble();

        // Logika Percabangan
        if (x > 0 && y > 0) {
            System.out.println("Posisi: Kuadran I");
        } else if (x < 0 && y > 0) {
            System.out.println("Posisi: Kuadran II");
        } else if (x < 0 && y < 0) {
            System.out.println("Posisi: Kuadran III");
        } else if (x > 0 && y < 0) {
            System.out.println("Posisi: Kuadran IV");
        } else if (x != 0 && y == 0) {
            System.out.println("Posisi: Sumbu X");
        } else if (x == 0 && y != 0) {
            System.out.println("Posisi: Sumbu Y");
        } else if (x == 0 && y == 0) {
            System.out.println("Posisi: Titik Asal");
        }
        
        input.close();
    }
}
