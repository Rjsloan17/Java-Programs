
import java.util.*;
public class Lab3_1
{
public static void main( String args[] )
{
    Scanner in = new Scanner(System.in);

    System.out.println ("Please enter a phrase with 3 words repeated:");
    String s = in.nextLine();
    
    System.out.print("Enter the word that is repeated:");
    String word = in.nextLine();
    
    System.out.print("Enter a string:");
    String str1 = in.nextLine();

    s = s.replaceAll(word, str1);
    System.out.println("\n" + s);

   

   
}
}