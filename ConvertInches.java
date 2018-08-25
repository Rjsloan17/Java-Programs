import java.util.*;
public class ConvertInches 
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.print("For Feet, press 1," + "For Inches, press 2," + "To Exit, press 3");
String answer = keyboard.nextLine();
   
    
switch(answer)
{
case "1": 
System.out.println("You chose to convert inches to feet");
break;
case "2":
System.out.println("You chose to convert feet and inches to decimal feet");
break;
case "3":
    System.out.println("You have exited! Goodbye!");
default: System.out.println("Please enter \"1\" or \"2\" ");
}
}
}