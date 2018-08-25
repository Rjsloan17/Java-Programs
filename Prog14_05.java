import java.util.Scanner;

public class Prog14_05
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two words separated by one space: ");
        String s1 = in.nextLine();
        System.out.println("You entered: " + s1);
        
        System.out.print("Enter two words separated by one space: ");
        String s2 = in.next();
        System.out.println("You entered: " + s2);
        
        System.out.println("");
    }
}