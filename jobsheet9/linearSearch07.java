import java.util.Scanner;

public class linearSearch07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input jumlah elemen array
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();
        
        // Buat array sesuai jumlah elemen
        int[] arrayInt = new int[n];
        
        // Input isi array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        // Input key yang mau dicari
        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();
        
        // Variable untuk menyimpan hasil pencarian
        int result = -1;  // -1 artinya belum ketemu
        
        // Linear search algorithm
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;  // Stop kalau udah ketemu
            }
        }
        
        // Tampilkan hasil
        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("Key not found in the array");
        }
        
        sc.close();
    }
}