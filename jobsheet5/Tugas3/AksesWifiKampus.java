package jobsheet5.Tugas3;
import java.util.Scanner;
public class AksesWifiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String jenis_pengguna;
        int jumlah_SKS = 0; // Inisialisasi awal

        System.out.println("--- Program Cek Akses WiFi ---");

        // MULAI & Input jenis_pengguna
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        jenis_pengguna = input.nextLine().toLowerCase();

        // Jika (jenis_pengguna = "dosen")
        if (jenis_pengguna.equals("dosen")) {

            // Tampilkan "Akses WiFi diberikan (dosen)"
            System.out.println("Akses WiFi diberikan (dosen)");

        // Jika tidak, jika (jenis_pengguna = "mahasiswa")
        } else if (jenis_pengguna.equals("mahasiswa")) {

            // Input jumlah_SKS
            System.out.print("Masukkan jumlah SKS yang diambil: ");


            if (input.hasNextInt()) {
                jumlah_SKS = input.nextInt();
            } else {
                // Penanganan jika input SKS bukan angka
                System.out.println("Input SKS tidak valid. Proses dihentikan.");
                input.close();
                return;
            }

            // Jika (jumlah_SKS >= 12)
            if (jumlah_SKS >= 12) {
                // Tampilkan "Akses WiFi diberikan (mahasiswa aktif)"
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } 
            // Jika tidak (SKS < 12)
            else {
                // Tampilkan "Akses ditolak, SKS kurang dari 12"
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }

        // Jika tidak (Untuk jenis_pengguna selain "dosen" dan "mahasiswa")
        } else {

            // Tampilkan "Akses ditolak"
            System.out.println("Akses ditolak. Jenis pengguna tidak dikenal.");

        }

        // SELESAI
        input.close();
        System.out.println("--- Program Selesai ---");
    }
}
