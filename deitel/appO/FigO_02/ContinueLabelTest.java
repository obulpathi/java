 Fig. O.2 ContinueLabelTest.java
 Labeled continue statement terminating a nested for statement.
public class ContinueLabelTest 
{
   public static void main( String[] args )
   {
      nextRow  target label of continue statement

          count 5 rows
         for ( int row = 1; row = 5; row++ ) 
         {
            System.out.println();  outputs a newline
  
             count 10 columns per row
            for ( int column = 1; column = 10; column++ ) 
            {
                if column greater than row, start next row
               if ( column  row )
                  continue nextRow;  next iteration of labeled loop
   
               System.out.print(   );
            }  end inner for
         }  end outer for

      System.out.println();  outputs a newline
   }  end main
}  end class ContinueLabelTest
