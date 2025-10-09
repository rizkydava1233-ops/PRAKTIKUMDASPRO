package jobsheet5;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false)");


        boolean uktLunas = sc.nextBoolean();
      if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } 
        else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }


        // ============================
        // Tambahan baris baru:
        // Transformasi ke bentuk Ternary Operator
        // ============================
        String hasil = uktLunas
            ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        System.out.println("\n[Hasil menggunakan Ternary Operator]");
        System.out.println(hasil);
    
        sc.close();
    }

}