// Fig. 22.18: TreeTest.java
// Binary tree test program.
import java.util.Random;
import com.deitel.ch22.Tree;

public class TreeTest 
{
   public static void main( String[] args )
   {
      Tree< Integer > tree = new Tree< Integer >();
      int value;
      Random randomNumber = new Random();

      System.out.println( "Inserting the following values: " );

      // insert 10 random integers from 0-99 in tree 
      for ( int i = 1; i <= 10; i++ ) 
      {
         value = randomNumber.nextInt( 100 );
         System.out.printf( "%d ", value );
         tree.insertNode( value );
      } // end for

      System.out.println ( "\n\nPreorder traversal" );
      tree.preorderTraversal(); // perform preorder traversal of tree

      System.out.println ( "\n\nInorder traversal" );
      tree.inorderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPostorder traversal" );
      tree.postorderTraversal(); // perform postorder traversal of tree
      System.out.println();
   } // end main
} // end class TreeTest


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
