 // Fig. 17.14: QueueTest.java
 2  // Class QueueTest.
 3  import com.deitel.jhtp6.ch17.Queue;
 4  import com.deitel.jhtp6.ch17.EmptyListException;
 5
 6  public class QueueTest
 7  {
 8     public static void main( String args[] )
 9     {
10        Queue queue = new Queue();
11
12        // use enqueue method
13        queue.enqueue( -1 ); 
14        queue.print();       
15        queue.enqueue( 0 );  
16        queue.print();       
17        queue.enqueue( 1 );  
18        queue.print();       
19        queue.enqueue( 5 );  
20        queue.print();       
21
22        // remove objects from queue
23        try
24        {
25           Object removedObject = null;
26
27           while ( true )
28           {
29              removedObject = queue.dequeue(); // use dequeue method
30              System.out.printf( "%s dequeued\n", removedObject );
31              queue.print();
32           } // end while
33        } // end try
34        catch ( EmptyListException emptyListException )
35        {
36           emptyListException.printStackTrace();
37        } // end catch
38     } // end main
39  } // end class QueueTest
