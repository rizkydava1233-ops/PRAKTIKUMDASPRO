package jobsheet14;

// Name : Dava Rizky Hidayatullah
// NIM  : 254107020246
// Class: Ti/1i

import java.util.Scanner;

public class SistemBeasiswa {
    // Array 2D untuk menyimpan data mahasiswa
    // Kolom: [0]=Nama, [1]=NIM, [2]=IPK, [3]=JenisBeasiswa, [4]=PenghasilanOrtu
    static String[][] dataMhs = new String[100][5]; // Maksimal 100 mahasiswa
    static int jumlahData = 0; // Counter jumlah data yang sudah diisi
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
        if(jumlahData >= 100) {
            System.out.println("Data sudah penuh!");
            return;
        }
        
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
        
        // Simpan data ke array 2D
        dataMhs[jumlahData][0] = nama;
        dataMhs[jumlahData][1] = nim;
        dataMhs[jumlahData][2] = String.valueOf(ipk);
        dataMhs[jumlahData][3] = jenis;
        dataMhs[jumlahData][4] = String.valueOf(gaji);
        
        jumlahData++;
        System.out.println("Data berhasil ditambahkan!");
    }
    
    // Fungsi untuk menampilkan semua data (DENGAN NESTED LOOP)
    static void tampilData() {
        System.out.println("\n--- Daftar Pendaftar Beasiswa ---");
        
        // Cek apakah ada data
        if(jumlahData == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        // Header tabel
        System.out.println("=======================================================================================");
        System.out.printf("%-4s %-25s %-15s %-6s %-12s %-15s\n", 
            "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
        System.out.println("=======================================================================================");
        
        // NESTED LOOP untuk menampilkan data
        // Loop outer: iterasi setiap baris (mahasiswa)
        for(int i = 0; i < jumlahData; i++) {
            System.out.printf("%-4d ", (i+1));
            
            // Loop inner: iterasi setiap kolom (atribut mahasiswa)
            for(int j = 0; j < 5; j++) {
                if(j == 0) {
                    System.out.printf("%-25s ", dataMhs[i][j]); // Nama
                } else if(j == 1) {
                    System.out.printf("%-15s ", dataMhs[i][j]); // NIM
                } else if(j == 2) {
                    System.out.printf("%-6s ", dataMhs[i][j]);  // IPK
                } else if(j == 3) {
                    System.out.printf("%-12s ", dataMhs[i][j]); // Jenis
                } else if(j == 4) {
                    System.out.printf("Rp%-13s", dataMhs[i][j]); // Penghasilan
                }
            }
            System.out.println(); // Pindah baris setelah selesai 1 mahasiswa
        }
        System.out.println("=======================================================================================");
    }
    
    // Fungsi untuk mencari data berdasarkan jenis beasiswa (DENGAN NESTED LOOP)
    static void cariData() {
        System.out.println("\n--- Cari Data Berdasarkan Jenis Beasiswa ---");
        
        if(jumlahData == 0) {
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
        
        // NESTED LOOP untuk mencari dan menampilkan data
        int no = 1;
        int ketemu = 0;
        
        // Loop outer: iterasi setiap baris (mahasiswa)
        for(int i = 0; i < jumlahData; i++) {
            // Cek apakah jenis beasiswa sesuai
            if(dataMhs[i][3].equals(cari)) {
                System.out.printf("%-4d ", no);
                
                // Loop inner: iterasi setiap kolom untuk mahasiswa yang cocok
                for(int j = 0; j < 5; j++) {
                    if(j == 0) {
                        System.out.printf("%-25s ", dataMhs[i][j]);
                    } else if(j == 1) {
                        System.out.printf("%-15s ", dataMhs[i][j]);
                    } else if(j == 2) {
                        System.out.printf("%-6s ", dataMhs[i][j]);
                    } else if(j == 3) {
                        System.out.printf("%-12s ", dataMhs[i][j]);
                    } else if(j == 4) {
                        System.out.printf("Rp%-13s", dataMhs[i][j]);
                    }
                }
                System.out.println();
                no++;
                ketemu++;
            }
        }
        
        if(ketemu == 0) {
            System.out.println("Data tidak ditemukan");
        }
        System.out.println("=======================================================================================");
    }
    
    // Fungsi untuk menghitung rata-rata IPK per jenis beasiswa (DENGAN NESTED LOOP)
    static void hitungRataIPK() {
        System.out.println("\n--- Rata-rata IPK per Jenis Beasiswa ---");
        
        if(jumlahData == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        // Array untuk jenis-jenis beasiswa
        String[] jenisBeasiswa = {"REGULER", "UNGGULAN", "RISET"};
        
        System.out.println("=========================================");
        
        // NESTED LOOP untuk menghitung rata-rata per jenis
        // Loop outer: iterasi setiap jenis beasiswa
        for(int i = 0; i < jenisBeasiswa.length; i++) {
            double total = 0;
            int jumlah = 0;
            
            // Loop inner: iterasi semua mahasiswa untuk hitung yang sesuai jenis
            for(int j = 0; j < jumlahData; j++) {
                if(dataMhs[j][3].equals(jenisBeasiswa[i])) {
                    total += Double.parseDouble(dataMhs[j][2]);
                    jumlah++;
                }
            }
            
            // Tampilkan hasil
            if(jumlah > 0) {
                System.out.printf("%-9s: %.2f (dari %d mahasiswa)\n", 
                    jenisBeasiswa[i], total/jumlah, jumlah);
            } else {
                System.out.printf("%-9s: tidak ada data\n", jenisBeasiswa[i]);
            }
        }
        System.out.println("=========================================");
    }
}