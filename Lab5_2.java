import java.util.Scanner;
public class Lab5_2
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a letter grade: ");
String answer = in.nextLine();


switch(answer)
{
case "A":
System.out.println("Excellent");
break;
case "B":
System.out.println("Good");
break;
case "C":
System.out.println("You can do better!");
break;
case "D": case "F":
System.out.println("I'm \"afraid\" that's not good");
break;
default: System.out.println("Input Error!");
}
}
}