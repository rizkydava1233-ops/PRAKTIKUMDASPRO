package jpbsheet12.experimen4;

import java.util.Scanner;

public class ExpressingGratitude_StudentIDNumber {
     // Function from Greetings class - returns recipient's name
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    
    // Function from Gratitude class - prints thank you message with name
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" +
                         "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    
    // NEW FUNCTION - prints additional greetings
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }
    
    // Main function
    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings("May the force be with you! Wishing you health and happiness always!");
    }
    
}
