import StackArrayExample;

package Stack;
public class StackArrayExample {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArrayExample(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top < capacity - 1) {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack full!");
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stack[top--];
            System.out.println("Popped: " + value);
            return value;
        }
        System.out.println("Stack empty!");
        return -1;
    }

    public static void main(String[] args) {
        StackArrayExample stack = new StackArrayExample(3);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.push(3);
    }
}
