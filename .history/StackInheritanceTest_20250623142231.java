// Fig. 17.11: StackInheritanceTest.java
// Class StackInheritanceTest.
public class StackInheritanceTest
{
   public static void main( String args[] )
   {
      StackInheritance stack = new StackInheritance();

      // use push method
      stack.push( -1 ); 
      stack.print();    
      stack.push( 0 );  
      stack.print();    
      stack.push( 1 );  
      stack.print();    
      stack.push( 5 );  
      stack.print();    

      // remove items from stack
      try
      {
         Object removedObject = null;

         while ( true )
         {
            removedObject = stack.pop(); // use pop method
            System.out.printf( "%s popped\n", removedObject );
            stack.print();
         } // end while
      } // end try
      catch ( EmptyListException emptyListException )
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class StackInheritanceTest
