import java.util.Scanner;

public class w3Resource

{
public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    for(int i=1;i<=10; i++)
    {
        System.out.println( number + " x " + i + " = " + number*i);
    }
    
    System.out.print("Enter a number: ");
    double randomNum = input.nextDouble();
    System.out.print("Enter a number: ");
    double randomNum1 = input.nextDouble();
    
    System.out.printf("%10.5f", randomNum/randomNum1);
    System.out.println("");
    
    
}    
}