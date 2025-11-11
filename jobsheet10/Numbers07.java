package jobsheet10;
public class Numbers07 {
    public static void main(String[] args) {
    int[][] myNumbers = new int[3][];
        
        myNumbers[0] = new int[5];
        
        myNumbers[1] = new int[3];
        
        myNumbers[2] = new int[1];
        
        // Tampilkan panjang setiap baris
        System.out.println("Jumlah baris: " + myNumbers.length);
        System.out.println("Panjang baris ke-1: " + myNumbers[0].length + " kolom");
        System.out.println("Panjang baris ke-2: " + myNumbers[1].length + " kolom");
        System.out.println("Panjang baris ke-3: " + myNumbers[2].length + " kolom");

        
        // Tampilkan isi array menggunakan Arrays.toString()
        System.out.println("\nIsi array myNumbers:");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Baris ke-" + (i+1) + ": " +myNumbers[i].length);
        }
   
    }
}
