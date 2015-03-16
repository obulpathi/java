// Fig. J.1: SplashDemo.java
// Splash screen demonstration.
public class SplashDemo
{
   public static void main( String[] args )
   {
      try
      {
         Thread.sleep( 5000 );
      } // end try
      catch ( InterruptedException e )
      {
         e.printStackTrace();
      } // end catch

      System.out.println( 
         "This was the splash screen demo." );
   } // end method main
} // end class SplashDemo

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
 **************************************************************************/