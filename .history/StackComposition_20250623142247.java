// Fig. 17.12: StackComposition.java
// Class StackComposition definition with composed List object.
public class StackComposition
{
   private List stackList;

   // no-argument constructor
   public StackComposition()
   {
      stackList = new List( "stack" );
   } // end StackComposition no-argument constructor

   // add object to stack
   public void push( Object object )
   {
      stackList.insertAtFront( object );
   } // end method push

   // remove object from stack
   public Object pop() throws EmptyListException
   {
      return stackList.removeFromFront();
   } // end method pop

   // determine if stack is empty
   public boolean isEmpty()
   {
      return stackList.isEmpty();
   } // end method isEmpty

   // output stack contents
   public void print()
   {
      stackList.print();
   } // end method print
} // end class StackComposition
