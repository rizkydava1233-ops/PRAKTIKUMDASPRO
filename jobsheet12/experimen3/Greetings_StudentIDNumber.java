package jobsheet12.experimen3;
import java.util.Scanner;


public class Greetings_StudentIDNumber {
     public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " May the force be with you!");
    }
    
}
