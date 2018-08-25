import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumberGame

{
public static void main(String[] args)
{

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    if( number > 30 )
    
    {
        System.out.println("Greater than 30");
    }
    else if (number >= 20 && number <= 30)
    {
        System.out.println("In the \" 20, 30 \" range");
    }
    else
    {
        System.out.println("Less than 20");
    }
    
}
}