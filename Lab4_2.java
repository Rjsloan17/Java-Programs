import java.util.Scanner;

public class Lab4_2
{
   public static void main ( String args[ ] )
   {
      Scanner in = new Scanner ( System.in );
   
      System.out.println ("Enter an integer");
      int input = in.nextInt();
   
      if ( input < 20 )
      {
         System.out.println ( "Less than 20" );
      }//end if statement
      else if (input >= 20 && input <= 30) 
      {
         System.out.println ( "In the [20, 30] range" );
      }//end else block
      else if (input > 30)
      {
         System.out.println ( "Greater than 30" );
      }//end else block

   }
}