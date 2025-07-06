package Method;

public class MethodExample {
    public static void main(String[] args) {
        // Demonstrasi pemanggilan berbagai jenis method
        System.out.println("=== DEMONSTRASI METHOD DI JAVA ===");

        // Memanggil static method langsung dari class
        System.out.println("Static Method - Penjumlahan: " + addNumbers(5, 3));

        // Membuat instance objek untuk memanggil instance method
        MethodExample example = new MethodExample();
        System.out.println("Instance Method - Salam: " + example.greet("Adrian"));

        // Memanggil method dengan overloading
        System.out.println("Overloaded Method - Penjumlahan 2 angka: " + example.add(10, 20));
        System.out.println("Overloaded Method - Penjumlahan 3 angka: " + example.add(10, 20, 30));

        // Memanggil method dengan parameter berbeda
        System.out.println("Method dengan Array: " + example.sumArray(new int[]{1, 2, 3, 4, 5}));

        // Demonstrasi method dengan return type berbeda
        double result = example.divide(15.0, 3.0);
        System.out.println("Method Return Double - Pembagian: " + String.format("%.2f", result));
    }

    // 1. Static Method - Bisa dipanggil tanpa membuat instance
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 2. Instance Method - Memerlukan instance objek untuk dipanggil
    public String greet(String name) {
        return "Halo, " + name + "! Selamat datang!";
    }

    // 3. Method Overloading - Method dengan nama sama tapi parameter berbeda
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 4. Method dengan Array sebagai Parameter
    public int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 5. Method dengan Return Type Double
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol!");
        }
        return a / b;
    }
}
