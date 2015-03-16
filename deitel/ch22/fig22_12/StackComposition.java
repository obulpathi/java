// Fig. 22.12: StackComposition.java
// StackComposition uses a composed List object.
package com.deitel.ch22;

public class StackComposition< T >
{
   private List< T > stackList;

   // no-argument constructor
   public StackComposition() 
   { 
      stackList = new List< T >( "stack" ); 
   } // end StackComposition no-argument constructor

   // add object to stack
   public void push( T object )
   { 
      stackList.insertAtFront( object ); 
   } // end method push

   // remove object from stack
   public T pop() throws EmptyListException
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


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
