// Fig. 24.5: LoadAudioAndPlay.java
// Load an audio clip and play it.
import java.applet.AudioClip;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class LoadAudioAndPlay extends JApplet 
{
   private AudioClip sound1, sound2, currentSound;  
   private JButton playJButton, loopJButton, stopJButton;
   private JComboBox soundJComboBox;

   // load the audio when the applet begins executing
   public void init()
   {
      setLayout( new FlowLayout() );

      String[] choices = { "Welcome", "Hi" };
      soundJComboBox = new JComboBox( choices ); // create JComboBox

      soundJComboBox.addItemListener(

         new ItemListener() // anonymous inner class
         {
            // stop sound and change sound to user's selection
            public void itemStateChanged( ItemEvent e )
            {
               currentSound.stop();
               currentSound = soundJComboBox.getSelectedIndex() == 0 ? 
                  sound1 : sound2;
            } // end method itemStateChanged
         } // end anonymous inner class
      ); // end addItemListener method call

      add( soundJComboBox ); // add JComboBox to applet

      // set up button event handler and buttons
      ButtonHandler handler = new ButtonHandler();

      // create Play JButton
      playJButton = new JButton( "Play" );
      playJButton.addActionListener( handler );
      add( playJButton );

      // create Loop JButton
      loopJButton = new JButton( "Loop" );
      loopJButton.addActionListener( handler );
      add( loopJButton );

      // create Stop JButton
      stopJButton = new JButton( "Stop" );
      stopJButton.addActionListener( handler );
      add( stopJButton );

      // load sounds and set currentSound
      sound1 = getAudioClip( getDocumentBase(), "welcome.wav" );
      sound2 = getAudioClip( getDocumentBase(), "hi.au" );
      currentSound = sound1;
   } // end method init

   // stop the sound when the user switches web pages
   public void stop()
   {
      currentSound.stop(); // stop AudioClip
   } // end method stop

   // private inner class to handle button events
   private class ButtonHandler implements ActionListener 
   {
      // process play, loop and stop button events
      public void actionPerformed( ActionEvent actionEvent )
      {
         if ( actionEvent.getSource() == playJButton ) 
            currentSound.play(); // play AudioClip once
         else if ( actionEvent.getSource() == loopJButton ) 
            currentSound.loop(); // play AudioClip continuously
         else if ( actionEvent.getSource() == stopJButton ) 
            currentSound.stop(); // stop AudioClip
      } // end method actionPerformed
   } // end class ButtonHandler
} // end class LoadAudioAndPlay

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
