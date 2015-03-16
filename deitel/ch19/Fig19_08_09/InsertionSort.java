// Fig. 19.8: InsertionSort.java
// Class that creates an array filled with random integers.  
// Provides a method to sort the array with insertion sort.
import java.util.Arrays;
import java.util.Random;

public class InsertionSort
{
   private int[] data; // array of values
   private static final Random generator = new Random();

   // create array of given size and fill with random integers
   public InsertionSort( int size )
   {
      data = new int[ size ]; // create space for array

      // fill array with random ints in range 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // end InsertionSort constructor

   // sort array using insertion sort
   public void sort()
   {
      int insert; // temporary variable to hold element to insert

      // loop over data.length - 1 elements
      for ( int next = 1; next < data.length; next++ )
      {
         // store value in current element
         insert = data[ next ]; 

         // initialize location to place element
         int moveItem = next; 

         // search for place to put current element
         while ( moveItem > 0 && data[ moveItem - 1 ] > insert )
         {
            // shift element right one slot
            data[ moveItem ] = data[ moveItem - 1 ];
            moveItem--;
         } // end while

         data[ moveItem ] = insert; // place inserted element
         printPass( next, moveItem ); // output pass of algorithm
      } // end for
   } // end method sort

   // print a pass of the algorithm
   public void printPass( int pass, int index )
   {
      System.out.print( String.format( "after pass %2d: ", pass ) );

      // output elements till swapped item
      for ( int i = 0; i < index; i++ )
         System.out.print( data[ i ] + "  " );

      System.out.print( data[ index ] + "* " ); // indicate swap

      // finish outputting array
      for ( int i = index + 1; i < data.length; i++ )
         System.out.print( data[ i ] + "  " );
     
      System.out.print( "\n               " ); // for alignment

      // indicate amount of array that is sorted
      for( int i = 0; i <= pass; i++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // add endline
   } // end method printPass

   // method to output values in array
   public String toString()
   {
      return Arrays.toString( data );
   } // end method toString
} // end class InsertionSort


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