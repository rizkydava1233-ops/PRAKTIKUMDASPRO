import java.util.Scanner;

public class DisplayTwoabsen {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int numInput;
    
        System.out.print("Input some number: ");
        numInput = sc.nextInt();
        
       
        for (int i = 2; i <= numInput; i += 2) {
            System.out.print(i + " ");
        }
          
     
        sc.close();

    }

}
