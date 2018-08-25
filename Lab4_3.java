import java.util.Scanner;

public class Lab4_3
{
   public static void main ( String args[ ] )
   {
      Scanner in = new Scanner ( System.in );
   
      System.out.println ("Enter an integer");
      int input = in.nextInt();
      
      System.out.println ("Enter an integer");
      int input2 = in.nextInt();
      
      System.out.println ("Enter an integer");
      int input3 = in.nextInt();
      
   
      if ( input == input2 && input == input3) 
      { 
          System.out.println ( "All the same" );
      }
      else if ( input != input2 && input != input3 && input2 != input3) 
      {
          System.out.println ( "All are different" );
      }
      else{
              System.out.println ( "Neither all the same or different" );
              }
              
   }
}
      
