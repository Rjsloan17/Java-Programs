import java.util.Scanner;

public class BreakIf
{
    public static void main(String args[])
    
    {
    Scanner in = new Scanner(System. in);
    
    for (int i = 1; i <= 10; i++)
    {
        System.out.print(i + ") Enter a number: ");
 double x = in.nextDouble();
 
 if (x < 0) continue;
    
    System.out.print("sqrt(" + ")=" + Math.sqrt(x));
    }
    
    }
    
    
    
    
    
    
    
    
    
}