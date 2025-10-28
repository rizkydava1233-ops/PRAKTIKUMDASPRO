package jobsheet8;
import java.util.Scanner;
import java.util.Random;
public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

                // Initialize menu variable
        char menu = 'y';
        
        do {
            // Generate random number between 1-10
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine(); // Used to ignore the newline character
                
                // Check if the guess is correct
                if (answer == number) {
                    System.out.println("Correct! You guessed it right!");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Too small! Try a higher number.");
                    success = false;
                } else {
                    System.out.println("Too large! Try a lower number.");
                    success = false;
                }
                
            } while (!success);
            
            // Ask if user wants to repeat the game
            System.out.print("Do you want to repeat the game (Y/N)? ");
            menu = input.next().charAt(0);
            input.nextLine(); // Used to ignore the newline character
            
        } while (menu == 'Y' || menu == 'y');
        
        // Close Scanner
        input.close();
 
    }
}
