package jobsheet12.TUGAS;
import java.util.Scanner;

public class WeeklyGradesManagement {
    
    // Dynamic arrays untuk menyimpan data
    static int[][] grades;
    static String[] students;
    static int numStudents = 0;
    static int numWeeks = 0;
    static Scanner scanner = new Scanner(System.in);
    
    // Function to initialize the system with user-defined dimensions
    public static void initializeSystem() {
        System.out.println("\n=== SYSTEM INITIALIZATION ===\n");
        
        // Input jumlah siswa
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter number of students: ");
                String input = scanner.nextLine();
                numStudents = Integer.parseInt(input);
                if (numStudents > 0) {
                    validInput = true;
                } else {
                    System.out.println("Number of students must be greater than 0!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        
        // Input jumlah minggu
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter number of weeks: ");
                String input = scanner.nextLine();
                numWeeks = Integer.parseInt(input);
                if (numWeeks > 0) {
                    validInput = true;
                } else {
                    System.out.println("Number of weeks must be greater than 0!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        
        // Initialize arrays
        grades = new int[numStudents][numWeeks];
        students = new String[numStudents];
        
        // Input nama siswa
        System.out.println("\nEnter student names:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }
        
        System.out.println("\n>> System initialized successfully!");
        System.out.println(">> " + numStudents + " students, " + numWeeks + " weeks");
        System.out.println();
    }
    
    // Function to load sample data (5 students, 7 weeks)
    public static void loadSampleData() {
        System.out.println("\n=== LOADING SAMPLE DATA ===\n");
        
        // Set dimensions for sample data
        numStudents = 5;
        numWeeks = 7;
        
        // Initialize arrays
        grades = new int[numStudents][numWeeks];
        students = new String[]{"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        
        // Data sesuai tabel
        int[][] sampleData = {
            {20, 19, 25, 20, 10, 0, 10},  // Sari
            {30, 30, 40, 10, 15, 20, 25}, // Rina
            {5, 0, 20, 25, 10, 5, 45},    // Yani
            {50, 0, 7, 8, 0, 30, 60},     // Dwi
            {15, 10, 16, 15, 10, 10, 5}   // Lusi
        };
        
        // Copy data ke array grades
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numWeeks; j++) {
                grades[i][j] = sampleData[i][j];
            }
        }
        
        System.out.println("Loading data for students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("  " + students[i] + ": ");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n>> Sample data loaded successfully!");
        System.out.println(">> Total: " + numStudents + " students, " + numWeeks + " weeks of data");
    }
    
    // a. Function to input students' grade data
    public static void inputGrades() {
        if (grades == null) {
            System.out.println("\n>> System not initialized! Please initialize first (Option 1).\n");
            return;
        }
        
        System.out.println("\n=== INPUT STUDENT GRADES ===\n");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Input grades for " + students[i] + ":");
            for (int j = 0; j < numWeeks; j++) {
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("  Week " + (j + 1) + ": ");
                        String input = scanner.nextLine();
                        grades[i][j] = Integer.parseInt(input);
                        validInput = true;
                    } catch (Exception e) {
                        System.out.println("  Invalid input! Please enter a number.");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("All grades have been inputted successfully!");
    }
    
    // b. Function to display all student grades
    public static void displayAllGrades() {
        if (grades == null) {
            System.out.println("\n>> System not initialized! Please initialize first (Option 1).\n");
            return;
        }
        
        System.out.println("\n=== ALL STUDENT GRADES ===\n");
        
        // Header
        System.out.print("Student   ");
        for (int i = 1; i <= numWeeks; i++) {
            System.out.print("Week" + i + "  ");
        }
        System.out.println();
        
        // Print separator line
        for (int i = 0; i < 10 + (numWeeks * 7); i++) {
            System.out.print("-");
        }
        System.out.println();
        
        // Data siswa
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10s", students[i]);
            for (int j = 0; j < numWeeks; j++) {
                System.out.printf("%-7d", grades[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // c. Function to find the week with highest total grade
    public static void findHighestWeek() {
        if (grades == null) {
            System.out.println("\n>> System not initialized! Please initialize first (Option 1).\n");
            return;
        }
        
        System.out.println("\n=== WEEK WITH HIGHEST TOTAL GRADE ===\n");
        
        int[] weekTotals = new int[numWeeks];
        
        // Hitung total nilai per minggu
        for (int j = 0; j < numWeeks; j++) {
            for (int i = 0; i < numStudents; i++) {
                weekTotals[j] += grades[i][j];
            }
        }
        
        // Cari minggu dengan total tertinggi
        int highestWeek = 0;
        int highestTotal = weekTotals[0];
        
        for (int j = 1; j < numWeeks; j++) {
            if (weekTotals[j] > highestTotal) {
                highestTotal = weekTotals[j];
                highestWeek = j;
            }
        }
        
        // Tampilkan hasil
        System.out.println("Week totals:");
        for (int j = 0; j < numWeeks; j++) {
            System.out.println("  Week " + (j + 1) + ": " + weekTotals[j]);
        }
        
        System.out.println("\n>> Week with highest total grade: Week " + (highestWeek + 1));
        System.out.println(">> Total grade: " + highestTotal);
    }
    
    // d. Function to find student with highest total grade
    public static void findHighestStudent() {
        if (grades == null) {
            System.out.println("\n>> System not initialized! Please initialize first (Option 1).\n");
            return;
        }
        
        System.out.println("\n=== STUDENT WITH HIGHEST TOTAL GRADE ===\n");
        
        int[] studentTotals = new int[numStudents];
        
        // Hitung total nilai per siswa
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numWeeks; j++) {
                studentTotals[i] += grades[i][j];
            }
        }
        
        // Cari siswa dengan total tertinggi
        int highestStudent = 0;
        int highestTotal = studentTotals[0];
        
        for (int i = 1; i < numStudents; i++) {
            if (studentTotals[i] > highestTotal) {
                highestTotal = studentTotals[i];
                highestStudent = i;
            }
        }
        
        // Tampilkan hasil
        System.out.println("Student totals:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("  " + students[i] + ": " + studentTotals[i]);
        }
        
        System.out.println("\n>> Student with highest total grade: " + students[highestStudent]);
        System.out.println(">> Total grade: " + highestTotal);
        System.out.println("\nWeekly grades for " + students[highestStudent] + ":");
        for (int j = 0; j < numWeeks; j++) {
            System.out.println("  Week " + (j + 1) + ": " + grades[highestStudent][j]);
        }
    }
    
    public static void displayMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Initialize System (Set Students & Weeks)");
        System.out.println("2. Input Student Grades");
        System.out.println("3. Display All Grades");
        System.out.println("4. Find Week with Highest Grade");
        System.out.println("5. Find Student with Highest Grade");
        System.out.println("6. Load Sample Data (5 students, 7 weeks)");
        System.out.println("7. Exit");
        System.out.print("\nChoose menu (1-7): ");
    }
    
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("           WEEKLY GRADES MANAGEMENT SYSTEM");
        System.out.println("           Programming Fundamentals 2023");
        System.out.println("           State Polytechnic of Malang");
        System.out.println("===================================================================");
        System.out.println("\nThis system allows dynamic number of students and weeks!");
        
        boolean running = true;
        
        while (running) {
            displayMenu();
            
            int choice = 0;
            boolean validChoice = false;
            
            while (!validChoice) {
                try {
                    String input = scanner.nextLine();
                    choice = Integer.parseInt(input);
                    validChoice = true;
                } catch (Exception e) {
                    System.out.print("Invalid input! Enter a number (1-7): ");
                }
            }
            
            System.out.println();
            
            switch (choice) {
                case 1:
                    initializeSystem();
                    break;
                case 2:
                    inputGrades();
                    break;
                case 3:
                    displayAllGrades();
                    break;
                case 4:
                    findHighestWeek();
                    break;
                case 5:
                    findHighestStudent();
                    break;
                case 6:
                    loadSampleData();
                    break;
                case 7:
                    System.out.println(">> Thank you for using this program!");
                    System.out.println(">> Program terminated.\n");
                    running = false;
                    break;
                default:
                    System.out.println(">> Invalid choice! Please choose 1-7.");
            }
            
            if (running && choice >= 1 && choice <= 6) {
                System.out.print("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}