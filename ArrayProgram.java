import javax.swing.*;

public class ArrayProgram

{
    public static void main(String[] args)
{
    double a[] = new double [5];
    
    for ( int i=0; i<5; i++)
    {
        a[i] = Math.pow(2,i);
    }

    String s = "";
    
    for (int i=0; i<5; i++)
    {
        s = s + (int) a[i] + "\n";
    }
    
    JOptionPane.showMessageDialog(null, s, "Output", 
            JOptionPane.INFORMATION_MESSAGE);




}
}