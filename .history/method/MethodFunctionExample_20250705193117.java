import MethodFunctionExample;

package method;
package method;

public class MethodFunctionExample {
    // Instance variable
    private int number = 10;

    // 1. Method without parameters and without return value (void)
    public void sayHello() {
        System.out.println("Hello! This is a method without parameters and return value.");
    }

    // 2. Method with parameters but without return value (void)
    public void greetPerson(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    // 3. Method without parameters but with return value
    public int getNumber() {
        return number;
    }

    // 4. Method with parameters and with return value
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // 5. Method with multiple return statements using conditions
    public String checkNumber(int value) {
        if (value > 0) {
            return "Positive";
        } else if (value < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // 6. Static method (can be called without creating an instance)
    public static void printMessage() {
        System.out.println("This is a static method. No object needed to call me!");
    }

    // 7. Method with variable arguments (varargs)
    public void printNumbers(int... numbers) {
        System.out.println("Numbers received:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Create an instance of the class
        MethodFunctionExample example = new MethodFunctionExample();

        // Test method without parameters and return value
        example.sayHello();

        // Test method with parameters but without return value
        example.greetPerson("Alice", 25);

        // Test method without parameters but with return value
        System.out.println("The number is: " + example.getNumber());

        // Test method with parameters and return value
        int sum = example.addNumbers(5, 3);
        System.out.println("Sum of 5 and 3 is: " + sum);

        // Test method with multiple return statements
        System.out.println("Number 5 is: " + example.checkNumber(5));
        System.out.println("Number -3 is: " + example.checkNumber(-3));
        System.out.println("Number 0 is: " + example.checkNumber(0));

        // Test static method
        printMessage();

        // Test method with variable arguments
        example.printNumbers(1, 2, 3, 4, 5);
        example.printNumbers(10, 20);
    }
}
