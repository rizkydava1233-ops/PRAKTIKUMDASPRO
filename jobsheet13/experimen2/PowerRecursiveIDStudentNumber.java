package jobsheet13.experimen2;

import java.util.Scanner;

public class PowerRecursiveIDStudentNumber {

    // Modified recursive function to calculate power and print the series
    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(base + "x");
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
        
        System.out.print("Calculation series: ");
        int result = calculatePower(base, power);
        System.out.println(" = " + result);
        
        input.close();
    }
}