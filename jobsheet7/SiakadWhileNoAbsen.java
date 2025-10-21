import java.util.Scanner;

public class SiakadWhileNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        
        // Deklarasi variabel counter
        int i = 0;
        
        // Perulangan WHILE dengan kondisi i < jml
        while (i < jml) {
            // Input nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            double nilai = sc.nextDouble();
            
            // Validasi nilai (harus antara 0-100)
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue; // Ulangi iterasi tanpa increment i
            }
            
            // Kondisi IF-ELSE IF untuk menampilkan kategori nilai huruf
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            
            // Increment counter
            i++;
        }

        sc.close();

    }

}
