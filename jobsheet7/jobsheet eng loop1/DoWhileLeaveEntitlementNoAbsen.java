import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leaveEntitlement = 12; 
        int numLeave;
        String confirmation;
        
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = sc.next();
            
            if(confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = sc.nextInt();
                
                if(numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You dont have enough leave entitlement. You have " + leaveEntitlement + " day(s) remaining.");
                    // No break - loop continues and user can try again
                }
            }
            
        } while(leaveEntitlement > 0);
       


        sc.close();       
    }
    
}
