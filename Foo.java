import java.util.Scanner;

public class Foo
{
public static void main(String[] args)
{
Scanner in = new Scanner (System.in);
String answer = "y";
while ( answer.equals("Y") || answer.equals("y") )
{
System.out.print("Want to see me again <Y/N>? ");
answer = in.nextLine();
}
System.out.println("Bye!");
}
}
