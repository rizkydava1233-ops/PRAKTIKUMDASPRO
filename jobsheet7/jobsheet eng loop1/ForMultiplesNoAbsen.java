import java.util.Scanner;

public class ForMultiplesNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int multiple, sum = 0, counter = 0;      
        System.out.print("Enter the multiple value: ");
        multiple = sc.nextInt();
    
        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
        }
        
        System.out.println("The sum of multiples of " + multiple + " from 1 to 50 is: " + sum);
        System.out.println("The counter of multiples of " + multiple + " from 1 to 50 is: " + counter);

        sc.close();
            
    
    }
}
