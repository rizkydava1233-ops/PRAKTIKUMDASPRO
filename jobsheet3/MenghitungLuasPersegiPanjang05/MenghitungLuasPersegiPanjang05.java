package MenghitungLuasPersegiPanjang05;


import java.util.Scanner;

public class MenghitungLuasPersegiPanjang05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        int panjang, lebar, luas;

        
        System.out.print("Masukkan Panjang: ");
        panjang = input.nextInt();
        
        System.out.print("Masukkan Lebar: ");
        lebar = input.nextInt();

   
        luas = panjang * lebar;

  
        System.out.println("Luas Persegi Panjang = " + luas);

        input.close(); 
    }
}


    

    

