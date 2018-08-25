import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exam1R

{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a phrase with three words repeated: ");
   String userInput = input.nextLine();
   
   System.out.println("Enter the word that is repeated: ");
   String repeat = input.nextLine();
    
   System.out.println("Enter a string: ");
   String newPhrase = input.nextLine();
   
   userInput = userInput.replaceAll(repeat, newPhrase);
    
   System.out.println(userInput);
    
    
   

}
}