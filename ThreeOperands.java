import java.util.Scanner;
public class ThreeOperands
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter values for a and b: ");
int a = in.nextInt();
int b = in.nextInt();
int max = (a>=b) ? a : b;
System.out.println("Maximum = " + max);
}
}