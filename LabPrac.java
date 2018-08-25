
import java.util.Scanner;
import java.text.DecimalFormat;

public class LabPrac

{
public static void main(String args[])
{

    Scanner input = new Scanner(System.in);
    int x = 0;
    int sum = 0, dupNum;
    
    
    do
    {
        dupNum = x;
        System.out.println("Enter a number that is between 0 and 100: ");
        x = input.nextInt();
        sum += x;
    }
    while( x != 0 && dupNum != x );
    
    System.out.println(sum);
}
}