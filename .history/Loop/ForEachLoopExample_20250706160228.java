package Loop;

/**
 * ForEachLoopExample.java
 * Demonstrates the use of a for-each loop (enhanced for loop) in Java.
 */
public class ForEachLoopExample {
    /**
     * Main method to test the for-each loop with an array of numbers.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Using a for-each loop to iterate over an array:");
        int index = 0;
        for (int num : numbers) {
            System.out.println("Element at index " + index + ": " + num);
            index++;
        }
    }
}
