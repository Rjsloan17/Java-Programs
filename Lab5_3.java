import java.util.Scanner;

public class Lab5_3
{
        public static void main ( String args[ ] )
  
{
      Scanner in = new Scanner ( System.in );
   
      System.out.println ("Pick one of the following objects: Circle, Square, Rectangle, or Exit: ");
      String input = in.nextLine();
   
      if (input.equals("Circle"))
      {
         System.out.println ( "Enter the radius of the Circle: " );
         double radius = in.nextDouble();
         System.out.println("Your area is: " + Math.PI*Math.pow(radius, 2));
      }//end if statement
      else if (input.equals ("Square")) 
      {
         System.out.println ( "Enter the base of the Square: " );
         double base = in.nextDouble();
         System.out.println("The area of the Square is: " + Math.pow(base, 2));
      }//end else block
      else if (input.equals("Rectangle"))
      {
         System.out.println ( "Enter the length" );
         double length = in.nextDouble();
         System.out.println("Now enter the width");
         double width = in.nextDouble();
         System.out.println("The area of the Rectangle is:  " + width*length);
      }//end else block
      else if (input.equals ("Exit")) 
      {
          System.out.println("You have now exited! Goodbye!");
      }
       
   }
}