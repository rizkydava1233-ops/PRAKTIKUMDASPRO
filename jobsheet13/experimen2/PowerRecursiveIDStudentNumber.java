package jobsheet13.experimen2;

import java.util.Scanner;

public class PowerRecursiveIDStudentNumber {

    // Recursive function to calculate power
    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return base * calculatePower(base, pow - 1);
        }
    }

    // Main method to get input and display result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        
        System.out.print("Input Power Number: ");
        int power = input.nextInt();
        
        int result = calculatePower(base, power);
        System.out.println("Result of " + base + " power " + power + " = " + result);
        
        input.close();
    }
}