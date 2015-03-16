// Fig. 19.7: SelectionSortTest.java
// Testing the selection sort class.

public class SelectionSortTest
{
   public static void main( String[] args )
   {
      // create object to perform selection sort
      SelectionSort sortArray = new SelectionSort( 10 );
      
      System.out.println( "Unsorted array:" );
      System.out.println( sortArray + "\n" ); // print unsorted array

      sortArray.sort(); // sort array

      System.out.println( "Sorted array:" );
      System.out.println( sortArray ); // print sorted array
   } // end main
} // end class SelectionSortTest


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