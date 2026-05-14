import java.util.Random;
import java.util.Scanner;

public class TebakAngka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaRahasia = random.nextInt(100) + 1;
        int tebakan;
        int percobaan = 0;

        System.out.println("===== GAME TEBAK ANGKA =====");
        System.out.println("Tebak angka dari 1 - 100");

        do {
            System.out.print("Masukkan tebakan: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else {
                System.out.println("🎉 Benar!");
                System.out.println("Jumlah percobaan: " + percobaan);
            }

        } while (tebakan != angkaRahasia);

        input.close();
    }
}