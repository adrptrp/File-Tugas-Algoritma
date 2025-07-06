import Stack.StackLinkedListExample;

public class StackLinkedListExample {
    // Node class for the linked list
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top;
    
    public StackLinkedListExample() {
        top = null;
    }
    
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop from stack");
            return -1;
        }
        int value = top.data;
        top = top.next;
        System.out.println(value + " popped from stack");
        return value;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        }
        return top.data;
    }
    
    public boolean isEmpty() {
        return (top == null);
    }
    
    public static void main(String[] args) {
        StackLinkedListExample stack = new StackLinkedListExample();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        System.out.println("Top element is: " + stack.peek());
    }
}
