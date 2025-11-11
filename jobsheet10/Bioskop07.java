package jobsheet10;

public class Bioskop07 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);

       // Menggunakan foreach loop untuk menampilkan panjang setiap baris
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);

        // Menampilkan nama penonton pada baris ke-3 menggunakan foreach loop
        System.out.println("\nPenonton pada baris ke-3:");
        for (String namaPenonton : penonton[2]) {
            System.out.println(namaPenonton);
        }
         // Menampilkan semua penonton per baris menggunakan String.join()
        System.out.println("\nDaftar semua penonton per baris:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }
    }   
  }
}
