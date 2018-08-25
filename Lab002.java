
import java.util.*;

public class Lab002 {
public static void main ( String args[ ] ) {
   Scanner in = new Scanner ( System.in );


   System.out.print ( "Enter your email address: " );
   String email = in.nextLine ( );
   
   System.out.println ( "Enter your postal address: ");
   String postalAddress = in.nextLine ( );
   
   String output = email + " " + postalAddress;
   
   System.out.println (output);
   
 }
}