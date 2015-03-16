// Fig. K.1: Time.java
// Time class declaration with set and get methods.
package com.deitel; // place Time in a package

/**
 * This class maintains the time in 24-hour format.
 * @see java.lang.Object
 * @author Deitel & Associates, Inc.
 */
public class Time
{
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   /** 
    * Time no-argument constructor initializes each instance variable 
    * to zero. This ensures that Time objects start in a consistent 
    * state. @throws Exception In the case of an invalid time
    */
   public Time() throws Exception
   {
      this( 0, 0, 0 ); // invoke Time constructor with three arguments
   } // end no-argument Time constructor

   /** 
    * Time constructor
    * @param h the hour
    * @throws Exception In the case of an invalid time
    */
   public Time( int h ) throws Exception
   { 
      this( h, 0, 0 ); // invoke Time constructor with three arguments
   } // end one-argument Time constructor

   /** 
    * Time constructor
    * @param h the hour
    * @param m the minute
    * @throws Exception In the case of an invalid time
    */
   public Time( int h, int m ) throws Exception
   { 
      this( h, m, 0 ); // invoke Time constructor with three arguments
   } // end two-argument Time constructor 

   /** 
    * Time constructor
    * @param h the hour
    * @param m the minute
    * @param s the second
    * @throws Exception In the case of an invalid time
    */
   public Time( int h, int m, int s ) throws Exception
   { 
      setTime( h, m, s ); // invoke setTime to validate time
   } // end three-argument Time constructor 

   /** 
    *  Time constructor
    *  @param time A Time object with which to initialize
    *  @throws Exception In the case of an invalid time
    */
   public Time( Time time ) throws Exception
   {
      // invoke Time constructor with three arguments
      this( time.getHour(), time.getMinute(), time.getSecond() );
   } // end Time constructor with Time argument

   /**
    *  Set a new time value using universal time. Perform 
    *  validity checks on the data. Set invalid values to zero.
    *  @param h the hour
    *  @param m the minute 
    *  @param s the second
    *  @see com.deitel.jhtp6.appenH.Time#setHour
    *  @see Time#setMinute
    *  @see #setSecond
    *  @throws Exception In the case of an invalid time
    */
   public void setTime( int h, int m, int s ) throws Exception
   {
      setHour( h );   // set the hour
      setMinute( m ); // set the minute
      setSecond( s ); // set the second
   } // end method setTime

   /**
    *  Sets the hour.
    *  @param h the hour
    *  @throws Exception In the case of an invalid time
    */
   public void setHour( int h ) throws Exception
   { 
      if ( h >= 0 && h < 24 ) 
         hour = h;
      else 
         throw( new Exception() );
   } // end method setHour

   /**
    *  Sets the minute.
    *  @param m the minute
    *  @throws Exception In the case of an invalid time
    */
   public void setMinute( int m ) throws Exception
   {
      if ( m >= 0 && m < 60 ) 
         minute = m;
      else 
         throw( new Exception() );
   } // end method setMinute

   /**
    *  Sets the second.
    *  @param s the second.
    *  @throws Exception In the case of an invalid time
    */
   public void setSecond( int s ) throws Exception
   { 
      if ( s >= 0 && s < 60 ) 
         second = s;
      else 
         throw( new Exception() );
   } // end method setSecond

   /**
    *  Gets the hour.
    *  @return an <code>integer</code> specifying the hour.
    */
   public int getHour() 
   { 
      return hour; 
   } // end method getHour

   /**
    *  Gets the minute.
    *  @return an <code>integer</code> specifying the minute.
    */
   public int getMinute() 
   { 
      return minute; 
   } // end method getMinute

   /**
    *  Gets the second.
    *  @return an <code>integer</code> specifying the second.
    */
   public int getSecond() 
   { 
      return second; 
   } // end method getSecond

   /**
    *  Convert to String in universal-time format
    *  @return a <code>String</code> representation 
    *  of the time in universal-time format
    */   
   public String toUniversalString()
   {
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   /** 
    *  Convert to String in standard-time format
    *  @return a <code>String</code> representation 
    *  of the time in standard-time format
    */   
   public String toStandardString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } // end method toStandardString
} // end class Time

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
