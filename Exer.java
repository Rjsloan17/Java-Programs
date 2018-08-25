import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer

{
public static void main(String args[])
{

Scanner input = new Scanner(System.in);

System.out.println("Enter a number: ");
int n = input.nextInt();
double x = 0; 
double s = 0.011; 


while (s > 0.01)
    { 
        s = 1.0/ (1 + n * n); 
        n++; 
        x = x + s; 
        System.out.println(x);
    } 


 
}    
}