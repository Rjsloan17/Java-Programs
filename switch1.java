import java.util.Scanner;
public class switch1
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Do you want to continue <Y/N>? ");
char answer = in.nextLine().charAt(0);
switch(answer)
{
case 'n': case 'N':
System.out.println("Halting ...");
break;
case 'y': case 'Y':
System.out.println("Continuing ...");
break;
default: System.out.println("Please enter \"Y\" or \"N\"" );
}
}
}