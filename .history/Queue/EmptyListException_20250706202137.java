// EmptyListException.java
// Custom exception for empty list operations
package Queue;

public class EmptyListException extends Exception {
    public EmptyListException(String name) {
        super(name + " is empty");
    }
}
