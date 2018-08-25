import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;

public class ReplaceTest1

{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
    System.out.print("Enter a phrase with three words repeated: ");
    String phrase1 = input.nextLine();
    
    System.out.print("Enter the word that is repeated: ");
    String word = input.nextLine();
    
    System.out.print("Enter a replacement: ");
    String replace1 = input.nextLine();
    
    System.out.print("Enter a replacement: ");
    String replace2 = input.nextLine();
    
    System.out.print("Enter a replacement: ");
    String replace3 = input.nextLine();
    
    String newPhrase = phrase1.replaceFirst(word, replace1);
    
    String newPhrase1 = newPhrase.replaceFirst(word, replace2);
    
    String newPhrase2 = newPhrase1.replaceFirst(word, replace3);
    
    System.out.println(newPhrase2);
    
    JOptionPane.showMessageDialog(null, "Hello");
    
    
    
}
}