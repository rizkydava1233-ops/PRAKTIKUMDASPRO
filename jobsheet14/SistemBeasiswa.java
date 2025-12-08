package jobsheet14;

// Name : Dava Rizky Hidayatullah
// NIM  : 254107020246
// Class: Ti/1i

import java.util.ArrayList;
import java.util.Scanner;

// Class untuk menyimpan data mahasiswa
class Mahasiswa {
    String nama;
    String nim;
    double ipk;
    String jenisBeasiswa;
    int penghasilanOrtu;
    
    // Constructor
    Mahasiswa(String nama, String nim, double ipk, String jenisBeasiswa, int penghasilanOrtu) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.jenisBeasiswa = jenisBeasiswa;
        this.penghasilanOrtu = penghasilanOrtu;
    }
}

public class SistemBeasiswa {
    // ArrayList untuk menyimpan data mahasiswa
    static ArrayList<Mahasiswa> dataMhs = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilih;
        
        // Loop menu utama
        do {
            System.out.println("\n========================================");
            System.out.println("SISTEM PENDAFTARAN BEASISWA MAHASISWA");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Pendaftar Beasiswa");
            System.out.println("2. Tampilkan Semua Pendaftar");
            System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.println("========================================");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            // Switch case untuk menu
            switch(pilih) {
                case 1: tambahData(); break;
                case 2: tampilData(); break;
                case 3: cariData(); break;
                case 4: hitungRataIPK(); break;
                case 5: System.out.println("\nTerima kasih!"); break;
                default: System.out.println("Pilihan salah!");
            }
        } while(pilih != 5);
    }
    
    // Fungsi untuk menambah data pendaftar
    static void tambahData() {
        System.out.println("\n--- Tambah Data Pendaftar ---");
        
        // Input nama
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        
        // Input NIM
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        
        // Input dan validasi IPK
        double ipk = 0;
        boolean valid = false;
        while(!valid) {
            System.out.print("IPK: ");
            ipk = sc.nextDouble();
            if(ipk >= 0 && ipk <= 4.0) {
                valid = true;
            } else {
                System.out.println("IPK harus 0-4!");
            }
        }
        sc.nextLine();
        
        // Input dan validasi jenis beasiswa
        String jenis = "";
        valid = false;
        while(!valid) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenis = sc.nextLine().toUpperCase();
            
            if(jenis.equals("REGULER") || jenis.equals("UNGGULAN") || jenis.equals("RISET")) {
                valid = true;
            } else {
                System.out.println("Jenis beasiswa tidak valid!");
            }
        }
        
        // Input dan validasi penghasilan orang tua
        int gaji = 0;
        valid = false;
        while(!valid) {
            System.out.print("Penghasilan Orang Tua (maks 2000000): ");
            gaji = sc.nextInt();
            sc.nextLine();
            
            if(gaji <= 2000000 && gaji >= 0) {
                valid = true;
            } else {
                System.out.println("Penghasilan melebihi batas!");
            }
        }
        
        // Untuk buat objek mahasiswa dan ditambahkan ke ArrayList
        Mahasiswa m = new Mahasiswa(nama, nim, ipk, jenis, gaji);
        dataMhs.add(m);
        System.out.println("Data berhasil ditambahkan!");
    }
    
    // Fungsi untuk menampilkan semua data
    static void tampilData() {
        System.out.println("\n--- Daftar Pendaftar Beasiswa ---");
        
        // Cek apakah ada data
        if(dataMhs.size() == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        // Header tabel
        System.out.println("=======================================================================================");
        System.out.printf("%-4s %-25s %-15s %-6s %-12s %-15s\n", 
            "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
        System.out.println("=======================================================================================");
        
        // Loop untuk menampilkan data
        for(int i = 0; i < dataMhs.size(); i++) {
            Mahasiswa m = dataMhs.get(i);
            System.out.printf("%-4d %-25s %-15s %-6.2f %-12s Rp%-13d\n",
                (i+1), m.nama, m.nim, m.ipk, m.jenisBeasiswa, m.penghasilanOrtu);
        }
        System.out.println("=======================================================================================");
    }
    
    // Fungsi untuk mencari data berdasarkan jenis beasiswa
    static void cariData() {
        System.out.println("\n--- Cari Data Berdasarkan Jenis Beasiswa ---");
        
        if(dataMhs.size() == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        // Input jenis beasiswa yang dicari
        System.out.print("Masukkan jenis beasiswa: ");
        String cari = sc.nextLine().toUpperCase();
        
        System.out.println("\nHasil Pencarian:");
        System.out.println("=======================================================================================");
        System.out.printf("%-4s %-25s %-15s %-6s %-12s %-15s\n", 
            "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
        System.out.println("=======================================================================================");
        
        // Loop untuk mencari dan menampilkan data
        int no = 1;
        int ketemu = 0;
        for(int i = 0; i < dataMhs.size(); i++) {
            Mahasiswa m = dataMhs.get(i);
            if(m.jenisBeasiswa.equals(cari)) {
                System.out.printf("%-4d %-25s %-15s %-6.2f %-12s Rp%-13d\n",
                    no, m.nama, m.nim, m.ipk, m.jenisBeasiswa, m.penghasilanOrtu);
                no++;
                ketemu++;
            }
        }
        
        if(ketemu == 0) {
            System.out.println("Data tidak ditemukan");
        }
        System.out.println("=======================================================================================");
    }
    
    // Fungsi untuk menghitung rata-rata IPK per jenis beasiswa
    static void hitungRataIPK() {
        System.out.println("\n--- Rata-rata IPK per Jenis Beasiswa ---");
        
        if(dataMhs.size() == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        // Variabel untuk menghitung total dan jumlah
        double totalReguler = 0, totalUnggulan = 0, totalRiset = 0;
        int jmlReguler = 0, jmlUnggulan = 0, jmlRiset = 0;
        
        // Loop untuk menghitung total IPK per jenis
        for(int i = 0; i < dataMhs.size(); i++) {
            Mahasiswa m = dataMhs.get(i);
            
            if(m.jenisBeasiswa.equals("REGULER")) {
                totalReguler += m.ipk;
                jmlReguler++;
            } else if(m.jenisBeasiswa.equals("UNGGULAN")) {
                totalUnggulan += m.ipk;
                jmlUnggulan++;
            } else if(m.jenisBeasiswa.equals("RISET")) {
                totalRiset += m.ipk;
                jmlRiset++;
            }
        }
        
        // Tampilkan hasil perhitungan
        System.out.println("=========================================");
        if(jmlReguler > 0) {
            System.out.printf("Reguler  : %.2f\n", totalReguler/jmlReguler);
        } else {
            System.out.println("Reguler  : tidak ada data");
        }
        
        if(jmlUnggulan > 0) {
            System.out.printf("Unggulan : %.2f\n", totalUnggulan/jmlUnggulan);
        } else {
            System.out.println("Unggulan : tidak ada data");
        }
        
        if(jmlRiset > 0) {
            System.out.printf("Riset    : %.2f\n", totalRiset/jmlRiset);
        } else {
            System.out.println("Riset    : tidak ada data");
        }
        System.out.println("=========================================");
    }
}