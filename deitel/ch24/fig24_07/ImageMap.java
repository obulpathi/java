// Fig. 24.7: ImageMap.java
// Image map.
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class ImageMap extends JApplet 
{
   private ImageIcon mapImage;

   private static final String[] captions = { "Common Programming Error",
      "Good Programming Practice", "Look-and-Feel Observation", 
      "Performance Tip", "Portability Tip", 
      "Software Engineering Observation", "Error-Prevention Tip" };

   // sets up mouse listeners
   public void init()
   {
      addMouseListener(

         new MouseAdapter() // anonymous inner class
         { 
            // indicate when mouse pointer exits applet area
            public void mouseExited( MouseEvent event )
            {
               showStatus( "Pointer outside applet" );
            } // end method mouseExited
         } // end anonymous inner class
      ); // end call to addMouseListener

      addMouseMotionListener(

         new MouseMotionAdapter() // anonymous inner class
         { 
            // determine icon over which mouse appears
            public void mouseMoved( MouseEvent event )
            {
               showStatus( translateLocation(
                  event.getX(), event.getY() ) );
            } // end method mouseMoved
         } // end anonymous inner class
      ); // end call to addMouseMotionListener

      mapImage = new ImageIcon( getClass().getResource( "icons.png" ) );
   } // end method init

   // display mapImage
   public void paint( Graphics g )
   {
      super.paint( g );
      mapImage.paintIcon( this, g, 0, 0 );
   } // end method paint

   // return tip caption based on mouse coordinates
   public String translateLocation( int x, int y )
   {
      // if coordinates outside image, return immediately
      if ( x >= mapImage.getIconWidth() || y >= mapImage.getIconHeight() ) 
         return "";

      // determine icon number (0 - 6)
      double iconWidth = ( double ) mapImage.getIconWidth() / 7.0;
      int iconNumber = ( int )( ( double ) x / iconWidth );

      return captions[ iconNumber ]; // return appropriate icon caption
   } // end method translateLocation
} // end class ImageMap

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
