//Adds a list of numbers
import java.util.Scanner;
public class IncreaseLoop
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n, sum = 0;
for (int i=0; i<10; i++)
{
System.out.print("Enter a number: ");
n = in.nextInt();
sum += n;
}
System.out.println("Sum = " + sum);
}
}