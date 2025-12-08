package jobsheet13.experimen3;

import java.util.Scanner;

public class ProvitRecursiveStudentIDNumber {
    
    // Recursive function to calculate balance after investment period
    static double calculateProfit(double balance, int years) {
        // Base case: if years is 0, return the current balance
        if (years == 0) {
            return balance;
        } else {
            // Calculate balance after one year (11% interest)
            double newBalance = balance * 1.11;
            // Recursive call for remaining years
            return calculateProfit(newBalance, years - 1);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("Input Initial Balance: ");
        double initialBalance = input.nextDouble();
        
        System.out.print("Input Investment Period (years): ");
        int investPeriod = input.nextInt();
        
        // Calculate final balance using recursive function
        double finalBalance = calculateProfit(initialBalance, investPeriod);
        
        // Display result
        System.out.printf("Balance after %d year(s) = $%.2f%n", 
                         investPeriod, finalBalance);
        
        // Display detailed breakdown for verification
        System.out.printf("\nDetailed Calculation:%n");
        System.out.printf("Initial Balance: $%.2f%n", initialBalance);
        System.out.printf("Annual Interest Rate: 11%%%n");
        System.out.printf("Investment Period: %d year(s)%n", investPeriod);
        System.out.printf("Final Balance: $%.2f%n", finalBalance);
        
        input.close();
    }
}
