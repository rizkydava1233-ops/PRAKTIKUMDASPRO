import java.util.Scanner;
public class arrayValue07 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        // Create an array of integer type with the name finalScore, with a capacity of 10 elements
        int[] finalScore = new int[10];
        
        // Using a loop, create an input to fill in the finalScore array element
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = sc.nextInt();
        }
        
        // Display all students and mark which one passed, and which did not
        System.out.println("\nFinal Results:");
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + i + " with score " + finalScore[i] + " - Passed!");
            } else {
                System.out.println("Student " + i + " with score " + finalScore[i] + " - Did not pass");
            }
        }

        
        sc.close();
    }
    
}
