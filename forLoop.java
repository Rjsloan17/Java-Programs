import java.util.Scanner;

public class forLoop
{
public static boolean flag = true;
    public static void main(String[] args)
{



do
{
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = input.nextInt();
if (num <= 100 && num % 2 == 0)
{
    
    System.out.print("Even. ");
    System.out.println("Less than or equal to 100");
    
}
else if (num <= 100 && num % 2 == 1)
{
    System.out.print("Odd. ");
    System.out.println("Less than or equal to 100");
}
else if (num >= 1000 && num % 2 == 0)
{
    
    System.out.println("Greater than or equal to 1000");
}
else if (num >= 1000 && num % 2 == 1)
{
    
    System.out.println("Greater than or equal to 1000");
}
} while (flag);



    
}
}