package Sorting;

public class InsertionSort {
    private int[] data; // array of values

    // create array of specified size and fill with random integers
    public InsertionSort(int size) {
        data = new int[size]; // create space for array

        // fill array with random integers in range 10-99
        for (int i = 0; i < size; i++)
            data[i] = 10 + (int) (Math.random() * 90);
    } // end InsertionSort constructor

    // sort array using insertion sort
    public void sort() {
        int insert; // temporary variable to hold element to insert

        // loop over data.length - 1 elements
        for (int next = 1; next < data.length; next++) {
            // store value to be inserted
            insert = data[next];

            // initialize location to place element
            int moveItem = next;

            // shift elements to right to make room for insert
            while (moveItem > 0 && data[moveItem - 1] > insert) {
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            } // end while

            data[moveItem] = insert; // place inserted element
            printPass(next, moveItem); // output pass of algorithm
        } // end for
    } // end method sort

    // print a pass of the algorithm
    private void printPass(int pass, int index) {
        System.out.print(String.format("after pass %2d: ", pass));

        // print elements till item inserted this pass
        for (int i = 0; i < index; i++)
            System.out.print(data[i] + "  ");

        System.out.print(data[index] + "* "); // indicate insert

        // finish printing array
        for (int i = index + 1; i < data.length; i++)
            System.out.print(data[i] + "  ");

        System.out.print("\n              "); // for alignment

        // indicate amount of array that is sorted
        for (int j = 0; j <= pass; j++)
            System.out.print("--  ");

        System.out.println(); // add newline
    } // end method printPass

    // method to output values in array
    @Override
    public String toString() {
        StringBuilder temporary = new StringBuilder();

        // iterate through array
        for (int element : data)
            temporary.append(element).append("  ");

        temporary.append("\n");
        return temporary.toString();
    } // end method toString
} // end class InsertionSort
