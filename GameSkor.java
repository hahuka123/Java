import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class GameSkor {

    static final String FILE_NAME = "score.txt";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int score;

        System.out.println("=================================");
        System.out.println("      GAME TEBAK ANGKA");
        System.out.println("=================================");
        System.out.println("Tebak angka dari 1 - 100");

        do {
            System.out.print("Masukkan tebakan: ");
            guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Terlalu besar!");
            } else if (guess < secretNumber) {
                System.out.println("Terlalu kecil!");
            } else {
                System.out.println("🎉 Tebakan benar!");
            }

        } while (guess != secretNumber);

        // Hitung skor
        score = 100 - (attempts * 10);

        if (score < 0) {
            score = 0;
        }

        System.out.println("Jumlah percobaan : " + attempts);
        System.out.println("Skor kamu        : " + score);

        // Simpan skor ke file
        saveScore(score);

        // Tampilkan skor tertinggi
        int highScore = readHighScore();

        System.out.println("High Score       : " + highScore);

        input.close();
    }

    // Method simpan skor
    public static void saveScore(int score) {

        int currentHighScore = readHighScore();

        if (score > currentHighScore) {

            try {
                FileWriter writer = new FileWriter(FILE_NAME);
                writer.write(String.valueOf(score));
                writer.close();

                System.out.println("🔥 High Score Baru Disimpan!");

            } catch (IOException e) {
                System.out.println("Error menyimpan skor!");
            }

        } else {
            System.out.println("Skor tidak melebihi High Score.");
        }
    }

    // Method membaca high score
    public static int readHighScore() {

        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return 0;
            }

            Scanner reader = new Scanner(file);

            int highScore = reader.nextInt();

            reader.close();

            return highScore;

        } catch (Exception e) {
            return 0;
        }
    }
}