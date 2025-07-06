// List.java
// A simple List class for stack implementations

import Queue.EmptyListException;

public class List {
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
