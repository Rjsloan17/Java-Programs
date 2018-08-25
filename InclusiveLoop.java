import java.util.Scanner;

public class InclusiveLoop
{
public static void main(String args[])
{
    int sum = 0;
Scanner input = new Scanner(System.in); 
 System.out.print("Enter first input: "); 
 int a = input.nextInt(); 
 System.out.print("Enter your second input: "); 
 int b = input.nextInt(); 

 for (int i = a; i <= b; i++) 
 { 
     if (i % 2 == 1) 
     
     sum = sum + i;
 } 
 System.out.println("Odd number sum: " + sum); 
}
}