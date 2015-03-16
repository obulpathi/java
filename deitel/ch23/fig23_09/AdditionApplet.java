// Fig. 23.9: AdditionApplet.java
// Applet that adds two double values entered via input dialogs.
import java.awt.Graphics; // program uses class Graphics
import javax.swing.JApplet; // program uses class JApplet
import javax.swing.JOptionPane; // program uses class JOptionPane

public class AdditionApplet extends JApplet 
{
   private double sum; // sum of values entered by user

   // initialize applet by obtaining values from user
   public void init()
   {
      // obtain first number from user
      String firstNumber = JOptionPane.showInputDialog(
         "Enter first floating-point value" );

      // obtain second number from user
      String secondNumber = JOptionPane.showInputDialog(
         "Enter second floating-point value" );

      // convert numbers from type String to type double
      double number1 = Double.parseDouble( firstNumber ); 
      double number2 = Double.parseDouble( secondNumber );

      sum = number1 + number2; // add numbers
   } // end method init

   // draw results in a rectangle on applet’s background
   public void paint( Graphics g )
   {
      super.paint( g ); // call superclass version of method paint

      // draw rectangle starting from (15, 10) that is 270 
      // pixels wide and 20 pixels tall
      g.drawRect( 15, 10, 270, 20 );

      // draw results as a String at (25, 25)
      g.drawString( "The sum is " + sum, 25, 25 );
   } // end method paint
} // end class AdditionApplet

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
