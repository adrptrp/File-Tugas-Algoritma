package Array;
public class ArrayLoopMulti {
    public static void main(String[] args) {

        // 1. ARRAY MULTIDIMENSI - DEKLARASI
        System.out.println("=== ARRAY MULTIDIMENSI ===");

        // Array 2D - Matrix
        int[][] matrix2D = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Array 3D - Kubus data
        int[][][] matrix3D = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}},
            {{9, 10}, {11, 12}}
        };

        // Array String 2D - Tabel nama
        String[][] siswa = {
            {"Ali", "Matematika", "85"},
            {"Budi", "Fisika", "78"},
            {"Citra", "Kimia", "92"},
            {"Dina", "Biologi", "88"}
        };

        // Array jagged (tidak seragam)
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9},
            {10}
        };

        // 2. NESTED LOOP UNTUK ARRAY 2D
        System.out.println("\n=== NESTED LOOP - ARRAY 2D ===");
        System.out.println("Matrix 2D (3x4):");
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                System.out.printf("%3d ", matrix2D[i][j]);
            }
            System.out.println();
        }

        // 3. ENHANCED FOR LOOP UNTUK ARRAY 2D
        System.out.println("\n=== ENHANCED FOR LOOP - ARRAY 2D ===");
        System.out.println("Data Siswa:");
        System.out.println("Nama\t\tMapel\t\tNilai");
        System.out.println("--------------------------------");
        for (String[] row : siswa) {
            for (String data : row) {
                System.out.printf("%-12s", data);
            }
            System.out.println();
        }

        // 4. TRIPLE NESTED LOOP UNTUK ARRAY 3D
        System.out.println("\n=== TRIPLE NESTED LOOP - ARRAY 3D ===");
        System.out.println("Matrix 3D:");
        for (int i = 0; i < matrix3D.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < matrix3D[i].length; j++) {
                for (int k = 0; k < matrix3D[i][j].length; k++) {
                    System.out.print(matrix3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // 5. JAGGED ARRAY DENGAN LOOP
        System.out.println("=== JAGGED ARRAY ===");
        System.out.println("Array tidak seragam:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Baris " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println("(panjang: " + jaggedArray[i].length + ")");
        }

        // 6. OPERASI MATEMATIKA PADA MATRIX
        System.out.println("\n=== OPERASI MATRIX ===");

        // Transpose matrix
        int[][] transpose = new int[matrix2D[0].length][matrix2D.length];
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                transpose[j][i] = matrix2D[i][j];
            }
        }

        System.out.println("Matrix Transpose (4x3):");
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }

        // Penjumlahan setiap baris
        System.out.println("\nJumlah setiap baris:");
        for (int i = 0; i < matrix2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix2D[i].length; j++) {
                sum += matrix2D[i][j];
            }
            System.out.println("Baris " + i + ": " + sum);
        }

        // 7. PENCARIAN DALAM ARRAY 2D
        System.out.println("\n=== PENCARIAN DALAM ARRAY 2D ===");
        int cari = 7;
        boolean found = false;
        int foundRow = -1, foundCol = -1;

        outerLoop:
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                if (matrix2D[i][j] == cari) {
                    found = true;
                    foundRow = i;
                    foundCol = j;
                    break outerLoop; // Keluar dari nested loop
                }
            }
        }

        if (found) {
            System.out.println("Nilai " + cari + " ditemukan di posisi [" + foundRow + "][" + foundCol + "]");
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }

        // 8. MEMBUAT PATTERN DENGAN NESTED LOOP
        System.out.println("\n=== PATTERN DENGAN NESTED LOOP ===");

        // Pattern segitiga angka
        System.out.println("Pattern Segitiga:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern diamond
        System.out.println("\nPattern Diamond:");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 9. PERKALIAN MATRIX
        System.out.println("\n=== PERKALIAN MATRIX ===");
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        // Perkalian matrix A x B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println("Matrix A x B:");
        printMatrix(result);

        // 10. SPIRAL TRAVERSAL
        System.out.println("\n=== SPIRAL TRAVERSAL ===");
        int[][] spiralMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matrix 4x4:");
        printMatrix(spiralMatrix);

        System.out.print("Spiral traversal: ");
        spiralTraversal(spiralMatrix);

        // 11. STATISTIK DARI ARRAY 2D
        System.out.println("\n\n=== STATISTIK ARRAY 2D ===");
        calculateStatistics(matrix2D);
    }

    // Method helper untuk print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }

    // Method untuk spiral traversal
    public static void spiralTraversal(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Kanan
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // Bawah
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Kiri
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            // Atas
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    // Method untuk menghitung statistik
    public static void calculateStatistics(int[][] matrix) {
        int sum = 0, count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
        }

        double average = (double) sum / count;

        System.out.println("Total elemen: " + count);
        System.out.println("Jumlah: " + sum);
        System.out.println("Rata-rata: " + String.format("%.2f", average));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}