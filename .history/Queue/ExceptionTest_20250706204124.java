// ExceptionTest.java
// Test class to demonstrate EmptyListException usage with List and Queue

public class ExceptionTest {
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

    // Queue class using List
    static class Queue {
        private List queueList;

        // no-argument constructor
        public Queue() {
            queueList = new List("queue");
        }

        // add object to queue
        public void enqueue(Object object) {
            queueList.insertAtBack(object);
        }

        // remove object from queue
        public Object dequeue() throws EmptyListException {
            return queueList.removeFromFront();
        }

        // determine if queue is empty
        public boolean isEmpty() {
            return queueList.isEmpty();
        }

        // output queue contents
        public void print() {
            queueList.print();
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
