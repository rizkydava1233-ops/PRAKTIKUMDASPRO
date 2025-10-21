import java.util.Scanner;

public class DisplayTwoabsen {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        // 5. Declare int variable named numInput
        int numInput;
        
        // 6. Add the following code to input from user
        System.out.print("Input some number: ");
        numInput = sc.nextInt();
        
        // 7. Add this following FOR loop
        for (int i = 1; i <= numInput; i++) {
            if (i % 2 == 0) {
                System.out.println("2 multiple: " + i);
            }
        }

        sc.close();
    }

}
