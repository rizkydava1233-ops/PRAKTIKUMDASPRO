package jobsheet10;

import java.util.Scanner;

public class SIAKAD07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input jumlah siswa dan mata kuliah secara dinamis
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        
        // Buat array dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];
        
        // Gunakan scanner dan nested loop untuk mengisi elemen pada array nilai
        // dan menghitung nilai rata-rata setiap siswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            
            System.out.println("Nilai rata-rata: " + totalPerSiswa/jumlahMatkul);
        }
        
        // Tampilkan rata-rata nilai setiap mata kuliah
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }
        
        sc.close();
    }

}
