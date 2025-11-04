package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeManager07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("==================================================");
        System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("==================================================");
        
        // Enter the number of students
        int numStudents = 0;
        while (true) {
            try {
                System.out.print("\nEnter the number of students: ");
                numStudents = Integer.parseInt(sc.nextLine());
                if (numStudents <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        
        // Enter grades for each student
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("\nEnter grades for " + numStudents + " students:");
        
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                try {
                    System.out.print("Student " + (i + 1) + ": ");
                    int grade = Integer.parseInt(sc.nextLine());
                    if (grade < 0 || grade > 100) {
                        System.out.println("Please enter a grade between 0 and 100.");
                        continue;
                    }
                    grades.add(grade);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }
        
        // Calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        
        // Find highest and lowest grades
        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);
        
        // Display results
        System.out.println("\n==================================================");
        System.out.println("GRADE SUMMARY");
        System.out.println("==================================================");
        
        System.out.println("\nTotal number of students: " + numStudents);
        System.out.printf("Average grade: %.2f%n", average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        System.out.println("\nAll grades entered:");
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("  Student " + (i + 1) + ": " + grades.get(i));
        }
        
        System.out.println("\n==================================================");
        
        sc.close();
    }
}