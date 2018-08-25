 import java.util.Scanner;

public class NewEmpty
{
   public static void main ( String args[ ] )
   {
      Scanner in = new Scanner ( System.in );
   
      System.out.println ("Enter the year you were born: ");
      int input = in.nextInt();
   
      if ( input < 1990 )
      {
         System.out.println ( "Born before 90s" );
      }//end if statement
      else if (input <= 1999) 
      {
         System.out.println ( "In the 90s" );
      }//end else block
      else if (input >= 2000)
      {
         System.out.println ( "2000s" );
      }//end else block

   }
}