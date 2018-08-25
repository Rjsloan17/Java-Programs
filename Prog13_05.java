//Program 13_05 - Formatting output with printf
import java.util.*;
public class Prog13_05
{
    public static void main( String args[] )
    {
    Scanner in = new Scanner ( System.in );

        System.out.println ( "Enter your name, age and the value of PI: " );

        String name = in.nextLine ( );
        int age = in.nextInt ( );
        double pi= in.nextDouble ( );

        String s = String.format ( "\nHello %s, you are %d and PI = %5.2f\n", name, age, pi );
        
        System.out.print ( s );
    }
}