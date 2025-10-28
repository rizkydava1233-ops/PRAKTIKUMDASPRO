package jobsheet8;

import java.util.Scanner;
public class NestedLoopStudentID {
     public static void main(String[] args) {
        // Declaration for Scanner named scanner and 2D array named temps
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        // Input temperature data for each city and day
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        
        // Display temperature data
        System.out.println("\n=== Temperature Data Display ===\n");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
        
        // Close Scanner
        scanner.close();
    }
    
}
