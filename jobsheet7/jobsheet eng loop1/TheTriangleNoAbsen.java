import java.util.Scanner;
public class TheTriangleNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int numInput;
        
        System.out.print("Input some number: ");
        numInput = sc.nextInt();
        
        // Modified to create inverted triangle pattern
        for (int i = numInput; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
       
        sc.close();
    }
    
}
