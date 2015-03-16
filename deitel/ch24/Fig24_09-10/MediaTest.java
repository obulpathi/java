// Fig. 24.10: MediaTest.java
// A simple media player
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MediaTest
{
   // launch the application
   public static void main( String[] args )
   {
      // create a file chooser
      JFileChooser fileChooser = new JFileChooser();
      
      // show open file dialog
      int result = fileChooser.showOpenDialog( null );

      if ( result == JFileChooser.APPROVE_OPTION ) // user chose a file
      {
         URL mediaURL = null;
         
         try
         {
            // get the file as URL
            mediaURL = fileChooser.getSelectedFile().toURI().toURL();
         } // end try
         catch ( MalformedURLException malformedURLException )
         {
            System.err.println( "Could not create URL for the file" );
         } // end catch

         if ( mediaURL != null ) // only display if there is a valid URL
         {
            JFrame mediaTest = new JFrame( "Media Tester" );
            mediaTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            
            MediaPanel mediaPanel = new MediaPanel( mediaURL );
            mediaTest.add( mediaPanel );
            
            mediaTest.setSize( 300, 300 );
            mediaTest.setVisible( true );
         } // end inner if
      } // end outer if
   } // end main
} // end class MediaTest

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
