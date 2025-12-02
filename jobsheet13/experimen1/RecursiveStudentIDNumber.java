package jobsheet13.experimen1;

public class RecursiveStudentIDNumber {
    
    // 2. Recursive function to calculate factorial
    static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
    
    // 3. Iterative function to calculate factorial
    static int factorialIterative(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
    
    // 4. Main function to call both recursive and iterative functions
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("        FACTORIAL CALCULATION PROGRAM");
        System.out.println("        Recursive vs Iterative Approach");
        System.out.println("===================================================================\n");
        
        // Test with value 5
        int number = 5;
        
        System.out.println("Hello world!!!");
        System.out.println("\nCalculating factorial of " + number + ":\n");
        
        // Call recursive function
        int resultRecursive = factorialRecursive(number);
        System.out.println("Recursive Result: " + number + "! = " + resultRecursive);
        
        // Call iterative function
        int resultIterative = factorialIterative(number);
        System.out.println("Iterative Result: " + number + "! = " + resultIterative);
        
        System.out.println("\n" + "=".repeat(67));
        
        // 6. Demonstrate how recursive function works step by step
        System.out.println("\nHow factorialRecursive(5) works:\n");
        System.out.println("Step 1: 5 * factorialRecursive(4)");
        System.out.println("Step 2:     4 * factorialRecursive(3)");
        System.out.println("Step 3:         3 * factorialRecursive(2)");
        System.out.println("Step 4:             2 * factorialRecursive(1)");
        System.out.println("Step 5:                 return 1");
        System.out.println("\nReturning (in reverse):");
        System.out.println("        return 2 * 1 = 2");
        System.out.println("    return 3 * 2 = 6");
        System.out.println("return 4 * 6 = 24");
        System.out.println("return 5 * 24 = 120");
        
        System.out.println("\n" + "=".repeat(67));
        
        // Additional test with different values
        System.out.println("\nAdditional Tests:\n");
        
        int[] testValues = {1, 3, 6, 7, 10};
        
        System.out.println("Number | Recursive | Iterative");
        System.out.println("-------|-----------|----------");
        
        for (int val : testValues) {
            int rec = factorialRecursive(val);
            int iter = factorialIterative(val);
            System.out.printf("  %-5d|  %-9d|  %-9d\n", val, rec, iter);
        }
        
        System.out.println("\n" + "=".repeat(67));
        System.out.println("\nProgram finished successfully!");
    }
}