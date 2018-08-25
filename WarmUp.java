import java.util.*;
import java.util.Scanner;

public class WarmUp

{
public static void main(String [] args)
{
    int number = 15;
    String myResponse = "I want to go to Mars.";

    Scanner input = new Scanner(System.in);
    System.out.println("How do you feel about me? ");
    String answer = input.nextLine();
    
    
    System.out.println("Enter a number: ");
    int userNumber = input.nextInt();

    
    System.out.println(answer + "\n" + myResponse + "\n" + 
            number*userNumber);
    
    
    
    
    
    
    
    
    
    
}    
}