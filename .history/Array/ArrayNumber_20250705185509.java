package Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ArrayNumber {
    public static void main(String[] args) {

        // 1. DEKLARASI ARRAY BERBAGAI TIPE ANGKA
        System.out.println("=== ARRAY BERBAGAI TIPE ANGKA ===");

        int[] intArray = {15, 23, 8, 42, 16, 4, 35, 19, 27, 11};
        double[] doubleArray = {3.14, 2.71, 1.41, 1.73, 0.57, 2.23, 3.16, 1.61, 2.44, 1.32};
        float[] floatArray = {1.5f, 2.7f, 3.2f, 4.8f, 5.1f, 6.3f, 7.9f, 8.4f, 9.6f, 10.2f};
        long[] longArray = {1000000L, 2500000L, 3750000L, 5000000L, 7500000L};
        byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Array Integer: " + Arrays.toString(intArray));
        System.out.println("Array Double: " + Arrays.toString(doubleArray));
        System.out.println("Array Float: " + Arrays.toString(floatArray));
        System.out.println("Array Long: " + Arrays.toString(longArray));
        System.out.println("Array Byte: " + Arrays.toString(byteArray));

        // 2. OPERASI STATISTIK DASAR
        System.out.println("\n=== OPERASI STATISTIK DASAR ===");

        // Sum (Penjumlahan)
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        System.out.println("Jumlah (Sum): " + sum);

        // Average (Rata-rata)
        double average = (double) sum / intArray.length;
        System.out.println("Rata-rata (Average): " + String.format("%.2f", average));

        // Min dan Max
        int min = intArray[0];
        int max = intArray[0];
        for (int num : intArray) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Range: " + (max - min));

        // 3. PENCARIAN ANGKA
        System.out.println("\n=== PENCARIAN ANGKA ===");

        int target = 23;
        int index = linearSearch(intArray, target);
        System.out.println("Mencari angka " + target + ": " +
                (index != -1 ? "Ditemukan di index " + index : "Tidak ditemukan"));

        // Mencari semua angka genap
        System.out.print("Angka genap: ");
        for (int num : intArray) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Mencari angka prima
        System.out.print("Angka prima: ");
        for (int num : intArray) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 4. SORTING ARRAY
        System.out.println("\n=== SORTING ARRAY ===");

        int[] originalArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Array asli: " + Arrays.toString(originalArray));

        // Bubble Sort
        int[] bubbleSorted = Arrays.copyOf(intArray, intArray.length);
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSorted));

        // Selection Sort
        int[] selectionSorted = Arrays.copyOf(intArray, intArray.length);
        selectionSort(selectionSorted);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSorted));

        // Arrays.sort() - Built-in
        int[] builtinSorted = Arrays.copyOf(intArray, intArray.length);
        Arrays.sort(builtinSorted);
        System.out.println("Built-in Sort: " + Arrays.toString(builtinSorted));

        // 5. OPERASI MATEMATIKA LANJUTAN
        System.out.println("\n=== OPERASI MATEMATIKA LANJUTAN ===");

        // Kuadrat setiap elemen
        int[] squares = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            squares[i] = intArray[i] * intArray[i];
        }
        System.out.println("Kuadrat: " + Arrays.toString(squares));

        // Akar kuadrat
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Akar kuadrat: [");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(df.format(Math.sqrt(intArray[i])));
            if (i < intArray.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Faktorial (untuk angka kecil)
        System.out.print("Faktorial (angka <= 10): ");
        for (int num : intArray) {
            if (num <= 10) {
                System.out.print(num + "! = " + factorial(num) + " ");
            }
        }
        System.out.println();

        // 6. MANIPULASI ARRAY
        System.out.println("\n=== MANIPULASI ARRAY ===");

        // Reverse array
        int[] reversed = reverseArray(intArray);
        System.out.println("Array terbalik: " + Arrays.toString(reversed));

        // Rotate array (shift kanan)
        int[] rotated = rotateArray(intArray, 3);
        System.out.println("Rotate 3 posisi: " + Arrays.toString(rotated));

        // Remove duplicates
        int[] withDuplicates = {1, 2, 2, 3, 4, 4, 5, 5, 5, 6};
        int[] unique = removeDuplicates(withDuplicates);
        System.out.println("Array dengan duplikat: " + Arrays.toString(withDuplicates));
        System.out.println("Setelah remove duplikat: " + Arrays.toString(unique));

        // 7. OPERASI SET MATEMATIKA
        System.out.println("\n=== OPERASI SET MATEMATIKA ===");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] union = findUnion(array1, array2);
        int[] intersection = findIntersection(array1, array2);

        System.out.println("Union: " + Arrays.toString(union));
        System.out.println("Intersection: " + Arrays.toString(intersection));

        // 8. GENERATE RANDOM NUMBERS
        System.out.println("\n=== GENERATE RANDOM NUMBERS ===");

        Random random = new Random();
        int[] randomArray = new int[10];

        // Random 1-100
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100) + 1;
        }
        System.out.println("Random 1-100: " + Arrays.toString(randomArray));

        // Fibonacci sequence
        int[] fibonacci = generateFibonacci(10);
        System.out.println("Fibonacci 10: " + Arrays.toString(fibonacci));

        // Prime numbers
        int[] primes = generatePrimes(50);
        System.out.println("Bilangan prima <= 50: " + Arrays.toString(primes));

        // 9. ANALISIS FREKUENSI
        System.out.println("\n=== ANALISIS FREKUENSI ===");

        int[] dataFrekuensi = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        System.out.println("Data: " + Arrays.toString(dataFrekuensi));
        frequencyAnalysis(dataFrekuensi);

        // 10. KONVERSI ARRAY
        System.out.println("\n=== KONVERSI ARRAY ===");

        // Int ke Double
        double[] intToDouble = convertIntToDouble(intArray);
        System.out.println("Int ke Double: " + Arrays.toString(intToDouble));

        // String numbers ke Int
        String[] stringNumbers = {"10", "20", "30", "40", "50"};
        int[] stringToInt = convertStringToInt(stringNumbers);
        System.out.println("String ke Int: " + Arrays.toString(stringToInt));

        // Binary representation
        System.out.println("\nRepresentasi Binary:");
        for (int i = 0; i < 5; i++) {
            System.out.println(intArray[i] + " = " + Integer.toBinaryString(intArray[i]));
        }
    }

    // Method untuk Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Method untuk cek bilangan prima
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

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Factorial
    public static long factorial(int n) {
        if (n <= 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Reverse Array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Rotate Array
    public static int[] rotateArray(int[] arr, int positions) {
        int[] rotated = new int[arr.length];
        int n = arr.length;
        positions = positions % n;

        for (int i = 0; i < n; i++) {
            rotated[(i + positions) % n] = arr[i];
        }
        return rotated;
    }

    // Remove Duplicates
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        return Arrays.copyOf(temp, j);
    }

    // Find Union
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, temp, 0, arr1.length);
        System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
        return removeDuplicates(temp);
    }

    // Find Intersection
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    temp[k++] = arr1[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(temp, k);
    }

    // Generate Fibonacci
    public static int[] generateFibonacci(int n) {
        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Generate Primes
    public static int[] generatePrimes(int limit) {
        int[] temp = new int[limit];
        int count = 0;

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                temp[count++] = i;
            }
        }
        return Arrays.copyOf(temp, count);
    }

    // Frequency Analysis
    public static void frequencyAnalysis(int[] arr) {
        Arrays.sort(arr);
        int current = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                System.out.println("Angka " + current + " muncul " + count + " kali");
                current = arr[i];
                count = 1;
            }
        }
        System.out.println("Angka " + current + " muncul " + count + " kali");
    }

    // Convert Int to Double
    public static double[] convertIntToDouble(int[] arr) {
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = (double) arr[i];
        }
        return result;
    }

    // Convert String to Int
    public static int[] convertStringToInt(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
}