import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class testYour

{
public static void main(String[] args)
{

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for x: ");
    double x = input.nextDouble();
    
    double exponent = 1 + x + Math.pow(x, 2)/2
    + Math.pow(x, 3)/6 + Math.pow(x, 4)/24;
    
    System.out.println("The expression equals: " + exponent);

    System.out.println("Enter a number");
    double number = input.nextDouble();
    
    if( number > 0)
    {
        System.out.println("Positive Number");
    }
    else if (number < 0)
    {
        System.out.println("Negative Number");
    }
    else 
    {
        System.out.println("Zero");
    }




}
}
