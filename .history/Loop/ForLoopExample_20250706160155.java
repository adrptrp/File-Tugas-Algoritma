package Loop;

/**
 * ForLoopExample.java
 * Demonstrates the use of a traditional for loop in Java.
 */
public class ForLoopExample {
    /**
     * Main method to test the for loop with an array of numbers.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Using a traditional for loop to iterate over an array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
