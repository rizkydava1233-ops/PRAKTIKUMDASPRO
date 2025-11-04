package Assignment;

import java.util.Scanner;

public class CafeMenuSearch07 {
    public static int linearSearch(String[] menu, String searchItem) {
        for (int i = 0; i < menu.length; i++) {
            // Case-insensitive comparison
            if (menu[i].equalsIgnoreCase(searchItem)) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Predefined menu items
        String[] menu = {
            "Fried Rice", 
            "Fried Noodles", 
            "Toasted Bread", 
            "Fried Potatoes", 
            "Teh Tarik", 
            "Cappuccino", 
            "Chocolate Ice"
        };
        
        System.out.println("==================================================");
        System.out.println("CAFE MENU SEARCH SYSTEM");
        System.out.println("==================================================");
        
        // Display available menu
        System.out.println("\nAvailable Menu Items:");
        System.out.println("-".repeat(50));
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("-".repeat(50));
        
        // Allow continuous searching
        while (true) {
            // Input: Get item to search
            System.out.print("\nEnter the food/drink item to search for (or 'exit' to quit): ");
            String searchItem = scanner.nextLine();
            
            // Exit condition
            if (searchItem.equalsIgnoreCase("exit")) {
                System.out.println("\nThank you for using the Cafe Menu Search System!");
                System.out.println("==================================================");
                break;
            }
            
            // Process: Perform linear search
            int result = linearSearch(menu, searchItem);
            
            // Output: Display search results
            System.out.println("\n" + "=".repeat(50));
            System.out.println("SEARCH RESULT");
            System.out.println("=".repeat(50));
            
            if (result != -1) {
                // Item found
                System.out.println("✓ ITEM FOUND!");
                System.out.println("\"" + menu[result] + "\" is available on our menu.");
                System.out.println("Position in menu: " + (result + 1));
            } else {
                // Item not found
                System.out.println("✗ ITEM NOT FOUND!");
                System.out.println("\"" + searchItem + "\" is not available on our menu.");
                System.out.println("Please check the menu list and try again.");
            }
            System.out.println("=".repeat(50));
        }
        
        scanner.close();
    }
}
