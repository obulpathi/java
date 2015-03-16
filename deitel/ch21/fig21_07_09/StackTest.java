// Fig. 21.9: StackTest.java
// Stack generic class test program.

public class StackTest 
{
   public static void main( String[] args ) 
   {
      double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
      int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      
      // Create a Stack< Double > and a Stack< Integer >
      Stack< Double > doubleStack = new Stack< Double >( 5 ); 
      Stack< Integer > integerStack = new Stack< Integer >(); 

      // push elements of doubleElements onto doubleStack
      testPushDouble( doubleStack, doubleElements ); 
      testPopDouble( doubleStack ); // pop from doubleStack

      // push elements of integerElements onto integerStack
      testPushInteger( integerStack, integerElements ); 
      testPopInteger( integerStack ); // pop from integerStack
   } // end main

   // test push method with double stack
   private static void testPushDouble( 
      Stack< Double > stack, double[] values )
   {
      System.out.println( "\nPushing elements onto doubleStack" );

      // push elements to Stack
      for ( double value : values )
      {
         System.out.printf( "%.1f ", value );
         stack.push( value ); // push onto doubleStack
      } // end for
   } // end method testPushDouble

   // test pop method with double stack
   private static void testPopDouble( Stack< Double > stack )
   {
      // pop elements from stack
      try
      {
         System.out.println( "\nPopping elements from doubleStack" );
         double popValue; // store element removed from stack

         // remove all elements from Stack
         while ( true )
         {
            popValue = stack.pop(); // pop from doubleStack
            System.out.printf( "%.1f ", popValue ); 
         } // end while
      } // end try
      catch( EmptyStackException emptyStackException )
      {
         System.err.println();
         emptyStackException.printStackTrace();
      } // end catch EmptyStackException
   } // end method testPopDouble

   // test push method with integer stack
   private static void testPushInteger( 
      Stack< Integer > stack, int[] values )
   {
      System.out.println( "\nPushing elements onto integerStack" );

      // push elements to Stack
      for ( int value : values )
      {
         System.out.printf( "%d ", value );
         stack.push( value ); // push onto integerStack
      } // end for
   } // end method testPushInteger

   // test pop method with integer stack
   private static void testPopInteger( Stack< Integer > stack )
   {
      // pop elements from stack
      try
      {
         System.out.println( "\nPopping elements from integerStack" );
         int popValue; // store element removed from stack

         // remove all elements from Stack
         while ( true )
         {
            popValue = stack.pop(); // pop from intStack
            System.out.printf( "%d ", popValue );
         } // end while
      } // end try
      catch( EmptyStackException emptyStackException )
      {
         System.err.println();
         emptyStackException.printStackTrace();
      } // end catch EmptyStackException
   } // end method testPopInteger
} // end class StackTest

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