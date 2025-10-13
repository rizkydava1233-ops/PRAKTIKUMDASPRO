package CicilanMotor;
import java.util.Scanner;
public class CicilanMotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaMotor, uangMuka, sisa, bunga, cicilan;
        int bulan;

        System.out.print("Masukkan harga motor (Rp): ");
        hargaMotor = sc.nextDouble();

        System.out.print("Masukkan uang muka (Rp): ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        bulan = sc.nextInt();

        sisa = hargaMotor - uangMuka;

        bunga = sisa * 0.01 * bulan;

        cicilan = (sisa + bunga) / bulan;

        System.out.println("=======================================");
        System.out.println("Harga Motor      : Rp " + hargaMotor);
        System.out.println("Uang Muka        : Rp " + uangMuka);
        System.out.println("Sisa Cicilan     : Rp " + sisa);
        System.out.println("Total Bunga      : Rp " + bunga);
        System.out.println("Cicilan per Bulan: Rp " + cicilan);

        sc.close();
    }
    
}
