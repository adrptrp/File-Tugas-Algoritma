package Method;

public class MethodDemo {
    // Static method from user's example
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    // Additional static method with parameters
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to method demonstrations.");
    }
    
    // Static method with return value
    static int addNumbers(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Calling the user's method multiple times
        System.out.println("=== USER'S METHOD EXAMPLE ===");
        myMethod();
        myMethod();
        myMethod();
        
        // Calling additional static method with parameter
        System.out.println("\n=== STATIC METHOD WITH PARAMETER ===");
        greetUser("Adrian");
        
        // Calling static method with return value
        System.out.println("\n=== STATIC METHOD WITH RETURN VALUE ===");
        int sum = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20: " + sum);
        
        // Create an instance to call instance methods
        MethodDemo demo = new MethodDemo();
        
        // Calling instance method
        System.out.println("\n=== INSTANCE METHOD ===");
        demo.instanceMethodExample();
        
        // Calling overloaded methods
        System.out.println("\n=== METHOD OVERLOADING ===");
        System.out.println("Sum of 2 numbers (int): " + demo.overloadedMethod(5, 10));
        System.out.println("Sum of 3 numbers (int): " + demo.overloadedMethod(5, 10, 15));
        System.out.println("Sum of 2 numbers (double): " + demo.overloadedMethod(5.5, 10.5));
    }
    
    // Instance method example
    void instanceMethodExample() {
        System.out.println("This is an instance method. It requires an object to be called.");
    }
    
    // Overloaded methods (same name, different parameters)
    int overloadedMethod(int a, int b) {
        return a + b;
    }
    
    int overloadedMethod(int a, int b, int c) {
        return a + b + c;
    }
    
    double overloadedMethod(double a, double b) {
        return a + b;
    }
}
