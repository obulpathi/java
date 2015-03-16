// Fig. 21.1: LoadImageAndScale.java
// Loading, displaying and scaling an image in an applet
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.jnlp.FileContents;
import javax.jnlp.FileOpenService;
import javax.jnlp.ServiceManager;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoadImageAndScale extends JApplet 
{   
   private ImageIcon image; // references image to display
   private JPanel scaleJPanel; // JPanel containing the scale-selector
   private JLabel percentJLabel; // label for JTextField
   private JTextField scaleInputJTextField; // obtains user’s input
   private JButton scaleChangeJButton; // initiates scaling of image
   private double scaleValue = 1.0;  //scale percentage for image

   // load image when applet is loaded
   public void init()
   {
      scaleJPanel = new JPanel();
      percentJLabel = new JLabel( "scale percent:" );
      scaleInputJTextField = new JTextField( "100" );
      scaleChangeJButton = new JButton( "Set Scale" );

      // add components and place scaleJPanel in applet's NORTH region
      scaleJPanel.add( percentJLabel ); 
      scaleJPanel.add( scaleInputJTextField );
      scaleJPanel.add( scaleChangeJButton );
      add( scaleJPanel, BorderLayout.NORTH );

      // register event handler for scaleChangeJButton
      scaleChangeJButton.addActionListener(
         new ActionListener()
         {
            // when the JButton is pressed, set scaleValue and repaint
            public void actionPerformed( ActionEvent e ) 
            {
               scaleValue = Double.parseDouble( 
                  scaleInputJTextField.getText() ) / 100.0;
               repaint(); // causes image to be redisplyed at new scale
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      // use JNLP services to open an image file that the user selects
      try
      {
         // get a reference to the FileOpenService
         FileOpenService fileOpenService = 
            (FileOpenService) ServiceManager.lookup( 
               "javax.jnlp.FileOpenService" );

         // get file's contents from the FileOpenService
         FileContents contents = 
            fileOpenService.openFileDialog( null, null );

         // byte array to store image's data
         byte[] imageData = new byte[ (int) contents.getLength() ];
         contents.getInputStream().read( imageData ); // read image bytes
         image = new ImageIcon( imageData ); // create the image

         // if image successfully loaded, create and add DrawJPanel
         add( new DrawJPanel(), BorderLayout.CENTER );
      } // end try
      catch( Exception e )
      {
         e.printStackTrace();
      } // end catch
   } // end method init

   // DrawJPanel used to display loaded image
   private class DrawJPanel extends JPanel
   {
      // display image
      public void paintComponent( Graphics g )
      {
         super.paintComponent( g );

         // the following values are used to center the image
         double spareWidth = 
            getWidth() - scaleValue * image.getIconWidth();
         double spareHeight = 
            getHeight() - scaleValue * image.getIconHeight();

         // draw image with scaled width and height
         g.drawImage( image.getImage(), 
            (int) ( spareWidth ) / 2, (int) ( spareHeight ) / 2,
            (int) ( image.getIconWidth() * scaleValue ),
            (int) ( image.getIconHeight() * scaleValue ), this );
      } // end method paint
   } // end class DrawJPanel
} // end class LoadImageAndScale


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
