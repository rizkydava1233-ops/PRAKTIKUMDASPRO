package jobsheet8.assignment;
import java.util.Scanner;
public class NumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter N (minimum 3): ");
        int N = sc.nextInt();
        
        // Validate input
        if (N < 3) {
            System.out.println("Error: N must be at least 3");
        } else {
            // Print the triangle
            for (int i = 1; i <= N; i++) {
                // Print numbers from 1 to i
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Move to next line
                System.out.println();
            }
        }
        
        sc.close();
    }
}
