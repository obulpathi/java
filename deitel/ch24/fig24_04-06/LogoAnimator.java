// Fig. 21.3: LogoAnimator.java
// Displaying animated images on a JFrame.
import javax.swing.JFrame;

public class LogoAnimator 
{
   // execute animation in a JFrame
   public static void main( String args[] )
   {
      LogoAnimatorJPanel animation = new LogoAnimatorJPanel(); 

      JFrame window = new JFrame( "Animator test" ); // set up window
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.add( animation ); // add panel to frame

      window.pack();  // make window just large enough for its GUI
      window.setVisible( true );   // display window

      animation.startAnimation();  // begin animation
   } // end main
} // end class LogoAnimator

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
