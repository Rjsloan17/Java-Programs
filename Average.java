import java.util.*;
public class Average
{
public static void main ( String args[ ] )
{
Scanner in = new Scanner ( System.in );



System.out.print ( "Enter first DOUBLE: " );
double y = in.nextDouble ( );
System.out.println ( "You entered: " + y );

System.out.print ( "Enter second DOUBLE: " );
double x = in.nextDouble ( );
System.out.println ( "You entered: " + x );


System.out.println("The average is " + (y+x)/2);
        

  }
}