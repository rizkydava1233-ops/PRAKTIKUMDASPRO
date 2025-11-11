package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner07 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;
        
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            // Simpan nama ke array (baris dan kolom dikurangi 1 karena indeks dimulai dari 0)
            penonton[baris-1][kolom-1] = nama;
            
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        // Tampilkan daftar penonton
        System.out.println("\nDaftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Baris ke-" + (i+1) + ": ");
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.print(penonton[i][j]);
                    if (j < penonton[i].length - 1 && penonton[i][j+1] != null) {
                        System.out.print(", ");
                    }
                } else {
                    System.out.print("***");
                    if (j < penonton[i].length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println();
        }
        
        sc.close();

    }
    
}
