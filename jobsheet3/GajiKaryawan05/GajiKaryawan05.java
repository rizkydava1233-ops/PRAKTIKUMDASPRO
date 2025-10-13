package GajiKaryawan05;

import java.util.Scanner;
public class GajiKaryawan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=sc.nextInt();
        bonus= 0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-0.1*gajiPokok;

        System.out.println("Bonus Bulanan anda adalah Rp. "+(int)bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+(int)totGaji);

        









        sc.close();

        
    }
    
}
