package jobsheet12.TUGAS;
import java.util.Scanner;

public class CubeStudentIDNumber {
    
    // Function to calculate area of rectangle
    static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }
    
    // Function to calculate volume of cube/box
    static int calculateVolume(int length, int width, int height) {
        int volume = calculateArea(length, width) * height;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Cube Area and Volume Calculator ===");
        
        System.out.print("Input length = ");
        int length = input.nextInt();
        
        System.out.print("Input width = ");
        int width = input.nextInt();
        
        System.out.print("Input height = ");
        int height = input.nextInt();
        
        int area = calculateArea(length, width);
        System.out.println("\nArea of the rectangle = " + area);
        
        int volume = calculateVolume(length, width, height);
        System.out.println("Volume of the cube = " + volume);
        
        input.close();
    }
}