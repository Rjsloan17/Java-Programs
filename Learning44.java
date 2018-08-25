import java.util.Scanner;
import java.util.*;

public class Learning44

{
    public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    
    
    int x = input.nextInt();
    
    if (x > 0)
    {
        System.out.println("Positive Number");
    }
    else if (x == 0)
    {
        System.out.println("Zero");
    }
    else
    {
        System.out.println("Negative");
    }


}
}