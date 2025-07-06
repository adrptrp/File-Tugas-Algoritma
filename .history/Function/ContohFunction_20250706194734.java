package Function;
import java.util.Arrays;
import java.util.Scanner;

public class ContohFunction {
    
    // 1. FUNCTION TANPA PARAMETER DAN RETURN VALUE
    public static void sayHello() {
        System.out.println("Hello, World!");
        System.out.println("Selamat datang di Java Functions!");
    }
    
    public static void printSeparator() {
        System.out.println("================================");
    }
    
    // 2. FUNCTION DENGAN PARAMETER TANPA RETURN VALUE
    public static void greetUser(String name) {
        System.out.println("Halo, " + name + "! Selamat belajar Java!");
    }
    
    public static void printInfo(String name, int age, String city) {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age + " tahun");
        System.out.println("Kota: " + city);
    }
    
    public static void printPattern(int rows, char symbol) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    // 3. FUNCTION DENGAN RETURN VALUE TANPA PARAMETER
    public static String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }
    
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
    
    public static double getPiValue() {
        return Math.PI;
    }
    
    // 4. FUNCTION DENGAN PARAMETER DAN RETURN VALUE
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
    
    public static String combineStrings(String str1, String str2, String separator) {
        return str1 + separator + str2;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // 5. FUNCTION DENGAN MULTIPLE PARAMETERS
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    
    public static String formatCurrency(double amount, String currency) {
        return String.format("%.2f %s", amount, currency);
    }
    
    // 6. FUNCTION OVERLOADING (METHOD DENGAN NAMA SAMA, PARAMETER BEDA)
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public static String multiply(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
    
    // 7. FUNCTION DENGAN ARRAY PARAMETER
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static double averageArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        return (double) sumArray(numbers) / numbers.length;
    }
    
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    
    public static void printArray(int[] arr, String arrayName) {
        System.out.println(arrayName + ": " + Arrays.toString(arr));
    }
    
    // 8. FUNCTION DENGAN VARARGS (VARIABLE ARGUMENTS)
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public static String concatenate(String separator, String... strings) {
        if (strings.length == 0) return "";
        
        StringBuilder result = new StringBuilder(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            result.append(separator).append(strings[i]);
        }
        return result.toString();
    }
    
    public static int findMaxVarargs(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    // 9. FUNCTION MATEMATIKA
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static double power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / power(base, -exponent);
        }
    }
    
    // 10. FUNCTION STRING MANIPULATION
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(reverseString(cleaned));
    }
    
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }
    
    // 11. FUNCTION UTILITY
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    public static void waitForEnter() {
        System.out.print("Tekan Enter untuk melanjutkan...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
    public static String formatNumber(double number) {
        return String.format("%,.2f", number);
    }
    
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") && 
               email.indexOf("@") < email.lastIndexOf(".");
    }
    
    // 12. FUNCTION DENGAN ERROR HANDLING
    public static int parseInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + str + "' bukan angka valid!");
            return 0;
        }
    }
    
    public static double safeDivide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan!");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
    
    // MAIN METHOD - TESTING SEMUA FUNCTION
    public static void main(String[] args) {
        System.out.println("=== DEMO JAVA FUNCTIONS ===\n");

        // 1. Function tanpa parameter dan return
        System.out.println("1. Function Tanpa Parameter dan Return:");
        sayHello();
        printSeparator();

        // 2. Function dengan parameter tanpa return
        System.out.println("\n2. Function Dengan Parameter Tanpa Return:");
        greetUser("Ahmad");
        printInfo("Siti", 25, "Jakarta");
        System.out.println("Pattern bintang:");
        printPattern(4, '*');
        printSeparator();

        // 3. Function dengan return tanpa parameter
        System.out.println("\n3. Function Dengan Return Tanpa Parameter:");
        System.out.println("Waktu sekarang: " + getCurrentTime());
        System.out.println("Random number: " + generateRandomNumber());
        System.out.println("Nilai PI: " + getPiValue());
        printSeparator();

        // 4. Function dengan parameter dan return
        System.out.println("\n4. Function Dengan Parameter dan Return:");
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("10.0 / 3.0 = " + divide(10.0, 3.0));
        System.out.println("Gabung string: " + combineStrings("Java", "Programming", " - "));
        System.out.println("Apakah 8 genap? " + isEven(8));
        printSeparator();

        // 5. Function dengan multiple parameters
        System.out.println("\n5. Function Multiple Parameters:");
        System.out.println("Luas persegi panjang (5x3): " + calculateRectangleArea(5, 3));
        System.out.println("Luas lingkaran (r=4): " + calculateCircleArea(4));
        System.out.println("Nilai maksimum dari (7, 12, 5): " + findMax(7, 12, 5));
        System.out.println("Format mata uang: " + formatCurrency(1500000.5, "IDR"));
        printSeparator();

        // 6. Function Overloading
        System.out.println("\n6. Function Overloading:");
        System.out.println("2 x 3 = " + multiply(2, 3));
        System.out.println("2.5 x 4.2 = " + multiply(2.5, 4.2));
        System.out.println("2 x 3 x 4 = " + multiply(2, 3, 4));
        System.out.println("Repeat 'Hi' 3x: " + multiply("Hi", 3));
        printSeparator();

        // 7. Function dengan array parameter
        System.out.println("\n7. Function dengan Array Parameter:");
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr, "Array");
        System.out.println("Jumlah array: " + sumArray(arr));
        System.out.println("Rata-rata array: " + averageArray(arr));
        printArray(reverseArray(arr), "Array Terbalik");
        printSeparator();

        // 8. Function dengan varargs
        System.out.println("\n8. Function dengan Varargs:");
        System.out.println("Sum(1,2,3,4,5): " + sum(1,2,3,4,5));
        System.out.println("Concatenate: " + concatenate("-", "A", "B", "C"));
        System.out.println("Max dari (5,9,2,8,1): " + findMaxVarargs(5,9,2,8,1));
        printSeparator();

        // 9. Function Matematika
        System.out.println("\n9. Function Matematika:");
        System.out.println("Faktorial 5: " + factorial(5));
        System.out.println("Fibonacci ke-7: " + fibonacci(7));
        System.out.println("Apakah 17 prima? " + isPrime(17));
        System.out.println("2 pangkat 5: " + power(2, 5));
        printSeparator();

        // 10. Function String Manipulation
        System.out.println("\n10. Function String Manipulation:");
        String kalimat = "Aku suka belajar java";
        System.out.println("Reverse: " + reverseString(kalimat));
        System.out.println("Is Palindrome 'katak'? " + isPalindrome("katak"));
        System.out.println("Jumlah vokal: " + countVowels(kalimat));
        System.out.println("Capitalize: " + capitalizeWords(kalimat));
        printSeparator();

        // 11. Function Utility
        System.out.println("\n11. Function Utility:");
        System.out.println("Format angka: " + formatNumber(1234567.891));
        System.out.println("Validasi email 'test@mail.com': " + isValidEmail("test@mail.com"));
        printSeparator();

        // 12. Function dengan Error Handling
        System.out.println("\n12. Function dengan Error Handling:");
        System.out.println("Parse '123': " + parseInteger("123"));
        System.out.println("Parse 'abc': " + parseInteger("abc"));
        System.out.println("Safe divide 10/2: " + safeDivide(10, 2));
        System.out.println("Safe divide 10/0: " + safeDivide(10, 0));
        printSeparator();

        // Contoh penggunaan waitForEnter (opsional, bisa dikomentari jika tidak ingin pause)
        // waitForEnter();
    }
}