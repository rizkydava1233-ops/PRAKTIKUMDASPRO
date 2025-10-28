package jobsheet8;
import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        
        // Perulangan untuk menampilkan karakter * sebanyak N kali
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        
        sc.close();
    }   
}
