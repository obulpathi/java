// Fig. 23.6: WelcomeApplet.java
// Applet that draws a String.
import java.awt.Graphics;   // program uses class Graphics
import javax.swing.JApplet; // program uses class JApplet

public class WelcomeApplet extends JApplet   
{
   // draw text on applet's background
   public void paint( Graphics g )
   {
      // call superclass version of method paint
      super.paint( g );

      // draw a String at x-coordinate 25 and y-coordinate 25
      g.drawString( "Welcome to Java Programming!", 25, 25 );
   } // end method paint
} // end class WelcomeApplet

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
