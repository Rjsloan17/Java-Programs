import java.util.Scanner;

public class Lab4_4
{
   public static void main ( String args[ ] )
   {
      
        Scanner in = new Scanner ( System.in );
   
      System.out.println ("Enter a degree");
      int input = in.nextInt();
   
      if ( input == 0 || input == 360 )
      {
         System.out.println ( "North" );
      }
      
      else if ( input <= 33) 
      {
         System.out.println ( "North" );
      }
      
      else if ( input <= 56)
      {        
      System.out.println ("North East");
      }
    
      else if (input <= 112)
      {        
      System.out.println ("East");

   }
      
     else if (input <= 168)
      {        
      System.out.println ("South East");

   }
      else if (input <= 202)
      {        
      System.out.println ("South");

   }
       else if (input <= 247 )
      {        
      System.out.println ("South West");
      }
       
       
       else if (input <= 292 )     
       {        
      System.out.println ("West");

       }
    
       else if (input <=  326 )
      {        
      System.out.println ("North West");

   }
      else if (input <=  359 )
      {        
      System.out.println ("North");

   }
      {
      System.out.print("Enter a number: ");
      }
   }
   
}
   
   