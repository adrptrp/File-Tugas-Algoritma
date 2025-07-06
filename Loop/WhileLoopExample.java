package Loop;

/**
 * WhileLoopExample.java
 * Demonstrates the use of a while loop in Java.
 */
public class WhileLoopExample {
    /**
     * Main method to test the while loop with an array of numbers.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 0;
        
        // Example 1: Iterating over an array
        System.out.println("Example 1: Using a while loop to iterate over an array:");
        while (index < numbers.length) {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index++;
        }
        
        // Example 2: Summing elements of an array
        int sum = 0;
        index = 0;
        System.out.println("\nExample 2: Using a while loop to sum array elements:");
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        System.out.println("Sum of array elements: " + sum);
        
        // Example 3: Nested while loop to create a pattern
        System.out.println("\nExample 3: Using nested while loops to print a triangle pattern:");
        int rows = 5;
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
