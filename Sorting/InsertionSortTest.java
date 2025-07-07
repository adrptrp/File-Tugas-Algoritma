package Sorting;

public class InsertionSortTest
{
    public static void main( String[] args )
    {
        // create object to perform insertion sort
        InsertionSort sortArray = new InsertionSort( 10 );

        System.out.println( "Unsorted array:" );
        System.out.println( sortArray ); // print unsorted array

        sortArray.sort(); // sort array

        System.out.println( "Sorted array:" );
        System.out.println( sortArray ); // print sorted array
    } // end main
} // end class InsertionSortTest
