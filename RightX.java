import java.util.Scanner;

public class RightX

{
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a value for x: ");
  double x = input.nextDouble();
  
  double exponent = (1 + x + Math.pow(x,2)/2 + Math.pow(x,3)/6 + Math.pow(x,4)/24 );
  
    System.out.println(exponent);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}        
}