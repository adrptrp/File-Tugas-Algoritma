package Function;

/**
 * BasicProcedureExample.java
 * Demonstrates the use of basic procedures (methods) in Java.
 */
public class BasicProcedureExample {
    /**
     * A simple procedure (method) that prints a greeting message.
     */
    public static void printGreeting() {
        System.out.println("Hello, welcome to Java programming!");
    }
    
    /**
     * A procedure that takes a name as a parameter and prints a personalized greeting.
     * @param name the name of the person to greet
     */
    public static void printPersonalizedGreeting(String name) {
        System.out.println("Hello, " + name + "! Nice to meet you!");
    }
    
    /**
     * Main method to test the procedures.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Example 1: Calling a basic procedure:");
        printGreeting();
        
        System.out.println("\nExample 2: Calling a procedure with a parameter:");
        printPersonalizedGreeting("Adrian");
    }
}
