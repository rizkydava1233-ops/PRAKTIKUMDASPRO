package jobsheet13.TUGAS;

import java.util.Scanner;

public class SummationRecursive {
    
    // ========== RECURSIVE SUMMATION ==========
    static int sumRecursive(int n) {
        // Base case: sum of 0 is 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: n + sum of numbers from 1 to n-1
        return n + sumRecursive(n - 1);
    }
    
    // ========== RECURSIVE WITH PRINTING ==========
    static int sumRecursiveWithPrint(int n) {
        if (n <= 0) {
            System.out.print("0");
            return 0;
        }
        if (n == 1) {
            System.out.print("1");
            return 1;
        }
        System.out.print(n + "+");
        int result = n + sumRecursiveWithPrint(n - 1);
        return result;
    }
    
    // ========== ITERATIVE SUMMATION ==========
    static int sumIterative(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    
    // ========== MATHEMATICAL FORMULA ==========
    static int sumFormula(int n) {
        // Formula: n*(n+1)/2
        return n * (n + 1) / 2;
    }
    
    // ========== MAIN METHOD ==========
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive number (n): ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("\n=== SUMMATION FROM 1 TO " + n + " ===");
            
            // Recursive with printing
            System.out.print("Summation series: ");
            int result1 = sumRecursiveWithPrint(n);
            System.out.println(" = " + result1);
            
            // Simple recursive
            int result2 = sumRecursive(n);
            System.out.println("Recursive result: " + result2);
            
            // Iterative
            int result3 = sumIterative(n);
            System.out.println("Iterative result: " + result3);
            
            // Formula
            int result4 = sumFormula(n);
            System.out.println("Formula result (n*(n+1)/2): " + result4);
            
            // Verification
            System.out.println("\n=== VERIFICATION ===");
            boolean allMatch = (result1 == result2) && 
                              (result2 == result3) && 
                              (result3 == result4);
            System.out.println("All methods give same result: " + allMatch);
            
            // Show step-by-step for n=8
            if (n == 8) {
                System.out.println("\n=== STEP-BY-STEP FOR n=8 ===");
                System.out.println("Recursive expansion:");
                System.out.println("sum(8) = 8 + sum(7)");
                System.out.println("       = 8 + (7 + sum(6))");
                System.out.println("       = 8 + (7 + (6 + sum(5)))");
                System.out.println("       = 8 + (7 + (6 + (5 + sum(4))))");
                System.out.println("       = 8 + (7 + (6 + (5 + (4 + sum(3)))))");
                System.out.println("       = 8 + (7 + (6 + (5 + (4 + (3 + sum(2))))))");
                System.out.println("       = 8 + (7 + (6 + (5 + (4 + (3 + (2 + sum(1)))))))");
                System.out.println("       = 8 + (7 + (6 + (5 + (4 + (3 + (2 + 1))))))");
                System.out.println("       = 8 + (7 + (6 + (5 + (4 + (3 + 3)))))");
                System.out.println("       = 8 + (7 + (6 + (5 + (4 + 6))))");
                System.out.println("       = 8 + (7 + (6 + (5 + 10)))");
                System.out.println("       = 8 + (7 + (6 + 15))");
                System.out.println("       = 8 + (7 + 21)");
                System.out.println("       = 8 + 28");
                System.out.println("       = 36");
            }
        }
        
        input.close();
    }
}