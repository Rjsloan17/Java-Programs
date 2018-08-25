import java.util.Scanner;

public class Lab5_11
{
        public static void main ( String args[ ] )
  
{
      Scanner in = new Scanner ( System.in );
   
      System.out.println ("Enter a letter grade: ");
      String input = in.nextLine();
   
      if (input.equals("A"))
      {
         System.out.println ( "Excellent" );
      }//end if statement
      else if (input.equals ("B")) 
      {
         System.out.println ( "Good" );
      }//end else block
      else if (input.equals("C"))
      {
         System.out.println ( "You can do better!" );
      }//end else block
      else if (input.equals ("D")) 
      {
          System.out.println("I'm afraid that's not good");
      }
        else if (input.equals ("F")) 
      {
          System.out.println("I'm afraid that's not good");
      }
      else{
              System.out.println ( "Input Error!" );
              }
   }
}