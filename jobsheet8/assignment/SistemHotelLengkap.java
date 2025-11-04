package jobsheet8.assignment;
import java.util.Scanner;
public class SistemHotelLengkap {
        // FITUR 1: Menampilkan Ketersediaan Kamar Per Lantai
    public static void fitur1_KetersediaanKamar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah lantai: ");
        int jumlahLantai = sc.nextInt();
        
        System.out.print("Masukkan jumlah kamar per lantai: ");
        int jumlahKamarPerLantai = sc.nextInt();
        
        // Simulasi status kamar (true = tersedia, false = terisi)
        boolean[][] statusKamar = new boolean[jumlahLantai + 1][jumlahKamarPerLantai + 1];
        
        // Inisialisasi data dummy (pola checker)
        for (int i = 1; i <= jumlahLantai; i++) {
            for (int j = 1; j <= jumlahKamarPerLantai; j++) {
                statusKamar[i][j] = (i + j) % 2 == 0;
            }
        }
        
        System.out.println("\n=== KETERSEDIAAN KAMAR HOTEL ===");
        
        // NESTED LOOP: Loop luar untuk lantai, loop dalam untuk kamar
        for (int lantai = 1; lantai <= jumlahLantai; lantai++) {
            System.out.println("Lantai " + lantai + ":");
            
            for (int nomorKamar = 1; nomorKamar <= jumlahKamarPerLantai; nomorKamar++) {
                int nomorKamarLengkap = (lantai * 100) + nomorKamar;
                String status = statusKamar[lantai][nomorKamar] ? "TERSEDIA" : "TERISI";
                
                System.out.println("  Kamar " + nomorKamarLengkap + " : " + status);
            }
            
            System.out.println(); // Baris kosong
        }
    }
    
    // FITUR 2: Laporan Booking Per Bulan Per Tipe Kamar
    public static void fitur2_LaporanBooking() {
        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni"};
        String[] namaTipe = {"", "Standard Room", "Deluxe Room", "Suite Room"};
        
        int jumlahBulan = 3;
        int jumlahTipeKamar = 3;
        
        // Simulasi data booking
        int[][] jumlahBooking = {
            {0, 0, 0, 0},
            {0, 25, 18, 12},  // Januari
            {0, 30, 22, 15},  // Februari
            {0, 28, 20, 10}   // Maret
        };
        
        System.out.println("\n=== LAPORAN BOOKING HOTEL ===");
        
        // NESTED LOOP: Loop luar untuk bulan, loop dalam untuk tipe kamar
        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            System.out.println("Bulan: " + namaBulan[bulan]);
            int totalPerBulan = 0;
            
            for (int tipe = 1; tipe <= jumlahTipeKamar; tipe++) {
                System.out.println("  " + namaTipe[tipe] + " : " + 
                                   jumlahBooking[bulan][tipe] + " booking");
                totalPerBulan += jumlahBooking[bulan][tipe];
            }
            
            System.out.println("  Total bulan ini: " + totalPerBulan);
            System.out.println();
        }
    }
    
    // FITUR 3: Mencari Kamar Tersedia dalam Rentang Tanggal
    public static void fitur3_CariKamarTersedia() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal mulai (1-31): ");
        int tanggalMulai = sc.nextInt();
        
        System.out.print("Masukkan tanggal selesai (1-31): ");
        int tanggalSelesai = sc.nextInt();
        
        System.out.print("Masukkan jumlah kamar yang dicek: ");
        int jumlahKamar = sc.nextInt();
        
        // Simulasi ketersediaan kamar per tanggal
        boolean[][] kamarTersedia = new boolean[jumlahKamar + 1][32];
        
        // Inisialisasi data dummy (random availability)
        for (int i = 1; i <= jumlahKamar; i++) {
            for (int j = 1; j <= 31; j++) {
                kamarTersedia[i][j] = Math.random() > 0.4; // 60% chance tersedia
            }
        }
        
        System.out.println("\n=== KAMAR TERSEDIA ===");
        System.out.println("Tanggal: " + tanggalMulai + " - " + tanggalSelesai);
        System.out.println();
        
        int jumlahKamarTersedia = 0;
        
        // NESTED LOOP: Loop luar untuk kamar, loop dalam untuk tanggal
        for (int kamar = 1; kamar <= jumlahKamar; kamar++) {
            boolean kamarKosong = true;
            
            // Cek setiap tanggal dalam rentang
            for (int tanggal = tanggalMulai; tanggal <= tanggalSelesai; tanggal++) {
                if (!kamarTersedia[kamar][tanggal]) {
                    kamarKosong = false;
                    break; // Keluar dari loop jika ada tanggal yang tidak tersedia
                }
            }
            
            if (kamarKosong) {
                System.out.println("Kamar " + kamar + " : TERSEDIA untuk seluruh periode");
                jumlahKamarTersedia++;
            }
            
        }
        
        System.out.println("\nTotal kamar tersedia: " + jumlahKamarTersedia + " dari " + jumlahKamar + " kamar");
    }
    
    // FITUR 4: Tabel Harga Kamar Per Tipe Per Musim
    public static void fitur4_TabelHargaKamar() {
        String[] namaTipe = {"", "Standard Room", "Deluxe Room", "Suite Room", "Presidential Suite"};
        String[] namaMusim = {"", "Low Season", "High Season", "Peak Season"};
        
        int[][] hargaKamar = {
            {0, 0, 0, 0},
            {0, 500000, 750000, 1000000},      // Standard
            {0, 800000, 1200000, 1500000},     // Deluxe
            {0, 1500000, 2000000, 2500000},    // Suite
            {0, 3000000, 4000000, 5000000}     // Presidential
        };
        
        int jumlahTipeKamar = 4;
        int jumlahMusim = 3;
        
        System.out.println("\n=== TABEL HARGA KAMAR HOTEL ===");
        System.out.println();
        
        // Header tabel
        System.out.print(String.format("%-20s |", "Tipe Kamar"));
        for (int musim = 1; musim <= jumlahMusim; musim++) {
            System.out.print(String.format(" %-15s |", namaMusim[musim]));
        }
        System.out.println();
        System.out.println("-".repeat(75));
        
        // NESTED LOOP: Loop luar untuk tipe kamar, loop dalam untuk musim
        for (int tipe = 1; tipe <= jumlahTipeKamar; tipe++) {
            System.out.print(String.format("%-20s |", namaTipe[tipe]));
            
            for (int musim = 1; musim <= jumlahMusim; musim++) {
                System.out.print(String.format(" Rp %-12s |", 
                    String.format("%,d", hargaKamar[tipe][musim])));
            }
            System.out.println();
        }
    }
    
    // FITUR 5: Statistik Okupansi Per Lantai Per Hari
    public static void fitur5_StatistikOkupansi() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah lantai: ");
        int jumlahLantai = sc.nextInt();
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        
        System.out.print("Masukkan jumlah kamar per lantai: ");
        int kamarPerLantai = sc.nextInt();
        
        // Simulasi data okupansi (jumlah kamar terisi)
        int[][] kamarTerisi = new int[jumlahLantai + 1][jumlahHari + 1];
        
        // Inisialisasi data dummy (random occupancy)
        for (int i = 1; i <= jumlahLantai; i++) {
            for (int j = 1; j <= jumlahHari; j++) {
                kamarTerisi[i][j] = (int)(Math.random() * (kamarPerLantai + 1));
            }
        }
        
        System.out.println("\n=== STATISTIK OKUPANSI HOTEL ===");
        System.out.println();
        
        // NESTED LOOP: Loop luar untuk lantai, loop dalam untuk hari
        for (int lantai = 1; lantai <= jumlahLantai; lantai++) {
            System.out.println("Lantai " + lantai + ":");
            
            for (int hari = 1; hari <= jumlahHari; hari++) {
                double persenOkupansi = (kamarTerisi[lantai][hari] * 100.0) / kamarPerLantai;
                
                System.out.printf("  Hari %d : %d/%d kamar terisi (%.1f%%)\n", 
                    hari, kamarTerisi[lantai][hari], kamarPerLantai, persenOkupansi);
            }
            System.out.println();
        }
    }
    
    // MENU UTAMA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n╔════════════════════════════════════════════════╗");
            System.out.println("║      SISTEM HOTEL - NESTED LOOPS               ║");
            System.out.println("║      Politeknik Negeri Malang                  ║");
            System.out.println("╚════════════════════════════════════════════════╝");
            System.out.println("1. Tampilkan Ketersediaan Kamar Per Lantai");
            System.out.println("2. Laporan Booking Per Bulan Per Tipe Kamar");
            System.out.println("3. Cari Kamar Tersedia dalam Rentang Tanggal");
            System.out.println("4. Tabel Harga Kamar Per Tipe Per Musim");
            System.out.println("5. Statistik Okupansi Per Lantai Per Hari");
            System.out.println("0. Keluar");
            System.out.println("═".repeat(50));
            System.out.print("Pilih menu (0-5): ");
            
            try {
                int pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1:
                        fitur1_KetersediaanKamar();
                        break;
                    case 2:
                        fitur2_LaporanBooking();
                        break;
                    case 3:
                        fitur3_CariKamarTersedia();
                        break;
                    case 4:
                        fitur4_TabelHargaKamar();
                        break;
                    case 5:
                        fitur5_StatistikOkupansi();
                        break;
                    case 0:
                        System.out.println("\n╔════════════════════════════════════════════════╗");
                        System.out.println("║  Terima kasih telah menggunakan Sistem Hotel! ║");
                        System.out.println("╚════════════════════════════════════════════════╝");
                        scanner.close();
                        return;
                    default:
                        System.out.println("\n❌ Pilihan tidak valid! Silakan pilih 0-5.");
                }
                
                System.out.println("\n" + "=".repeat(50));
                System.out.println("Tekan Enter untuk kembali ke menu...");
                scanner.nextLine(); // consume newline
                scanner.nextLine(); // wait for user
                
            } catch (Exception e) {
                System.out.println("\n❌ Input tidak valid! Silakan masukkan angka.");
                scanner.nextLine(); // clear buffer
            }
        }
    }
}
