import javax.swing.*;
public class DialogViewer
{
public static void main ( String args[ ] )
{
int n;
String s;
s = JOptionPane.showInputDialog ( null, "Enter a number", "Input", JOptionPane.QUESTION_MESSAGE);
n = Integer.parseInt(s);
s = "This is the number you entered: " + n + "\n\n";
JOptionPane.showMessageDialog ( null, s, "Output",
JOptionPane.INFORMATION_MESSAGE);
}
}