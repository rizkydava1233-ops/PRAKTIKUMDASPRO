package jobsheet10;

import java.util.Scanner;

public class SIAKAD07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Buat array of int bernama nilai dengan 4 baris dan 3 kolom
        int[][] nilai = new int[4][3];
        
        // Gunakan scanner dan nested loop untuk mengisi elemen pada array nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        // Modifikasi kode program pada langkah 6 untuk menghitung dan menampilkan
        // nilai rata-rata setiap mata kuliah
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
        
        sc.close();
    }
    
}
