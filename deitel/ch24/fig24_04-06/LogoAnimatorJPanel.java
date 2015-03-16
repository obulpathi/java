// Fig. 21.4: LogoAnimatorJPanel.java
// Animating a series of images.
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.jnlp.FileContents;
import javax.jnlp.FileOpenService;
import javax.jnlp.ServiceManager;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LogoAnimatorJPanel extends JPanel 
{
   protected ImageIcon images[]; // array of images
   private int currentImage = 0; // current image index
   private final int ANIMATION_DELAY = 50; // millisecond delay
   private int width; // image width
   private int height; // image height

   private Timer animationTimer; // Timer drives animation

   // constructor initializes LogoAnimatorJPanel by loading images
   public LogoAnimatorJPanel()
   {
      try
      {
         // get reference to FileOpenService
         FileOpenService fileOpenService = 
            (FileOpenService) ServiceManager.lookup(
               "javax.jnlp.FileOpenService" );

         // display dialog that allows user to select multiple files
         FileContents[] contents =
            fileOpenService.openMultiFileDialog( null, null );

         // create array to store ImageIcon references
         images = new ImageIcon[ contents.length ]; 

         // load the selected images
         for ( int count = 0; count < images.length; count++ )
         {
            // create byte array to store an image's data
            byte[] imageData =
                new byte[ (int) contents[ count ].getLength() ];

            // get image's data and create image
            contents[ count ].getInputStream().read( imageData );
            images[ count ] = new ImageIcon( imageData );
         } // end for

         // this example assumes all images have the same width and height
         width = images[ 0 ].getIconWidth();   // get icon width
         height = images[ 0 ].getIconHeight(); // get icon height
      } // end try
      catch( Exception e )
      {
         e.printStackTrace();
      } // end catch
   } // end LogoAnimatorJPanel constructor

   // display current image 
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // call superclass paintComponent

      images[ currentImage ].paintIcon( this, g, 0, 0 );
      
      // set next image to be drawn only if Timer is running
      if ( animationTimer.isRunning() )  
         currentImage = ( currentImage + 1 ) % images.length;
   } // end method paintComponent

   // start animation, or restart if window is redisplayed
   public void startAnimation()
   {
      if ( animationTimer == null ) 
      {
         currentImage = 0; // display first image

         // create timer
         animationTimer = 
            new Timer( ANIMATION_DELAY, new TimerHandler() );

         animationTimer.start(); // start Timer
      } // end if
      else // animationTimer already exists, restart animation
      {
         if ( ! animationTimer.isRunning() )
            animationTimer.restart();
      } // end else
   } // end method startAnimation

   // stop animation Timer
   public void stopAnimation()
   {
      animationTimer.stop();
   } // end method stopAnimation

   // return minimum size of animation
   public Dimension getMinimumSize()
   { 
      return getPreferredSize(); 
   } // end method getMinimumSize

   // return preferred size of animation
   public Dimension getPreferredSize()
   {
      return new Dimension( width, height );
   } // end method getPreferredSize

   // inner class to handle action events from Timer
   private class TimerHandler implements ActionListener 
   {
      // respond to Timer's event
      public void actionPerformed( ActionEvent actionEvent )
      {
         repaint(); // repaint animator
      } // end method actionPerformed
   } // end class TimerHandler
} // end class LogoAnimatorJPanel

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
