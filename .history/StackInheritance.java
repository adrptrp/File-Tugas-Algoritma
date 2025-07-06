// Fig. 17.10: StackInheritance.java
// Derived from class List.
package com.deitel.jhtp6.ch17;

import Queue.EmptyListException;
import Queue.List;

public class StackInheritance extends List
{
   // no-argument constructor
   public StackInheritance()
   {
      super( "stack" );
   } // end StackInheritance no-argument constructor

   // add object to stack
   public void push( Object object )
   {
      insertAtFront( object );
   } // end method push

   // remove object from stack
   public Object pop() throws EmptyListException
   {
      return removeFromFront();
   } // end method pop
} // end class StackInheritance
