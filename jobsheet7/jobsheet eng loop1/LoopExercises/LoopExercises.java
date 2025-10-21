package LoopExercises;

import java.util.Scanner;

public class LoopExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== LOOP PRACTICE EXERCISES ===");
            System.out.println("1. Multiples of 5 (5 10 15 20 ... 50)");
            System.out.println("2. Countdown from 10 to 1");
            System.out.println("3. Perfect Squares (1 4 9 16 ... 100)");
            System.out.println("4. Calculate Factorial (n!)");
            System.out.println("0. Exit");
            System.out.print("Choose exercise (0-4): ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    // Exercise 1: Multiples of 5
                    System.out.print("\nInput batas akhir (default 50): ");
                    int limit1 = sc.nextInt();
                    
                    System.out.println("Kelipatan 5 dari 5 sampai " + limit1 + ":");
                    for (int i = 5; i <= limit1; i += 5) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    // Exercise 2: Countdown
                    System.out.print("\nInput angka awal countdown (default 10): ");
                    int start = sc.nextInt();
                    
                    System.out.println("Countdown dari " + start + " sampai 1:");
                    for (int i = start; i >= 1; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    // Exercise 3: Perfect Squares
                    System.out.print("\nInput sampai angka berapa (default 10): ");
                    int limit3 = sc.nextInt();
                    
                    System.out.println("Kuadrat sempurna dari 1 sampai " + limit3 + ":");
                    for (int i = 1; i <= limit3; i++) {
                        System.out.print((i * i) + " ");
                    }
                    System.out.println();
                    break;
                    
                case 4:
                    // Exercise 4: Factorial
                    System.out.print("\nInput nilai n untuk faktorial: ");
                    int n = sc.nextInt();
                    
                    if (n < 0) {
                        System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif!");
                    } else {
                        long factorial = 1;
                        
                        System.out.print(n + "! = ");
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                            System.out.print(i);
                            if (i < n) {
                                System.out.print(" x ");
                            }
                        }
                        System.out.println(" = " + factorial);
                    }
                    break;
                    
                case 0:
                    System.out.println("\nProgram terminated. Goodbye!");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice! Please choose 0-4.");
            }
            
        } while(choice != 0);
        
        sc.close();
    }
}
