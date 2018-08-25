package finalexam;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Object 

{
public static void main(String args[]) 
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a grade: ");
    String grade = input.next();
    
        if (grade.equalsIgnoreCase("A"))
            {
            System.out.println("Excellent");
            }   
        else if (grade.equalsIgnoreCase("B"))
            {
            System.out.println("Good");
            }
        else
            System.out.println("Please enter a letter!");
        
}
}

