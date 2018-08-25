import java.util.Scanner;
import java.text.DecimalFormat;

public class Include

{
public static void main(String args[])
{
    
    Scanner input = new Scanner(System.in);
    int i, sum = 0;
    
    System.out.println("Enter a number: ");
    int a = input.nextInt();
    
    System.out.println("Enter a number: ");
    int b = input.nextInt();
    
    for (i = 0; a <= b; a++) 
    {
            if(a % 2 == 1)
            sum += a;
            
            
            
    }
    System.out.println(sum);
    
     
}
}