import javax.swing.JOptionPane;
import java.util.Scanner;

public class Learning2

{
    public static void main(String args[])
{
    
 Scanner input = new Scanner(System.in);
 System.out.println("What is your name?");
 String name = input.next();
 System.out.println("What is your zip?");
 String zip = input.next();
 
 String nameZip = name + " " + zip;
 
 System.out.println(nameZip);
 
 System.out.println("Enter a number: ");
 double first = input.nextDouble();
    
 System.out.println("Enter another number: ");
 double second = input.nextDouble();
    
 System.out.println((first + second)/2);
 
 System.out.println("The length of the rectangle is: ");
 double length = input.nextDouble();
 
 System.out.println("The width of the rectangle is:");
 double width = input.nextDouble();
 
 double area = length*width;
 double perimeter = 2*(length + width);
 
 System.out.println("The area is: " + area);
 System.out.println("The perimeter is: " + perimeter);
 
 
    
    
    
    
    
    
}
}