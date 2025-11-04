package Assignment;

import java.util.Scanner;

public class CafeOrderManagement07 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================================");
        System.out.println("CAFE ORDER MANAGEMENT SYSTEM");
        System.out.println("==================================================");
        
        // Input: Enter the number of orders
        int numOrders = 0;
        while (true) {
            try {
                System.out.print("\nEnter the number of orders: ");
                numOrders = Integer.parseInt(scanner.nextLine());
                if (numOrders <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        
        // Initialize arrays to store order data
        String[] orderNames = new String[numOrders];
        double[] orderPrices = new double[numOrders];
        
        // Input: Enter order details (name and price)
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ENTER ORDER DETAILS");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < numOrders; i++) {
            System.out.println("\nOrder " + (i + 1) + ":");
            
            // Input order name
            System.out.print("  Food/Drink name: ");
            orderNames[i] = scanner.nextLine();
            
            // Input order price with validation
            while (true) {
                try {
                    System.out.print("  Price: $");
                    orderPrices[i] = Double.parseDouble(scanner.nextLine());
                    if (orderPrices[i] < 0) {
                        System.out.println("  Price cannot be negative. Please try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("  Invalid input. Please enter a valid price.");
                }
            }
        }
        
        // Process: Calculate total cost
        double totalCost = 0;
        for (int i = 0; i < numOrders; i++) {
            totalCost += orderPrices[i];
        }
        
        // Output: Display order list and total cost
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ORDER SUMMARY");
        System.out.println("=".repeat(50));
        
        System.out.println("\nList of Orders:");
        System.out.println("-".repeat(50));
        System.out.printf("%-5s %-30s %s%n", "No.", "Item", "Price");
        System.out.println("-".repeat(50));
        
        for (int i = 0; i < numOrders; i++) {
            System.out.printf("%-5d %-30s $%.2f%n", 
                (i + 1), orderNames[i], orderPrices[i]);
        }
        
        System.out.println("-".repeat(50));
        System.out.printf("%-35s $%.2f%n", "TOTAL COST:", totalCost);
        System.out.println("=".repeat(50));
        
        scanner.close();
    }
    
}
