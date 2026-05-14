public class GradeFilter {
    public static void main(String[] args) {
         String nama[] = {"Andi", "Budi", "Cici", "Dedi", "Eka", "Caca"};
         int nilai[] = {55, 60, 56, 37, 45, 50};

        int passcount = 0;
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] >= 60){
                System.out.println(nama[i] + " lulus " + nilai[i]);
                passcount++;
            }
        }
        System.out.println("Jumlah siswa yang lulus: " + passcount);
    }
   
}
