// EmptyListException.java
// Custom exception for empty list operations

public class EmptyListException extends Exception {
    public EmptyListException(String name) {
        super(name + " is empty");
    }
}
