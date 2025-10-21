package Tugas;
import java.util.Scanner;

public class PenjualanTiketBioskop {
    public  static void main(String[] Argas) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi dan inisialisasi variabel
        final int HARGA_TIKET = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int jumlahPelanggan = 0;


         
        System.out.println("========PENJUALAN TIKET BIOSKOP========");
        System.out.println("Harga tiket: Rp " + HARGA_TIKET + " per tiket");
        System.out.println("Diskon 10% untuk pembelian > 4 tiket");
        System.out.println("Diskon 15% untuk pembelian > 10 tiket");
        System.out.println("========================================\n");
        
         // Perulangan untuk melayani pelanggan
        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();
            
            // Kondisi untuk keluar dari perulangan
            if (jumlahTiket == 0) {
                break;
            }
            
            // Validasi input tiket tidak valid (negatif)
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                System.out.println("Silakan masukkan ulang.\n");
                continue; // Kembali ke awal perulangan
            }
            
            // Hitung harga sebelum diskon
            int hargaSebelumDiskon = jumlahTiket * HARGA_TIKET;
            int hargaSetelahDiskon;
            double persenDiskon = 0;
            
            // Tentukan diskon berdasarkan jumlah tiket
            if (jumlahTiket > 10) {
                persenDiskon = 15;
                hargaSetelahDiskon = (int) (hargaSebelumDiskon * 0.85); // Diskon 15%
            } else if (jumlahTiket > 4) {
                persenDiskon = 10;
                hargaSetelahDiskon = (int) (hargaSebelumDiskon * 0.90); // Diskon 10%
            } else {
                hargaSetelahDiskon = hargaSebelumDiskon; // Tidak ada diskon
            }
            
            // Tampilkan detail transaksi
            jumlahPelanggan++;
            System.out.println("\n--- Transaksi Pelanggan ke-" + jumlahPelanggan + " ---");
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Harga: Rp " + hargaSebelumDiskon);
            
            if (persenDiskon > 0) {
                int potongan = hargaSebelumDiskon - hargaSetelahDiskon;
                System.out.println("Diskon: " + (int)persenDiskon + "% (Rp " + potongan + ")");
            } else {
                System.out.println("Diskon: Tidak ada");
            }
            
            System.out.println("Total bayar: Rp " + hargaSetelahDiskon);
            System.out.println("-----------------------------------\n");
            
            // Akumulasi total tiket dan penjualan
            totalTiket += jumlahTiket;
            totalPenjualan += hargaSetelahDiskon;
        }
        
        // Tampilkan ringkasan penjualan hari ini
        System.out.println("\n======== RINGKASAN PENJUALAN HARI INI ========");
        System.out.println("Total pelanggan: " + jumlahPelanggan);
        System.out.println("Total tiket terjual: " + totalTiket + " tiket");
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        System.out.println("==============================================");



        sc.close();
    }
    
}
