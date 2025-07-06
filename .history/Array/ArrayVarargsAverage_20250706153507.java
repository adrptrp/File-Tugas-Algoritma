/**
 * ArrayVarargsAverage.java
 * Demonstrates the use of variable-length argument lists to calculate the average of numbers.
 */
public class ArrayVarargsAverage {
    /**
     * Calculates the average of a variable number of double values.
     * @param numbers a variable-length argument list of double values
     * @return the average of the provided numbers
     */
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total / numbers.length;
    }
    
    /**
     * Main method to test the calculateAverage method with different numbers of arguments.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        double num1 = 15.5;
        double num2 = 25.5;
        double num3 = 35.5;
        double num4 = 45.5;
        double num5 = 55.5;
        
        System.out.printf("Numbers: %.1f, %.1f, %.1f, %.1f, %.1f%n%n", 
            num1, num2, num3, num4, num5);
        
        System.out.printf("Average of first 2 numbers: %.1f%n", 
            calculateAverage(num1, num2));
        System.out.printf("Average of first 3 numbers: %.1f%n", 
            calculateAverage(num1, num2, num3));
        System.out.printf("Average of first 4 numbers: %.1f%n", 
            calculateAverage(num1, num2, num3, num4));
        System.out.printf("Average of all 5 numbers: %.1f%n", 
            calculateAverage(num1, num2, num3, num4, num5));
    }
}
