// Fig. 19.3.: LinearSearchTest.java
// Sequentially search an array for an item.
import java.util.Scanner;

public class LinearSearchTest
{
   public static void main( String[] args )
   {
      // create Scanner object to input data
      Scanner input = new Scanner( System.in );

      int searchInt; // search key
      int position; // location of search key in array

      // create array and output it
      LinearArray searchArray = new LinearArray( 10 );
      System.out.println( searchArray + "\n" ); // print array

      // get input from user
      System.out.print( 
         "Please enter an integer value (-1 to quit): " );
      searchInt = input.nextInt(); // read first int from user

      // repeatedly input an integer; -1 terminates the program
      while ( searchInt != -1 )
      {
         // perform linear search
         position = searchArray.linearSearch( searchInt );

         if ( position == -1 ) // integer was not found
            System.out.println( "The integer " + searchInt + 
               " was not found.\n" );
         else // integer was found
            System.out.println( "The integer " + searchInt + 
               " was found in position " + position + ".\n" );

         // get input from user
         System.out.print( 
            "Please enter an integer value (-1 to quit): " );
         searchInt = input.nextInt(); // read next int from user
      } // end while
   } // end main
} // end class LinearSearchTest


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