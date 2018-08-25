import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;

public class ReplaceTest

{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
    System.out.print("Enter a phrase with three words repeated: ");
    String phrase1 = input.nextLine();
    
    System.out.print("Enter the word that is repeated: ");
    String word = input.nextLine();
    
    System.out.print("Enter a new string: ");
    String phrase2 = input.nextLine();
    
    String newPhrase = phrase1.replaceAll(word, phrase2);
    
    System.out.println(newPhrase);
    
    JOptionPane.showMessageDialog(null, "Hello");
            
    
    
    
    
    
    
    
    
}
}