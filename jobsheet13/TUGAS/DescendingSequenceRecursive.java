package jobsheet13.TUGAS;
import java.util.Scanner;

public class DescendingSequenceRecursive {
    
    // ========== RECURSIVE METHOD ==========
    static void displayRecursive(int n) {
        // Base case: stop when n is negative
        if (n < 0) {
            return;
        }
        // Print current number
        System.out.print(n + " ");
        // Recursive call with n-1
        displayRecursive(n - 1);
    }
    
    // ========== ITERATIVE METHOD ==========
    static void displayIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    
    // ========== MAIN METHOD ==========
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();
        
        // Validate input
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("\n=== USING RECURSIVE FUNCTION ===");
            displayRecursive(n);
            
            System.out.println("\n\n=== USING ITERATIVE FUNCTION ===");
            displayIterative(n);
        }
        
        input.close();
    }
}