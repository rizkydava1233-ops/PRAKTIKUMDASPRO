import java.util.Scanner;
public class arrayAverageScore07 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
       int[] score = new int[10];
        double total = 0;
        double average;
        int passedCount = 0;
        
        // Step 5: Using a loop, create an input to fill in the score array element
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        
        // Step 6: Using a loop, calculate the total number of scores
        for (int i = 0; i < score.length; i++) {
            total += score[i];
            
            // Count students who passed (score > 70)
            if (score[i] > 70) {
                passedCount++;
            }
        }
        
        // Step 7: Calculate the average value by dividing total by the number of elements of score
        average = total / score.length;
        System.out.println("The class average score is " + average);
        
        // Display the number of students who passed
        System.out.println("Number of students who passed (score > 70): " + passedCount);
        
        
        sc.close();
    }
}
