import java.util.Scanner;

public class arrayAverageScore07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of students (NEW)
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        // Create array based on user input (CHANGED from int[10])
        int[] score = new int[numStudents];
        
        // Variables for passed and failed students (CHANGED)
        double totalPassed = 0;
        double totalFailed = 0;
        int passedCount = 0;
        int failedCount = 0;
        
        // Using a loop, create an input to fill in the score array element
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }
        
        // Using a loop, separate passed and failed students (CHANGED)
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalPassed += score[i];
                passedCount++;
            } else {
                totalFailed += score[i];
                failedCount++;
            }
        }
        
        // Calculate and display average for passed students (NEW)
        if (passedCount > 0) {
            double averagePassed = totalPassed / passedCount;
            System.out.println("The average score of students who passed is " + averagePassed);
        }
        
        // Calculate and display average for failed students (NEW)
        if (failedCount > 0) {
            double averageFailed = totalFailed / failedCount;
            System.out.println("The average score of students who failed is " + averageFailed);
        }
        
        sc.close();
    }
}