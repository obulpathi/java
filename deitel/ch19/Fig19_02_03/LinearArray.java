// Fig. 19.2: LinearArray.java
// Class that contains an array of random integers and a method 
// that will search that array sequentially.
import java.util.Random;
import java.util.Arrays;

public class LinearArray
{
   private int[] data; // array of values
   private static final Random generator = new Random();

   // create array of given size and fill with random integers
   public LinearArray( int size )
   {
      data = new int[ size ]; // create space for array

      // fill array with random ints in range 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // end LinearArray constructor

   // perform a linear search on the data
   public int linearSearch( int searchKey )
   {
      // loop through array sequentially
      for ( int index = 0; index < data.length; index++ )
         if ( data[ index ] == searchKey )
            return index; // return index of integer

      return -1; // integer was not found      
   } // end method linearSearch

   // method to output values in array
   public String toString()
   {
      return Arrays.toString( data );
   } // end method toString
} // end class LinearArray


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