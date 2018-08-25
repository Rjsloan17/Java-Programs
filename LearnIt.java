import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LearnIt

{
public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    DecimalFormat ft = new DecimalFormat("#.##");
    
    System.out.println("Enter a value for x: ");
    double x = input.nextDouble();
    
    double answer = (1 + x + Math.pow(x,2)/2 + Math.pow(x,3)/6 + Math.pow(x,4)/24);
    
    System.out.println(ft.format(answer));
    
    
}
}
