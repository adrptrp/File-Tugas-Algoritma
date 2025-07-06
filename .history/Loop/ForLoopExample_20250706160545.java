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
        
        // Example 1: Iterating over an array
        System.out.println("Example 1: Using a traditional for loop to iterate over an array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Example 2: Summing elements of an array
        int sum = 0;
        System.out.println("\nExample 2: Using a traditional for loop to sum array elements:");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
        
        // Example 3: Nested for loop to create a multiplication table
        System.out.println("\nExample 3: Using nested for loops for a multiplication table (1-5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
