package jpbsheet12.TUGAS;
import java.util.Scanner;

public class weeklygrade {
    
    // Function to calculate area
    static int calculateArea(int length, int width) {
        return length * width;
    }
    
    // Function to calculate volume
    static int calculateVolume(int length, int width, int height) {
        return calculateArea(length, width) * height;
    }
    
    // a. Function to input students' grade data
    static void inputGrades(int[][] grades, String[] students, Scanner input) {
        System.out.println("\n=== Input Student Grades ===");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nInput grades for " + students[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("  Week " + (j + 1) + ": ");
                while (!input.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a number: ");
                    input.next();
                }
                grades[i][j] = input.nextInt();
            }
        }
        System.out.println("\nGrades input completed!");
    }
    
    // b. Function to display all student grades from first week to seventh week
    static void displayAllGrades(int[][] grades, String[] students) {
        System.out.println("\n=== Student Grades Report ===");
        System.out.printf("%-10s", "Student");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Week %-4d", i);
        }
        System.out.println();
        System.out.println("=".repeat(65));
        
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-10s", students[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-9d", grades[i][j]);
            }
            System.out.println();
        }
    }
    
    // c. Function to find the week that has the highest grade from all students
    static void findHighestWeek(int[][] grades, String[] students) {
        int maxGrade = grades[0][0];
        int maxWeek = 1;
        String studentName = students[0];
        
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                    maxWeek = j + 1;
                    studentName = students[i];
                }
            }
        }
        
        System.out.println("\n=== Week with Highest Grade ===");
        System.out.println("Week " + maxWeek + " has the highest grade: " + maxGrade);
        System.out.println("Achieved by: " + studentName);
    }
    
    // d. Function to find the student with the highest grade
    static void findTopStudent(int[][] grades, String[] students) {
        int[] totalGrades = new int[students.length];
        
        // Calculate total grades for each student
        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += grades[i][j];
            }
            totalGrades[i] = sum;
        }
        
        // Find student with highest total
        int maxTotal = totalGrades[0];
        int topStudentIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (totalGrades[i] > maxTotal) {
                maxTotal = totalGrades[i];
                topStudentIndex = i;
            }
        }
        
        // Display top student information
        System.out.println("\n=== Top Student ===");
        System.out.println("Student Name: " + students[topStudentIndex]);
        System.out.println("Total Grade: " + maxTotal);
        System.out.println("\nGrade Information for Each Week:");
        for (int j = 0; j < 7; j++) {
            System.out.println("  Week " + (j + 1) + ": " + grades[topStudentIndex][j]);
        }
        System.out.printf("  Average: %.2f\n", (maxTotal / 7.0));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initialize student names
        String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        
        // Initialize 2D array with predefined grades data
        int[][] grades = {
            {20, 19, 25, 20, 10, 0, 10},   // Sari
            {30, 30, 40, 10, 15, 20, 25},  // Rina
            {5, 0, 20, 25, 10, 5, 45},     // Yani
            {50, 0, 7, 8, 0, 30, 60},      // Dwi
            {15, 10, 16, 15, 10, 10, 5}    // Lusi
        };
        
        // Menu system
        int choice = 0;
        do {
            System.out.println("\n\n====================================");
            System.out.println("   STUDENT GRADE MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Input New Grades");
            System.out.println("2. Display All Grades");
            System.out.println("3. Find Week with Highest Grade");
            System.out.println("4. Find Top Student");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            
            // Validate input
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number (1-5): ");
                input.next(); // Clear invalid input
            }
            choice = input.nextInt();
            input.nextLine(); // Clear the newline character
            
            switch (choice) {
                case 1:
                    inputGrades(grades, students, input);
                    break;
                case 2:
                    displayAllGrades(grades, students);
                    break;
                case 3:
                    findHighestWeek(grades, students);
                    break;
                case 4:
                    findTopStudent(grades, students);
                    break;
                case 5:
                    System.out.println("\nThank you for using the program!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1-5.");
            }
        } while (choice != 5);
        
        input.close();
    }
}