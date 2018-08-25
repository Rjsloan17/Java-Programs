import java.util.Scanner;

public class Lab4
{
   public static void main ( String args[ ] )
   {
      Scanner in = new Scanner ( System.in );
   
      System.out.println ("Enter an integer");
      int input = in.nextInt();
   
      if ( input < 0 )
      {
         System.out.println ( "Negative Number" );
      }//end if statement
      else if (input == 0) 
      {
         System.out.println ( "Number is Zero" );
      }//end else block
      else if (input > 0)
      {
         System.out.println ( "Positive" );
      }//end else block

   }
}