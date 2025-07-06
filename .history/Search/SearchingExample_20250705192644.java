package Search;
package Search;

public class SearchingExample {
    // Linear Search: Searches for an element in an array by checking each element sequentially
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary Search: Searches for an element in a sorted array by repeatedly dividing the search interval in half
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }

    // Main method to test the searching algorithms
    public static void main(String[] args) {
        // Test Linear Search
        int[] unsortedArray = {5, 2, 9, 1, 7, 6, 3};
        int target1 = 7;
        int linearResult = linearSearch(unsortedArray, target1);
        System.out.println("Linear Search for " + target1 + ": " + 
            (linearResult == -1 ? "Not found" : "Found at index " + linearResult));

        // Test Binary Search (array must be sorted)
        int[] sortedArray = {1, 2, 3, 5, 6, 7, 9};
        int target2 = 5;
        int binaryResult = binarySearch(sortedArray, target2);
        System.out.println("Binary Search for " + target2 + ": " + 
            (binaryResult == -1 ? "Not found" : "Found at index " + binaryResult));

        // Test with element not in array
        int target3 = 4;
        int binaryResult2 = binarySearch(sortedArray, target3);
        System.out.println("Binary Search for " + target3 + ": " + 
            (binaryResult2 == -1 ? "Not found" : "Found at index " + binaryResult2));
    }
}
