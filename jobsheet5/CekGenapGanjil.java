package jobsheet5;
import java.util.Scanner;

public class CekGenapGanjil {

    public static void main(String[] args) {
        // Deklarasi variabel untuk input
        int angka; 
        
        // Inisialisasi Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in); 
        
        // Mulai (Start) - seperti di flowchart
        System.out.println("--- Program Pengecekan Genap atau Ganjil ---");

        // int angka; - Deklarasi variabel
        // Sudah dilakukan di atas: int angka;
        
        // input angka; - Meminta input dari pengguna
        System.out.print("Masukkan sebuah angka integer: ");
        angka = input.nextInt(); // Membaca input angka
        
        // Pengecekan kondisi: angka % 2 == 0
        // Jika angka dibagi 2 sisanya 0 (Ya/True)
        if (angka % 2 == 0) {
            // output 'Genap'
            System.out.println("Angka " + angka + " adalah: Genap"); 
        } 
        // Jika angka dibagi 2 sisanya bukan 0 (Tidak/False)
        else { 
            // output 'Ganjil'
            System.out.println("Angka " + angka + " adalah: Ganjil"); 
        }
        
        // End - Menutup objek Scanner
        input.close(); 
        System.out.println("--- Program Selesai ---");
    }
}