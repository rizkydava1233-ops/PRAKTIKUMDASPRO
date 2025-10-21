import java.util.Scanner;

public class KafeDoWhileNoAbsen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

              // Deklarasi variabel untuk item yang dibeli
        int kopi, teh, roti;
        String namaPelanggan;
        
        // Deklarasi dan inisialisasi harga item
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        
        // Struktur perulangan DO-WHILE dengan kondisi true
        do {
            // Input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            
            // Kondisi IF untuk mengecek isi variabel namaPelanggan
            if (!namaPelanggan.equalsIgnoreCase("batal")) {
                // Input banyaknya item yang dibeli untuk setiap menu
                System.out.print("Jumlah kopi: ");
                kopi = sc.nextInt();
                System.out.print("Jumlah teh: ");
                teh = sc.nextInt();
                System.out.print("Jumlah roti: ");
                roti = sc.nextInt();
                
                // Hitung total harga pembelian
                int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
                
                // Tampilkan hasil
                System.out.println("Total yang harus dibayar: Rp " + totalHarga);
                sc.nextLine(); // Membersihkan newline dari buffer
            }
            
        } while (!namaPelanggan.equalsIgnoreCase("batal"));

            sc.close();
    }        
}
