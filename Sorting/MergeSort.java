package Sorting;

public class MergeSort {
    private int[] data; // array of values
    private static final int SPACES_PER_LEVEL = 3; // spaces for formatting output

    // create array of specified size and fill with random integers
    public MergeSort(int size) {
        data = new int[size]; // create space for array

        // fill array with random integers in range 10-99
        for (int i = 0; i < size; i++)
            data[i] = 10 + (int) (Math.random() * 90);
    } // end MergeSort constructor

    // sort array using merge sort
    public void sort() {
        System.out.println("split:    " + arrayToString(data, 0, data.length - 1));
        mergeSort(0, data.length - 1); // start merge sort
        System.out.println("\nmerge:    " + arrayToString(data, 0, data.length - 1));
    } // end method sort

    // split array into subarrays, sort them and merge back
    private void mergeSort(int left, int right) {
        // test base case; size of array equals 1
        if ((right - left) >= 1) { // if not base case
            int middle = (left + right) / 2; // calculate middle of array

            // output split step
            if (right - left > 1) {
                System.out.println("          " + arrayToString(data, left, middle));
                System.out.println("                         " + arrayToString(data, middle + 1, right));
                System.out.println();
            }

            // split array in half; sort each half (recursive calls)
            System.out.println("split:    " + arrayToString(data, left, right));
            mergeSort(left, middle); // first half of array
            mergeSort(middle + 1, right); // second half of array
            merge(left, middle, middle + 1, right); // merge the two sorted arrays
        } // end if
    } // end method mergeSort

    // merge two sorted subarrays into one sorted subarray
    private void merge(int left1, int right1, int left2, int right2) {
        int leftIndex = left1; // index into first subarray
        int rightIndex = left2; // index into second subarray
        int combinedIndex = left1; // index into temporary working array
        int[] combined = new int[data.length]; // working array

        // output the two subarrays before merging
        System.out.println("merge:    " + arrayToString(data, left1, right1));
        System.out.println("                         " + arrayToString(data, left2, right2));

        // merge arrays until reaching end of either
        while (leftIndex <= right1 && rightIndex <= right2) {
            // place smaller of two elements into result
            // and move to next element in subarray
            if (data[leftIndex] <= data[rightIndex])
                combined[combinedIndex++] = data[leftIndex++];
            else
                combined[combinedIndex++] = data[rightIndex++];
        } // end while

        // if first array has remaining elements
        if (leftIndex == right1 + 1) {
            // copy remaining elements from second array
            while (rightIndex <= right2)
                combined[combinedIndex++] = data[rightIndex++];
        } // end if
        else { // second array has remaining elements
            // copy remaining elements from first array
            while (leftIndex <= right1)
                combined[combinedIndex++] = data[leftIndex++];
        } // end else

        // copy result back into original array
        for (int i = left1; i <= right2; i++)
            data[i] = combined[i];

        // output merged array
        System.out.println("          " + arrayToString(data, left1, right2));
        System.out.println();
    } // end method merge

    // method to output certain values in array
    private String arrayToString(int[] arr, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        // iterate through specified range of array
        for (int i = low; i <= high; i++)
            temporary.append(arr[i]).append(" ");

        return temporary.toString();
    } // end method arrayToString

    // method to output values in array
    @Override
    public String toString() {
        return arrayToString(data, 0, data.length - 1);
    } // end method toString
} // end class MergeSort
