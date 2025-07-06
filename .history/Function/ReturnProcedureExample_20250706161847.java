package Function;

/**
 * ReturnProcedureExample.java
 * Demonstrates the use of procedures (methods) with return values in Java.
 */
public class ReturnProcedureExample {
    /**
     * A procedure that calculates the sum of two numbers and returns the result.
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    
    /**
     * A procedure that finds the maximum of three numbers and returns it.
     * @param x the first number
     * @param y the second number
     * @param z the third number
     * @return the maximum value among x, y, and z
     */
    public static double findMaximum(double x, double y, double z) {
        double max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    
    /**
     * Main method to test the procedures with return values.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Example 1: Calling a procedure that returns the sum of two numbers:");
        int sum = calculateSum(10, 20);
        System.out.println("Sum of 10 and 20: " + sum);
        
        System.out.println("\nExample 2: Calling a procedure that returns the maximum of three numbers:");
        double max = findMaximum(15.5, 7.8, 22.3);
        System.out.println("Maximum of 15.5, 7.8, and 22.3: " + max);
    }
}
