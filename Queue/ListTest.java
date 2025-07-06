// ListTest.java
// Test class to demonstrate List and EmptyListException usage

public class ListTest {
    // Custom exception for empty list operations
    static class EmptyListException extends Exception {
        public EmptyListException(String name) {
            super(name + " is empty");
        }
    }

    // A simple List class for stack and queue implementations
    static class List {
        private class Node {
            Object data;
            Node next;

            Node(Object data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node firstNode;
        private Node lastNode;
        private String name;

        public List(String name) {
            this.name = name;
            firstNode = lastNode = null;
        }

        public void insertAtFront(Object insertItem) {
            if (isEmpty()) {
                firstNode = lastNode = new Node(insertItem);
            } else {
                Node newNode = new Node(insertItem);
                newNode.next = firstNode;
                firstNode = newNode;
            }
        }

        public void insertAtBack(Object insertItem) {
            if (isEmpty()) {
                firstNode = lastNode = new Node(insertItem);
            } else {
                Node newNode = new Node(insertItem);
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }

        public Object removeFromFront() throws EmptyListException {
            if (isEmpty()) {
                throw new EmptyListException(name);
            }
            Object removedItem = firstNode.data;
            if (firstNode == lastNode) {
                firstNode = lastNode = null;
            } else {
                firstNode = firstNode.next;
            }
            return removedItem;
        }

        public Object removeFromBack() throws EmptyListException {
            if (isEmpty()) {
                throw new EmptyListException(name);
            }
            Object removedItem = lastNode.data;
            if (firstNode == lastNode) {
                firstNode = lastNode = null;
            } else {
                Node current = firstNode;
                while (current.next != lastNode) {
                    current = current.next;
                }
                lastNode = current;
                current.next = null;
            }
            return removedItem;
        }

        public boolean isEmpty() {
            return firstNode == null;
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Empty " + name);
                return;
            }
            System.out.print("The " + name + " is: ");
            Node current = firstNode;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test with List
        List list = new List("testList");
        System.out.println("Testing EmptyListException with List:");
        try {
            list.removeFromFront();
        } catch (EmptyListException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrate List operations
        System.out.println("\nDemonstrating List operations:");
        list.insertAtBack("Item 1");
        list.insertAtBack("Item 2");
        list.insertAtFront("Item 0");
        list.print();
        try {
            System.out.println("Removed from front: " + list.removeFromFront());
            list.print();
            System.out.println("Removed from back: " + list.removeFromBack());
            list.print();
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
