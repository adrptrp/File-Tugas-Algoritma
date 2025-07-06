public class ArrayLoopExamples {
    public static void main(String[] args) {

        // 1. Deklarasi dan inisialisasi array
        int[] angka = {10, 20, 30, 40, 50};
        String[] nama = {"Ali", "Budi", "Citra", "Dina", "Eko"};
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2. For loop tradisional
        System.out.println("=== FOR LOOP TRADISIONAL ===");
        System.out.print("Array angka: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // 3. Enhanced for loop (for-each)
        System.out.println("\n=== ENHANCED FOR LOOP ===");
        System.out.print("Array nama: ");
        for (String n : nama) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 4. While loop
        System.out.println("\n=== WHILE LOOP ===");
        System.out.print("Array angka (while): ");
        int j = 0;
        while (j < angka.length) {
            System.out.print(angka[j] + " ");
            j++;
        }
        System.out.println();

        // 5. Operasi array: maksimum, total, rata-rata
        System.out.println("\n=== OPERASI ARRAY ===");
        int max = angka[0], total = 0;
        for (int nilai : angka) {
            if (nilai > max) max = nilai;
            total += nilai;
        }
        double rata = (double) total / angka.length;
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Total: " + total + ", Rata-rata: " + rata);

        // Mencari elemen tertentu
        String cari = "Citra";
        int index = -1;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equals(cari)) {
                index = i;
                break;
            }
        }
        System.out.println("Mencari '" + cari + "': " +
            (index != -1 ? "Ditemukan di index " + index : "Tidak ditemukan"));

        // 6. Array 2 dimensi dengan nested loop
        System.out.println("\n=== ARRAY 2 DIMENSI ===");
        System.out.println("Matrix 3x3:");
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

        // 7. Reverse array
        System.out.println("\n=== REVERSE ARRAY ===");
        System.out.print("Array nama terbalik: ");
        for (int i = nama.length - 1; i >= 0; i--) {
            System.out.print(nama[i] + " ");
        }
        System.out.println();

        // 8. Filter array (angka genap)
        System.out.println("\n=== FILTER ARRAY ===");
        System.out.print("Angka genap: ");
        for (int nilai : angka) {
            if (nilai % 2 == 0) {
                System.out.print(nilai + " ");
            }
        }
        System.out.println();

        // 9. Membuat array baru dengan loop (kuadrat)
        System.out.println("\n=== MEMBUAT ARRAY BARU ===");
        int[] kuadrat = new int[angka.length];
        for (int i = 0; i < angka.length; i++) {
            kuadrat[i] = angka[i] * angka[i];
        }
        System.out.print("Array kuadrat: ");
        for (int nilai : kuadrat) {
            System.out.print(nilai + " ");
        }
        System.out.println();

        // 10. Sorting sederhana (bubble sort)
        System.out.println("\n=== BUBBLE SORT ===");
        int[] dataSort = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Sebelum sort: ");
        for (int nilai : dataSort) {
            System.out.print(nilai + " ");
        }
        System.out.println();

        // Bubble sort
        for (int i = 0; i < dataSort.length - 1; i++) {
            for (int k = 0; k < dataSort.length - 1 - i; k++) {
                if (dataSort[k] > dataSort[k + 1]) {
                    int temp = dataSort[k];
                    dataSort[k] = dataSort[k + 1];
                    dataSort[k + 1] = temp;
                }
            }
        }
        System.out.print("Setelah sort: ");
        for (int nilai : dataSort) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
