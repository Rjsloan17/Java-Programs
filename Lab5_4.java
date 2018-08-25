import java.util.Scanner;
public class Lab5_4
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Pick one of the following objects: Circle, Square, Rectangle, or Exit: ");
String answer = in.nextLine();


switch(answer)
{
case "Circle":
System.out.println("Enter the radius of the Circle: ");
double radius = in.nextDouble();
         System.out.println("Your area is: " + Math.PI*Math.pow(radius, 2));
break;
case "Square":
System.out.println("Enter the base of the Square: ");
double base = in.nextDouble();
         System.out.println("The area of the Square is: " + Math.pow(base, 2));
break;
case "Rectangle":
System.out.println("Enter the length");
double length = in.nextDouble();
System.out.println("Enter the width");
double width = in.nextDouble();
System.out.println("The area of the Rectangle is:  " + width*length);
break;
case "Exit":
System.out.println("You have now exited! Goodbye!");
break;
}
}
}