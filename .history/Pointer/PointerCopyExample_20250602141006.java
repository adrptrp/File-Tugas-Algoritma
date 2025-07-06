public class PointerCopyExample {

    // Class to simulate pointer-like behavior
    static class IntPointer {
        private int value;

        public IntPointer(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "IntPointer{value=" + value + ", address=" + this.hashCode() + "}";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Contoh Penyalinan Pointer dalam Java ===\n");

        // Membuat variabel y dengan nilai 35
        IntPointer y = new IntPointer(35);
        System.out.println("y = " + y);

        // x1 "menunjuk" ke y (menyimpan referensi yang sama)
        IntPointer x1 = y;
        System.out.println("x1 = y");
        System.out.println("x1 = " + x1);

        // x2 menyalin nilai pointer dari x1
        IntPointer x2 = x1;
        System.out.println("x2 = x1");
        System.out.println("x2 = " + x2);

        System.out.println("\n=== Verifikasi Referensi ===");
        System.out.println("y == x1: " + (y == x1));    // true - referensi sama
        System.out.println("x1 == x2: " + (x1 == x2));  // true - referensi sama
        System.out.println("y == x2: " + (y == x2));    // true - referensi sama

        System.out.println("\n=== Mengubah Nilai Melalui x2 ===");
        x2.setValue(100);
        System.out.println("x2.setValue(100)");
        System.out.println("y.getValue(): " + y.getValue());   // 100
        System.out.println("x1.getValue(): " + x1.getValue()); // 100
        System.out.println("x2.getValue(): " + x2.getValue()); // 100

        System.out.println("\n=== Contoh dengan Array (Reference Type) ===");

        // Menggunakan array untuk mensimulasikan pointer behavior
        int[] arrayY = {35};
        int[] arrayX1 = arrayY;  // x1 menunjuk ke array yang sama
        int[] arrayX2 = arrayX1; // x2 menyalin referensi dari x1

        System.out.println("Original arrayY[0]: " + arrayY[0]);
        System.out.println("arrayX1[0]: " + arrayX1[0]);
        System.out.println("arrayX2[0]: " + arrayX2[0]);

        // Mengubah nilai melalui arrayX2
        arrayX2[0] = 200;
        System.out.println("\nSetelah arrayX2[0] = 200:");
        System.out.println("arrayY[0]: " + arrayY[0]);   // 200
        System.out.println("arrayX1[0]: " + arrayX1[0]); // 200
        System.out.println("arrayX2[0]: " + arrayX2[0]); // 200

        System.out.println("\n=== Membuat Salinan Baru (Deep Copy) ===");

        // Jika ingin membuat salinan independen
        IntPointer original = new IntPointer(50);
        IntPointer copy = new IntPointer(original.getValue()); // Salinan nilai, bukan referensi

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
        System.out.println("original == copy: " + (original == copy)); // false

        copy.setValue(75);
        System.out.println("\nSetelah copy.setValue(75):");
        System.out.println("Original value: " + original.getValue()); // 50 (tidak berubah)
        System.out.println("Copy value: " + copy.getValue());         // 75
    }
}