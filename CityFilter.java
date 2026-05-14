import java.util.Scanner;

public class CityFilter {
    public static void main(String[] args) {
        String namakota[] = {"Bandung", "Surabaya", "Medan", "Bogor", "Manado"};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan huruf : ");
        String huruf = input.nextLine();
        input.close();
        for (int i = 0; i < namakota.length; i++){
            if (namakota[i].contains(huruf)){
                System.out.println(namakota[i]);
            }
        } 
    }
}
