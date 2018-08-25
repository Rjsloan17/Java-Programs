import java.util.Scanner;

public class Switch 
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = in.nextInt();

switch (number)
{
case 14: System.out.println ("14 is an even number");
break;
case 15: System.out.println ("15 is an odd number");
break;
case 16: System.out.println ("16 is a perfect square");
break;
case 17: System.out.println ("17 is a prime number");
break;
default: System.out.println ("Well, I don’t know");
}
}
}
