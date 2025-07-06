package Function;

/**
 * AdvancedProcedureExample.java
 * Demonstrates advanced use of procedures (methods) with multiple parameters and method overloading in Java.
 */
public class AdvancedProcedureExample {
    /**
     * A procedure to calculate the area of a rectangle.
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area of the rectangle
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    /**
     * Overloaded procedure to calculate the area of a circle.
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    /**
     * A procedure to calculate the volume of a rectangular prism.
     * @param length the length of the prism
     * @param width the width of the prism
     * @param height the height of the prism
     * @return the volume of the rectangular prism
     */
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    /**
     * Main method to test the advanced procedures.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Example 1: Calculating the area of a rectangle (length=5, width=3):");
        double rectangleArea = calculateArea(5.0, 3.0);
        System.out.println("Area of rectangle: " + rectangleArea);
        
        System.out.println("\nExample 2: Calculating the area of a circle (radius=4):");
        double circleArea = calculateArea(4.0);
        System.out.println("Area of circle: " + circleArea);
        
        System.out.println("\nExample 3: Calculating the volume of a rectangular prism (length=5, width=3, height=2):");
        double volume = calculateVolume(5.0, 3.0, 2.0);
        System.out.println("Volume of rectangular prism: " + volume);
    }
}
