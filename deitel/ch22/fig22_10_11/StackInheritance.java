// Fig. 22.10: StackInheritance.java
// StackInheritance extends class List.
package com.deitel.ch22;

public class StackInheritance< T > extends List< T >
{
   // no-argument constructor
   public StackInheritance() 
   { 
      super( "stack" ); 
   } // end StackInheritance no-argument constructor

   // add object to stack
   public void push( T object )
   { 
      insertAtFront( object ); 
   } // end method push

   // remove object from stack
   public T pop() throws EmptyListException
   { 
      return removeFromFront(); 
   } // end method pop
} // end class StackInheritance


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
