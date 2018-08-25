import javax.swing.*;

public class DialogPractice
{
public static void main ( String args[ ] )
{
int a;
String h;

h = JOptionPane.showInputDialog(null, "Enter a number", "Input", JOptionPane.QUESTION_MESSAGE);
a = Integer.parseInt(h);
h = "This is the number you entered:" + " " + a;JOptionPane.showMessageDialog( null, h, "Output", JOptionPane.INFORMATION_MESSAGE);








}
}