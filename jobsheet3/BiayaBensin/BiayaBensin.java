package BiayaBensin;
import java.util.Scanner;
public class BiayaBensin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jarak, liter, biaya;
        double konsumsi = 2.0;
        double hargaBensin = 10000;

        System.out.print("Masukkan jarak perjalanan (km): ");
        jarak = sc.nextDouble();
        liter = jarak / konsumsi;   
        biaya = liter * hargaBensin;

      
        System.out.println("==================================");
        System.out.println("Jarak Perjalanan : " + jarak + " km");
        System.out.println("Kebutuhan Bensin : " + liter + " liter");
        System.out.println("Total Biaya      : Rp. " + biaya);

        sc.close();
        
    }
    
}
