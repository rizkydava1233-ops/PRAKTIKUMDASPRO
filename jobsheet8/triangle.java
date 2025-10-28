package jobsheet8;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        
        // Outer while loop untuk baris
        int i = 1;
        while (i <= N) {
            // Inner while loop untuk kolom
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            // Pindah ke baris baru
            System.out.println();
            i++;
        }
        
        sc.close();
    }    
}
