import java.util.Scanner;

public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        
        // Struktur perulangan FOR dengan batas kondisi 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            // Perintah untuk memasukkan nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // Kondisi untuk mengecek nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            
            // Kondisi untuk mengecek nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        
        // Tampilkan nilai tertinggi dan terendah
        System.out.println("\nOutput tertinggi: " + tertinggi);
        System.out.println("Output terendah: " + terendah);

    sc.close();
    }
}

        