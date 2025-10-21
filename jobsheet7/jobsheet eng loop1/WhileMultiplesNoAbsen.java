import java.util.Scanner;
public class WhileMultiplesNoAbsen {
     public static void main(String[] args) {
        // 1. Create int variables named multiple, sum, and counter
        // Initialize variable sum and counter with 0
        int multiple, sum = 0, counter = 0;
        double average = 0;  // Variable to calculate the average
        
        // 2. Get the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the multiple value: ");
        multiple = input.nextInt();
        
        // 3. Create the FOR loop with IF condition to evaluate the multiples number
        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
        }
        
        // 4. Display the sum and counter of multiples number in range from 1 to 50
        System.out.println("The sum of multiples of " + multiple + " from 1 to 50 is: " + sum);
        System.out.println("The counter of multiples of " + multiple + " from 1 to 50 is: " + counter);
        
        // Calculate and display the average
        if (counter > 0) {
            average = (double) sum / counter;
            System.out.println("The average of multiples of " + multiple + " from 1 to 50 is: " + average);
        } else {
            System.out.println("No multiples found in the range 1 to 50.");
        }
        
        input.close();
     }
}
