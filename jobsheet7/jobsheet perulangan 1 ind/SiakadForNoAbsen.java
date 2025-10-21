import java.util.Scanner;

public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;

        //Deklarasi variabel untuk menghitung mahasiswa lulus dan tidak lulus
        int lulus = 0, tidaklulus = 0;

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

             // Kondisi untuk menentukan kelulusan (batas minimal 60)
             if (nilai >=60) {
                lulus++;
             } else {
                tidaklulus++;
             }
        }
        
        // Tampilkan nilai tertinggi dan terendah
        System.out.println("\nOutput tertinggi: " + tertinggi);
        System.out.println("Output terendah: " + terendah);
        
        // Tampilkan jumlah mahasiswa lulus dan tidak lulus
        System.out.println("\nJumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidaklulus);
        
    sc.close();
    }
}

        