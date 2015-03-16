// Fig. 19.6: SelectionSort.java
// Class that creates an array filled with random integers.  
// Provides a method to sort the array with selection sort.
import java.util.Arrays;
import java.util.Random;

public class SelectionSort
{
   private int[] data; // array of values
   private static final Random generator = new Random();

   // create array of given size and fill with random integers
   public SelectionSort( int size )
   {
      data = new int[ size ]; // create space for array

      // fill array with random ints in range 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // end SelectionSort constructor

   // sort array using selection sort
   public void sort()
   {
      int smallest; // index of smallest element

      // loop over data.length - 1 elements
      for ( int i = 0; i < data.length - 1; i++ )
      {
         smallest = i; // first index of remaining array

         // loop to find index of smallest element
         for ( int index = i + 1; index < data.length; index++ )
            if ( data[ index ] < data[ smallest ] )
               smallest = index;

         swap( i, smallest ); // swap smallest element into position
         printPass( i + 1, smallest ); // output pass of algorithm
      } // end outer for
   } // end method sort

   // helper method to swap values in two elements
   public void swap( int first, int second )
   {
      int temporary = data[ first ]; // store first in temporary
      data[ first ] = data[ second ]; // replace first with second
      data[ second ] = temporary; // put temporary in second
   } // end method swap

   // print a pass of the algorithm
   public void printPass( int pass, int index )
   {
      System.out.print( String.format( "after pass %2d: ", pass ) );

      // output elements till selected item
      for ( int i = 0; i < index; i++ )
         System.out.print( data[ i ] + "  " );

      System.out.print( data[ index ] + "* " ); // indicate swap

      // finish outputting array
      for ( int i = index + 1; i < data.length; i++ )
         System.out.print( data[ i ] + "  " );
     
      System.out.print( "\n               " ); // for alignment

      // indicate amount of array that is sorted
      for( int j = 0; j < pass; j++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // add endline
   } // end method printPass

   // method to output values in array
   public String toString()
   {
      StringBuilder temporary = new StringBuilder();

      // iterate through array
      for ( int element : data )
         temporary.append( element + "  " );

      temporary.append( "\n" ); // add endline character
      return Arrays.toString( data );
   } // end method toString
} // end class SelectionSort


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