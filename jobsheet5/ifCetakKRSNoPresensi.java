package jobsheet5;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false)");


        boolean uktLunas = sc.nextBoolean();
       if (uktLunas) {
            System.out.println("Pembayaran UKT terverikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
    
        sc.close();
    }

}