package finalexam;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Loopy

{
public static void main(String args[])
{   
    Scanner input = new Scanner(System.in);
    int sum, inputNum;
    sum = 0;
    
    
    do
    {  
        System.out.println("Please enter a positive number or Enter '0' to exit: ");  
        inputNum = input.nextInt();
        sum = sum + inputNum;
        if (inputNum < 0)
            System.out.println("You don't LISTEN!");
    }
    while(inputNum != 0 && inputNum > 0);
    
    if (sum > 0)
        System.out.println("The sum is: " + sum);
    else
        System.out.println("Because you don't listen, it's negative!" 
                + " The number you input is: " + sum);
    
}    
}
