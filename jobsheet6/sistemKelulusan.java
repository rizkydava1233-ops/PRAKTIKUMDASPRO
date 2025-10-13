package jobsheet6;
import java.util.Scanner;

public class sistemKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi Variabel
        String namaMahasiswa;
        String nim;
        
        // Variabel untuk Algoritma dan Pemrograman
        double utsAlgo, uasAlgo, tugasAlgo;
        double nilaiAkhirAlgo;
        String statusAlgo, gradeAlgo;
        double nilaiSetaraAlgo;
        
        // Variabel untuk Struktur Data
        double utsStd, uasStd, tugasStd;
        double nilaiAkhirStd;
        String statusStd, gradeStd;
        double nilaiSetaraStd;
        
        // Variabel untuk Status Semester
        double rataRataNilai;
        String statusSemester;
        
        // Input Data Mahasiswa
        System.out.println("\n============================================");
        System.out.println("             INPUT DATA MAHASISWA");
        System.out.println("============================================");
        System.out.print("Nama : ");
        namaMahasiswa = input.nextLine();
        System.out.print("NIM  : ");
        nim = input.nextLine();
        
        // Input Nilai Algoritma dan Pemrograman
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS  : ");
        utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS  : ");
        uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        tugasAlgo = input.nextDouble();
        
        // Input Nilai Struktur Data
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS  : ");
        utsStd = input.nextDouble();
        System.out.print("Nilai UAS  : ");
        uasStd = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        tugasStd = input.nextDouble();
        
        // Perhitungan Nilai Akhir Algoritma dan Pemrograman
        nilaiAkhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        
        // Menentukan Status dan Grade Algoritma dan Pemrograman
        if (nilaiAkhirAlgo >= 60) {
            statusAlgo = "LULUS";
        } else {
            statusAlgo = "TIDAK LULUS";
        }
        
        // Konversi nilai ke grade dengan tabel
        if (nilaiAkhirAlgo >= 80) {
            gradeAlgo = "A";
            nilaiSetaraAlgo = 4.0;
        } else if (nilaiAkhirAlgo >= 73) {
            gradeAlgo = "B+";
            nilaiSetaraAlgo = 3.5;
        } else if (nilaiAkhirAlgo >= 65) {
            gradeAlgo = "B";
            nilaiSetaraAlgo = 3.0;
        } else if (nilaiAkhirAlgo >= 60) {
            gradeAlgo = "C+";
            nilaiSetaraAlgo = 2.5;
        } else if (nilaiAkhirAlgo >= 50) {
            gradeAlgo = "C";
            nilaiSetaraAlgo = 2.0;
        } else if (nilaiAkhirAlgo >= 39) {
            gradeAlgo = "D";
            nilaiSetaraAlgo = 1.0;
        } else {
            gradeAlgo = "E";
            nilaiSetaraAlgo = 0.0;
        }
        
        // Perhitungan Nilai Akhir Struktur Data
        nilaiAkhirStd = (utsStd * 0.3) + (uasStd * 0.4) + (tugasStd * 0.3);
        
        // Menentukan Status dan Grade Struktur Data
        if (nilaiAkhirStd >= 60) {
            statusStd = "LULUS";
        } else {
            statusStd = "TIDAK LULUS";
        }
        
        // Konversi nilai ke grade dengan tabel
        if (nilaiAkhirStd >= 80) {
            gradeStd = "A";
            nilaiSetaraStd = 4.0;
        } else if (nilaiAkhirStd >= 73) {
            gradeStd = "B+";
            nilaiSetaraStd = 3.5;
        } else if (nilaiAkhirStd >= 65) {
            gradeStd = "B";
            nilaiSetaraStd = 3.0;
        } else if (nilaiAkhirStd >= 60) {
            gradeStd = "C+";
            nilaiSetaraStd = 2.5;
        } else if (nilaiAkhirStd >= 50) {
            gradeStd = "C";
            nilaiSetaraStd = 2.0;
        } else if (nilaiAkhirStd >= 39) {
            gradeStd = "D";
            nilaiSetaraStd = 1.0;
        } else {
            gradeStd = "E";
            nilaiSetaraStd = 0.0;
        }
        
        // Perhitungan Rata-rata Nilai
        rataRataNilai = (nilaiAkhirAlgo + nilaiAkhirStd) / 2;
        
        // Nested If untuk menentukan Status Semester
        if (statusAlgo.equals("LULUS") && statusStd.equals("LULUS")) {
            if (rataRataNilai >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }
        
        // Output Hasil
        System.out.println("\n================================================");
        System.out.println("         HASIL PENILAIAN MAHASISWA");
        System.out.println("================================================");
        System.out.println("Nama : " + namaMahasiswa);
        System.out.println("NIM  : " + nim);
        System.out.println();
        
        // Tabel Output
        System.out.println("Mata Kuliah                 UTS   UAS   Tugas  Nilai Akhir  Nilai Huruf  Nilai Setara  Status");
        System.out.println("==================================================================================================");
        System.out.printf("%-28s %-5.0f %-5.0f %-6.0f %-12.2f %-12s %-13.1f %s%n", 
            "Algoritma Pemrograman", utsAlgo, uasAlgo, tugasAlgo, nilaiAkhirAlgo, gradeAlgo, nilaiSetaraAlgo, statusAlgo);
        System.out.printf("%-28s %-5.0f %-5.0f %-6.0f %-12.2f %-12s %-13.1f %s%n", 
            "Struktur Data", utsStd, uasStd, tugasStd, nilaiAkhirStd, gradeStd, nilaiSetaraStd, statusStd);
        System.out.println("==================================================================================================");
        
        System.out.println("\nRata-rata Nilai Akhir: " + String.format("%.2f", rataRataNilai));
        System.out.println("Status Semester       : " + statusSemester);
        System.out.println();

        input.close();
    }
}