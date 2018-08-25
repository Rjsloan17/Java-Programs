import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class theWorld

{
public static void main(String[] args)
{

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for x: ");
    double x = input.nextDouble();
    
    System.out.print("Enter a value for y: ");
    double y = input.nextDouble();
    
    System.out.print("Enter a value for z: ");
    double z = input.nextDouble();
    
    if( x == y && x == z)
    {
        System.out.println("All Equal");
    }
    
    else if( x == y && x != z )
    {
        System.out.println("Neither");
    }
    else if( y == z && y != x )
    {
        System.out.println("Neither");
    }
    else if( z == x && z != y )
    {
        System.out.println("Neither");
    }
    else
    {
        System.out.println("all different");
    }
    




}
}