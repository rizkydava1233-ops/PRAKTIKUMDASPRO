package jobsheet8.assignment;
import java.util.Scanner;
public class StarTriangle {
     public static void printStarTriangle(int n) {
        // Check if n is at least 5
        if (n < 5) {
            System.out.println("Error: N must be at least 5");
            return;
        }
        
        // Print triangle pattern
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the value of N (minimum 5): ");
            int n = scanner.nextInt();
            System.out.println();
            
            printStarTriangle(n);
            
        } catch (Exception e) {
            System.out.println("Please enter a valid integer");
        } finally {
            scanner.close();
        }
    }
    
}
