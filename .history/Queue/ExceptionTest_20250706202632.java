// ExceptionTest.java
// Test class to demonstrate EmptyListException usage with List and Queue

public class ExceptionTest {
    public static void main(String[] args) {
        // Test with List
        List list = new List("testList");
        System.out.println("Testing EmptyListException with List:");
        try {
            list.removeFromFront();
        } catch (EmptyListException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test with Queue
        Queue queue = new Queue();
        System.out.println("\nTesting EmptyListException with Queue:");
        try {
            queue.dequeue();
        } catch (EmptyListException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Menunggu input pengguna sebelum menutup program
        System.out.println("\nPress Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
