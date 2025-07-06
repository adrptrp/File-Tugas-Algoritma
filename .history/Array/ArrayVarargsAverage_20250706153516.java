package Array;

/**
 * ArrayVarargsAverage.java
 * Demonstrates the use of variable-length argument lists (varargs) in Java.
 * This class provides a method to calculate the average of a variable number of double values.
 */
public class ArrayVarargsAverage {
    /**
     * Calculates the average of a variable number of double values.
     * @param numbers a variable-length argument list of double values
     * @return the average of the provided numbers
     */
    public static double average(double... numbers) {
        double total = 0.0; // initialize total

        // calculate total using the enhanced for statement
        for (double d : numbers) {
            total += d;
        }

        return total / numbers.length;
    }

    /**
     * Main method to test the average method with different numbers of arguments.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f%n", d1);
        System.out.printf("d2 = %.1f%n", d2);
        System.out.printf("d3 = %.1f%n", d3);
        System.out.printf("d4 = %.1f%n%n", d4);

        System.out.printf("Average of d1 and d2 is %.1f%n", average(d1, d2));
        System.out.printf("Average of d1, d2, and d3 is %.1f%n", average(d1, d2, d3));
        System.out.printf("Average of d1, d2, d3, and d4 is %.1f%n", average(d1, d2, d3, d4));
    }
}
