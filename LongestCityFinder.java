public class LongestCityFinder {
    public static String longestCity(String[] namakota) {
        String namaterpanjang = namakota[0];
        for (int i = 0; i < namakota.length; i++) {
            if (namakota[i].length() > namaterpanjang.length()) {
                namaterpanjang = namakota[i];
            }
        }
        return namaterpanjang;
    }
    public static void main(String[] args) {
        String[] namakota = {"Jakarta"}  ;
        String hasil = longestCity(namakota);
        System.out.println("Kota terpanjang: " + hasil + "(" + hasil.length() + " karakter)");
    }
}
