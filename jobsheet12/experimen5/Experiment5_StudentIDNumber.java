package jobsheet12.experimen5;

public class Experiment5_StudentIDNumber {
     static void show(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Number of arguments/parameters: " + a.length);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        show("Programming Fundamentals 2023", 100, 200);
        show("Information Technology", 1, 2, 3, 4, 5);
        show("Informatics");
    }
    
}
