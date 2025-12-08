package jobsheet13.TUGAS;

import java.util.Scanner;

public class GuineaPigFibonacci {
    
    // ========== RECURSIVE FIBONACCI ==========
    static int fibonacci(int month) {
        // Base cases
        if (month <= 0) return 0;
        if (month == 1) return 1;
        if (month == 2) return 1;
        
        // Recursive case: Fibonacci formula
        return fibonacci(month - 1) + fibonacci(month - 2);
    }
    
    // ========== RECURSIVE WITH MEMOIZATION ==========
    static int fibonacciMemo(int month, int[] memo) {
        if (month <= 0) return 0;
        if (month == 1 || month == 2) return 1;
        
        // Check if already calculated
        if (memo[month] != 0) {
            return memo[month];
        }
        
        // Calculate and store in memo array
        memo[month] = fibonacciMemo(month - 1, memo) + fibonacciMemo(month - 2, memo);
        return memo[month];
    }
    
    // ========== ITERATIVE FIBONACCI ==========
    static int fibonacciIterative(int month) {
        if (month <= 0) return 0;
        if (month == 1 || month == 2) return 1;
        
        int prev1 = 1;  // F(n-1)
        int prev2 = 1;  // F(n-2)
        int current = 0;
        
        for (int i = 3; i <= month; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
    
    // ========== DISPLAY TABLE ==========
    static void displayTable(int months) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("GUINEA PIG POPULATION GROWTH (FIBONACCI SEQUENCE)");
        System.out.println("=".repeat(60));
        System.out.printf("%-10s %-20s %-20s %-15s%n", 
                         "Month", "Productive Pairs", "Non-Productive Pairs", "Total Pairs");
        System.out.println("-".repeat(60));
        
        int prevTotal = 0;
        int currentTotal = 1;
        
        for (int month = 1; month <= months; month++) {
            int productivePairs = prevTotal;
            int nonProductivePairs = currentTotal;
            int totalPairs = productivePairs + nonProductivePairs;
            
            System.out.printf("%-10d %-20d %-20d %-15d%n", 
                            month, productivePairs, nonProductivePairs, totalPairs);
            
            // Update for next month
            int nextTotal = prevTotal + currentTotal;
            prevTotal = currentTotal;
            currentTotal = nextTotal;
        }
        System.out.println("=".repeat(60));
    }
    
    // ========== EXPLAIN GROWTH PATTERN ==========
    static void explainGrowth(int month) {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("EXPLANATION OF GUINEA PIG GROWTH:");
        System.out.println("=".repeat(70));
        System.out.println("Rules:");
        System.out.println("1. Start with 1 pair (male + female) of newborn guinea pigs");
        System.out.println("2. Guinea pigs become productive after 2 months");
        System.out.println("3. Each productive pair produces 1 new pair every month");
        System.out.println("4. Newborn pairs need 2 months to become productive");
        System.out.println();
        
        System.out.println("Growth Pattern:");
        for (int m = 1; m <= month && m <= 12; m++) {
            int total = fibonacci(m);
            System.out.print("Month " + m + ": " + total + " pair" + (total != 1 ? "s" : ""));
            
            if (m == 1) System.out.print(" (Starting pair)");
            else if (m == 2) System.out.print(" (Still not productive)");
            else if (m == 3) System.out.print(" (First pair becomes productive, has babies)");
            else System.out.print(" (Follows Fibonacci sequence)");
            
            System.out.println();
        }
        System.out.println("=".repeat(70));
    }
    
    // ========== MAIN METHOD ==========
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of months: ");
        int months = input.nextInt();
        
        if (months <= 0) {
            System.out.println("Please enter a positive number of months.");
        } else {
            // Calculate using different methods
            System.out.println("\n=== CALCULATION RESULTS ===");
            
            // Simple recursive (inefficient for large numbers)
            System.out.println("Simple recursive result: " + fibonacci(months) + " pairs");
            
            // Recursive with memoization
            int[] memo = new int[months + 1];
            System.out.println("Recursive with memoization: " + fibonacciMemo(months, memo) + " pairs");
            
            // Iterative
            System.out.println("Iterative result: " + fibonacciIterative(months) + " pairs");
            
            // Display complete table
            displayTable(months);
            
            // Explanation
            explainGrowth(months);
            
            // Show Fibonacci sequence
            System.out.println("\nFibonacci Sequence up to month " + months + ":");
            for (int i = 1; i <= months; i++) {
                System.out.print("F(" + i + ")=" + fibonacciIterative(i));
                if (i < months) System.out.print(", ");
                if (i % 5 == 0) System.out.println();
            }
            
            // Special case: Month 12 from the problem
            if (months >= 12) {
                System.out.println("\n\n=== SPECIAL CASE: MONTH 12 ===");
                System.out.println("From the problem statement:");
                System.out.println("Productive pairs: 55");
                System.out.println("Non-productive pairs: 89");
                System.out.println("Total pairs: 55 + 89 = 144");
                System.out.println("Fibonacci(12) = " + fibonacciIterative(12));
            }
        }
        
        input.close();
    }
}
