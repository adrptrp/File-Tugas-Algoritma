package Loop;

/**
 * DoWhileLoopExample.java
 * Demonstrates the use of a do-while loop in Java.
 */
public class DoWhileLoopExample {
    /**
     * Main method to test the do-while loop with an array of numbers.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 0;
        
        System.out.println("Using a do-while loop to iterate over an array:");
        do {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index++;
        } while (index < numbers.length);
    }
}
