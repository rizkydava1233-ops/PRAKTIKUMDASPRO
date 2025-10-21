package Tugas;
import java.util.Scanner;
public class PembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi variabel
        int jenis, durasi, total = 0;
        
        System.out.println("=== PROGRAM PEMBAYARAN PARKIR ===");
        System.out.println("Tarif Parkir:");
        System.out.println("- Mobil: Rp 3.000/jam");
        System.out.println("- Motor: Rp 2.000/jam");
        System.out.println("- Durasi > 5 jam: Rp 12.500 (flat)");
        System.out.println("==================================\n");
        
        // Perulangan WHILE dengan kondisi jenis != 0
        while (true) {
            // Output pilihan jenis kendaraan
            System.out.println("Masukkan jenis kendaraan");
            System.out.println("(1 Mobil, 2 Motor, 0 Keluar)");
            
            System.out.print("Jenis: ");
            jenis = sc.nextInt();
            
            
            if (jenis == 1 || jenis == 2) {
                // Input durasi
                System.out.print("Input durasi (jam): ");
                durasi = sc.nextInt();
                
                // Kondisi untuk menentukan tarif
                if (durasi > 5) {
                    // Tarif flat untuk durasi > 5 jam
                    total += 12500;
                    System.out.println("Tarif: Rp 12.500 (Durasi > 5 jam)");
                } else if (jenis == 1) {
                    // Mobil: Rp 3.000 per jam
                    total += durasi * 3000;
                    System.out.println("Tarif: Rp " + (durasi * 3000) + " (Mobil, " + durasi + " jam)");
                } else if (jenis == 2) {
                    // Motor: Rp 2.000 per jam
                    total += durasi * 2000;
                    System.out.println("Tarif: Rp " + (durasi * 2000) + " (Motor, " + durasi + " jam)");
                }
                
                System.out.println("Total sementara: Rp " + total);
                System.out.println();
            } else if (jenis == 0) {
                // Keluar dari perulangan
                break;
            } else {
                // Input tidak valid
                System.out.println("Input tidak valid! Masukkan 1 untuk Mobil, 2 untuk Motor, atau 0 untuk Keluar.\n");
            }
        }
        
        // Output total
        System.out.println("\n=================================");
        System.out.println("Total pembayaran parkir: Rp " + total);
        System.out.println("=================================");
        

        sc.close();
    }
}
