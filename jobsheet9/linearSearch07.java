public class linearSearch07 {
    public static void main(String[] args) {
        // Initialize array with given values
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        
        // The key value we want to search for
        int key = 20;
        
        // Variable to store the result (index position)
        int result = 0;
        
        // Linear search algorithm
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;  // Exit loop when found
            }
        }
        
        // Display the result
        System.out.println("The key in the array is located at index position " + result);
    }
}