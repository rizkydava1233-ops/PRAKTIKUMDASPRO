package jobsheet8.assignment;
import java.util.Scanner;
public class SquareNumericDisplay {
      public static void printSquarePattern(int n) {
        // Check if n is at least 3
        if (n < 3) {
            System.out.println("Error: N must be at least 3");
            return;
        }
        
        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Top row or bottom row: print n for all positions
                if (i == 0 || i == n - 1) {
                    System.out.print(n + " ");
                }
                // Left column or right column: print n
                else if (j == 0 || j == n - 1) {
                    System.out.print(n + " ");
                }
                // Inside the square: print spaces
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the value of N (minimum 3): ");
            int n = scanner.nextInt();
            System.out.println();
            
            printSquarePattern(n);
            
        } catch (Exception e) {
            System.out.println("Please enter a valid integer");
        } finally {
            scanner.close();
        }
    }
}
