import java.util.Scanner;
import java.text.DecimalFormat;

public class Five

{
public static void main(String args[])
{
    
    
    for ( int p = 0; p < 21; p++)
    
        System.out.println("The power of 2 to the " + p + "th power is " + Math.pow(2,p));
    
     int s;
     int sum = 0;
     for ( s = 0; s <= 100 ; s++)
     {
           if (s % 2 == 0)
           {
            sum += s;
            }
    
     }
    System.out.println("The sum of all even numbers is: " + sum);
}
}