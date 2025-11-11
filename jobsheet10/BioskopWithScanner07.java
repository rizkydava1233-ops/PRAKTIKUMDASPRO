package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, menu;
        
        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            if (menu == 1) {
                // Menu 1: Input data penonton
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    
                    // Validasi baris dan kolom
                    if (baris < 1 || baris > 4) {
                        System.out.println("Nomor baris tidak tersedia! Baris yang tersedia: 1-4");
                    } else if (kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kolom tidak tersedia! Kolom yang tersedia: 1-2");
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris-1][kolom-1] + "! Silakan pilih kursi lain.");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil disimpan!");
                    }
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                
            } else if (menu == 2) {
                // Menu 2: Tampilkan daftar penonton
                System.out.println("\n===== DAFTAR PENONTON =====");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-" + (i+1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.print(penonton[i][j]);
                        } else {
                            System.out.print("***");
                        }
                        
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
                
            } else if (menu == 3) {
                // Menu 3: Exit
                System.out.println("Terima kasih! Program selesai.");
                break;
                
            } else {
                System.out.println("Menu tidak valid! Silakan pilih menu 1-3.");
            }
        }
        
        sc.close();
        


    }
    
}
