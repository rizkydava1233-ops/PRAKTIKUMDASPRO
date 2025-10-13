package MenghitungTotalBayar05;
import java.util.Scanner;

public class MenghitungTotalBayar05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.println("Masukan harga Rp. ");
        harga=sc.nextDouble();
        potongan=diskon*harga;
        jml_bayar=harga-potongan;


        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);

        sc.close();
    }

    
}
