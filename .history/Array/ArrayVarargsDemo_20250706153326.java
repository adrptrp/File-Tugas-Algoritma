package Array;

/**
 * ArrayVarargsDemo.java
 * Demonstrates the use of variable-length argument lists (varargs) in Java.
 * This class provides a method to find the maximum value among a variable number of double values.
 */
public class ArrayVarargsDemo {
    /**
     * Finds the maximum value among a variable number of double values.
     * @param numbers a variable-length argument list of double values
     * @return the maximum value among the provided numbers
     */
    public static double findMax(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Main method to test the findMax method with different numbers of arguments.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 10.0;
        double num3 = 3.7;
        double num4 = 8.2;
        double num5 = 12.9;

        System.out.printf("num1 = %.1f%n", num1);
        System.out.printf("num2 = %.1f%n", num2);
        System.out.printf("num3 = %.1f%n", num3);
        System.out.printf("num4 = %.1f%n", num4);
        System.out.printf("num5 = %.1f%n%n", num5);

        System.out.printf("Maximum of num1 and num2 is %.1f%n", findMax(num1, num2));
        System.out.printf("Maximum of num1, num2, and num3 is %.1f%n", findMax(num1, num2, num3));
        System.out.printf("Maximum of num1, num2, num3, num4, and num5 is %.1f%n", findMax(num1, num2, num3, num4, num5));
    }
}
