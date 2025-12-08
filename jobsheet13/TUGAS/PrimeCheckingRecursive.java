package jobsheet13.TUGAS;

import java.util.Scanner;

public class PrimeCheckingRecursive {
    
    // ========== RECURSIVE PRIME CHECKER ==========
    // Helper method for easier calling
    static boolean isPrime(int n) {
        // Handle special cases
        if (n <= 1) return false;
        if (n <= 3) return true;  // 2 and 3 are prime
        
        // Start recursion with divisor = 2
        return isPrimeRecursive(n, 2);
    }
    
    // Main recursive function
    static boolean isPrimeRecursive(int n, int divisor) {
        // Base case 1: divisor reached n (no divisors found)
        if (divisor >= n) {
            return true;
        }
        
        // Base case 2: n is divisible by divisor (not prime)
        if (n % divisor == 0) {
            return false;
        }
        
        // Optimization: only check up to √n
        if (divisor * divisor > n) {
            return true;
        }
        
        // Recursive case: check next divisor
        return isPrimeRecursive(n, divisor + 1);
    }
    
    // ========== RECURSIVE WITH PRINTING ==========
    static boolean isPrimeWithPrint(int n, int divisor) {
        System.out.println("Checking if " + n + " is divisible by " + divisor);
        
        if (divisor >= n) {
            System.out.println("✓ No divisors found. " + n + " is PRIME");
            return true;
        }
        
        if (n % divisor == 0) {
            System.out.println("✗ " + n + " is divisible by " + divisor + ". NOT PRIME");
            return false;
        }
        
        // Optimization
        if (divisor * divisor > n) {
            System.out.println("✓ Checked up to √" + n + ". " + n + " is PRIME");
            return true;
        }
        
        return isPrimeWithPrint(n, divisor + 1);
    }
    
    // ========== ITERATIVE PRIME CHECKER ==========
    static boolean isPrimeIterative(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    // ========== MAIN METHOD ==========
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int n = input.nextInt();
        
        System.out.println("\n=== PRIME NUMBER CHECK FOR " + n + " ===");
        
        // Special cases
        if (n < 0) {
            System.out.println("Prime numbers are positive integers greater than 1.");
        } else {
            // Recursive check with printing
            System.out.println("\nRecursive check (step by step):");
            if (n <= 1) {
                System.out.println(n + " is NOT PRIME (numbers ≤ 1 are not prime)");
            } else if (n <= 3) {
                System.out.println(n + " is PRIME");
            } else {
                boolean primeRecursive = isPrimeWithPrint(n, 2);
                System.out.println("\nRecursive result: " + n + " is " + 
                    (primeRecursive ? "PRIME" : "NOT PRIME"));
            }
            
            // Simple recursive check
            System.out.println("\nSimple recursive result: " + 
                (isPrime(n) ? "PRIME" : "NOT PRIME"));
            
            // Iterative check
            System.out.println("Iterative result: " + 
                (isPrimeIterative(n) ? "PRIME" : "NOT PRIME"));
            
            // Show divisors if not prime
            if (n > 1 && !isPrime(n)) {
                System.out.print("\nDivisors of " + n + ": 1");
                for (int i = 2; i <= n/2; i++) {
                    if (n % i == 0) {
                        System.out.print(", " + i);
                    }
                }
                System.out.println(", " + n);
            }
        }
        
        // Test multiple numbers
        System.out.println("\n\n=== PRIME NUMBERS FROM 1 TO 30 ===");
        System.out.print("Prime numbers: ");
        for (int i = 1; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        input.close();
    }
}