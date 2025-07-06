package Stack;
import java.util.ArrayList;

public class StackLinkedListExample {
    private ArrayList<Integer> stack;

    public StackLinkedListExample() {
        stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
        System.out.println("Added: " + value);
    }

    public int pop() {
        if (!stack.isEmpty()) {
            int value = stack.remove(stack.size() - 1);
            System.out.println("Removed: " + value);
            return value;
        }
        System.out.println("Stack empty!");
        return -1;
    }

    public static void main(String[] args) {
        StackLinkedListExample stack = new StackLinkedListExample();
        stack.push(5);
        stack.push(10);
        stack.pop();
        stack.push(15);
    }
}
