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
        
        // Example 1: Iterating over an array
        System.out.println("Example 1: Using a do-while loop to iterate over an array:");
        do {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index++;
        } while (index < numbers.length);
        
        // Example 2: Summing elements of an array
        int sum = 0;
        index = 0;
        System.out.println("\nExample 2: Using a do-while loop to sum array elements:");
        do {
            sum += numbers[index];
            index++;
        } while (index < numbers.length);
        System.out.println("Sum of array elements: " + sum);
        
        // Example 3: Nested do-while loop to create a reverse triangle pattern
        System.out.println("\nExample 3: Using nested do-while loops to print a reverse triangle pattern:");
        int rows = 5;
        int i = rows;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i--;
        } while (i >= 1);
    }
}
