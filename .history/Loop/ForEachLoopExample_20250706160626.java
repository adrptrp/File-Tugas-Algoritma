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
        
        // Example 1: Iterating over an array
        System.out.println("Example 1: Using a for-each loop to iterate over an array:");
        int index = 0;
        for (int num : numbers) {
            System.out.println("Element at index " + index + ": " + num);
            index++;
        }
        
        // Example 2: Summing elements of an array
        int sum = 0;
        System.out.println("\nExample 2: Using a for-each loop to sum array elements:");
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
        
        // Example 3: Using for-each with a 2D array
        System.out.println("\nExample 3: Using for-each loop with a 2D array:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
