package jobsheet5.Tugas3;
import java.util.Scanner;
public class SistemPerpustakaanKampus {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel untuk menyimpan status input
        // Menggunakan String untuk menyimpan jawaban 'ya' atau 'tidak'
        String kartu_mahasiswa;
        String registrasi_online;
        
        System.out.println("--- Program Cek Akses Masuk ---");
        
        // 1. Input kartu_mahasiswa
        System.out.print("Apakah kartu mahasiswa valid? (Ketik 'ya' atau 'tidak'): ");
        kartu_mahasiswa = input.nextLine().toLowerCase();
        
        // 2. Input registrasi_online
        System.out.print("Apakah registrasi online valid? (Ketik 'ya' atau 'tidak'): ");
        registrasi_online = input.nextLine().toLowerCase();
        
        // 3. Pengecekan Kondisi (DIAMOND) - Jika (kartu = "ya") ATAU (registrasi = "ya")
        // Menggunakan operator OR logis (||)
        if (kartu_mahasiswa.equals("ya") || registrasi_online.equals("ya")) {
            
            // Tampilkan "Boleh masuk" (Jika kondisi YA)
            System.out.println("\nSTATUS: Boleh masuk.");
            
        } else {
            
            // Tampilkan "Tidak boleh masuk" (Jika kondisi TIDAK)
            System.out.println("\nSTATUS: Tidak boleh masuk.");
            
        }
        
        // Selesai - Menutup objek Scanner
        input.close();
        System.out.println("\n--- Program Selesai ---");
    }

    
}
