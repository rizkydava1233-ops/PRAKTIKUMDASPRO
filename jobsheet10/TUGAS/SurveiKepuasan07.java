package jobsheet10.TUGAS;

import java.util.Scanner;

public class SurveiKepuasan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi array survei 10x6
        // responden = 10, pertanyaan = 6
        int[][] survei = new int[10][6];
        
        // a. Menyimpan hasil survei
        System.out.println("=== SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Skala penilaian: 1-5\n");
        
        // Loop input data responden
        for (int i = 0; i < 10; i++) {
            System.out.println("Tampilkan: Input data responden ke-" + (i + 1));
            
            // Loop input nilai pertanyaan
            for (int j = 0; j < 6; j++) {
                boolean validInput = false;
                
                while (!validInput) {
                    System.out.print("Input nilai pertanyaan " + (j + 1) + " [survei[" + i + "][" + j + "] = input]: ");
                    int nilai = sc.nextInt();
                    
                    // Validasi: Nilai 1-5?
                    if (nilai >= 1 && nilai <= 5) {
                        survei[i][j] = nilai;
                        validInput = true;
                    } else {
                        System.out.println("Tampilkan: Input harus 1-5");
                    }
                }
                // j = j + 1 (otomatis oleh loop)
            }
            // i = i + 1 (otomatis oleh loop)
            System.out.println();
        }
        
        // ===== Analisis Data =====
        System.out.println("\n========================================");
        System.out.println("===== Analisis Data =====");
        System.out.println("========================================");
        
        // b. Tampilkan: Rata-rata per Responden
        System.out.println("\nTampilkan: Rata-rata per Responden");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            // totalPerResp = 0
            double totalPerResp = 0;
            
            // Loop untuk menjumlahkan nilai
            for (int j = 0; j < 6; j++) {
                // totalPerResp += survei[i][j]
                totalPerResp += survei[i][j];
                // j = j + 1 (otomatis oleh loop)
            }
            
            // rataResp = totalPerResp / 6
            double rataResp = totalPerResp / 6;
            
            // Tampilkan: Responden i+1 = rataResp
            System.out.printf("Responden %2d = %.2f\n", (i + 1), rataResp);
            // i = i + 1 (otomatis oleh loop)
        }
        
        // ========================
        
        // c. Tampilkan: Rata-rata per Pertanyaan
        System.out.println("\n========================================");
        System.out.println("Tampilkan: Rata-rata per Pertanyaan");
        System.out.println("----------------------------------------");
        
        for (int j = 0; j < 6; j++) {
            // totalPerPert = 0
            double totalPerPert = 0;
            
            // Loop untuk menjumlahkan nilai
            for (int i = 0; i < 10; i++) {
                // totalPerPert += survei[i][j]
                totalPerPert += survei[i][j];
                // i = i + 1 (otomatis oleh loop)
            }
            
            // rataPert = totalPerPert / 10
            double rataPert = totalPerPert / 10;
            
            // Tampilkan: Pertanyaan j+1 = rataPert
            System.out.printf("Pertanyaan %d = %.2f\n", (j + 1), rataPert);
            // j = j + 1 (otomatis oleh loop)
        }
        
        // ========================
        
        // d. Tampilkan: Rata-rata keseluruhan
        System.out.println("\n========================================");
        System.out.println("Tampilkan: Rata-rata keseluruhan");
        System.out.println("----------------------------------------");
        
        // totalKeseluruhan = 0
        double totalKeseluruhan = 0;
        
        // Loop untuk menjumlahkan semua nilai
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                // totalKeseluruhan += survei[i][j]
                totalKeseluruhan += survei[i][j];
                // j = j + 1 (otomatis oleh loop)
            }
            // i = i + 1 (otomatis oleh loop)
        }
        
        // rataKeseluruhan = totalKeseluruhan / 60
        double rataKeseluruhan = totalKeseluruhan / 60;
        
        // Tampilkan: Rata-rata keseluruhan = rataKeseluruhan
        System.out.printf("Rata-rata keseluruhan = %.2f\n", rataKeseluruhan);
        
        System.out.println("\n========================================");
        System.out.println("Selesai");
        
        sc.close();
    }
    
}
