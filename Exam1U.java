import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exam1U

{
public static void main(String[] args)
{
    JOptionPane.showMessageDialog(null, "Hello");
    
    Scanner input = new Scanner(System.in);
    System.out.print("Give me info: ");
    String email = input.next();
    System.out.print("Give me zipcode: ");
    int zipCode = input.nextInt();
    String output = (email + " " + zipCode);
    System.out.println(output);
    
    
    
    
   

}
}