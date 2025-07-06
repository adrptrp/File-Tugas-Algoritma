package Pointer;

/**
 * PointerReferenceExample.java
 * Demonstrates the concept of pointers in Java through object references.
 */
public class PointerReferenceExample {
    // A simple class to demonstrate object references
    static class Box {
        int value;
        
        Box(int value) {
            this.value = value;
        }
        
        void setValue(int value) {
            this.value = value;
        }
        
        int getValue() {
            return value;
        }
    }
    
    /**
     * A method to modify the value of a Box object through its reference.
     * @param boxRef reference to a Box object
     * @param newValue the new value to set
     */
    public static void modifyBoxValue(Box boxRef, int newValue) {
        boxRef.setValue(newValue);
        System.out.println("Inside modifyBoxValue: Box value changed to " + boxRef.getValue());
    }
    
    /**
     * Main method to test object references as pointers.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Example 1: Creating a Box object and a reference to it
        System.out.println("Example 1: Creating and modifying a Box object through a reference:");
        Box box1 = new Box(10);
        System.out.println("Initial value of box1: " + box1.getValue());
        
        // Modifying the Box object through the reference
        modifyBoxValue(box1, 20);
        System.out.println("After modification, value of box1: " + box1.getValue());
        
        // Example 2: Multiple references to the same object
        System.out.println("\nExample 2: Multiple references to the same object:");
        Box box2 = box1; // box2 now references the same object as box1
        System.out.println("Value of box2 (same as box1): " + box2.getValue());
        
        // Modifying through box2 affects box1 since they reference the same object
        box2.setValue(30);
        System.out.println("After modifying box2, value of box1: " + box1.getValue());
        System.out.println("After modifying box2, value of box2: " + box2.getValue());
        
        // Example 3: Changing reference does not affect the original object
        System.out.println("\nExample 3: Changing reference does not affect the original object:");
        box2 = new Box(40); // box2 now references a new object
        System.out.println("Value of box1 (unchanged): " + box1.getValue());
        System.out.println("Value of box2 (new object): " + box2.getValue());
    }
}
