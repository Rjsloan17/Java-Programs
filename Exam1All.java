import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exam1All
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    
    int i;
    for( i = 0; i <= 21; i++ )
    {
        System.out.println("2 to the power of " + i + " equals " + Math.pow(2, i));
    }
    
    int a;
    int sum = 0;
    for( a = 2; a <= 100; a++ )
    if(a % 2 == 0 )
    sum += a;
            {
                System.out.println(sum);
            }
    
    System.out.println("Enter a number: ");
    int b = input.nextInt();
    
    System.out.println("Enter a second number: ");
    int c = input.nextInt();
    int sum1 = 0;
    for( i = b; i <= c; i++)
    if( i % 2 == 1 )
    sum1 += i;
    {
        System.out.println(sum1);
    }
    
    
}
}