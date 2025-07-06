public class MethodDemo {
    // Instance variable
    private final double pi = 3.14159;

    // Method to calculate the area of a circle given radius
    public double calculateCircleArea(double radius) {
        if (radius < 0) {
            return -1.0; // Return -1 for invalid input
        }
        return pi * radius * radius;
    }

    // Method to check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to concatenate strings with a separator
    public String joinStrings(String[] strings, String separator) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            result.append(separator).append(strings[i]);
        }
        return result.toString();
    }

    // Static method to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method with no return value to print a greeting
    public void printGreeting(String name) {
        System.out.println("Welcome, " + name + "! Nice to meet you!");
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();

        // Test calculateCircleArea
        double radius = 5.0;
        double area = demo.calculateCircleArea(radius);
        System.out.println("Area of circle with radius " + radius + " is: " + area);

        // Test isEven
        int testNumber = 8;
        System.out.println("Is " + testNumber + " even? " + demo.isEven(testNumber));

        // Test joinStrings
        String[] words = {"Hello", "World", "Java"};
        String joined = demo.joinStrings(words, " - ");
        System.out.println("Joined strings: " + joined);

        // Test findMax
        int max = findMax(10, 5, 8);
        System.out.println("Maximum of 10, 5, and 8 is: " + max);

        // Test printGreeting
        demo.printGreeting("User");
    }
}
