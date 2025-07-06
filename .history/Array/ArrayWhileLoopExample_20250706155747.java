package Array;

/**
 * ArrayWhileLoopExample.java
 * Demonstrates the use of a while loop in Java.
 */
public class ArrayWhileLoopExample {
    /**
     * Main method to test the while loop with an array of numbers.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 0;
        
        System.out.println("Using a while loop to iterate over an array:");
        while (index < numbers.length) {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index++;
        }
    }
}
