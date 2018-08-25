import java.util.Scanner;

public class switchTest

{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter grade: ");
    String answer = input.nextLine();
    
    switch(answer)
    {
        case "A":
        {
            System.out.println("Excellent");
        }
        break;
        case "B":
        {
            System.out.println("Good");
        }
        break;
        case "C":
        {
            System.out.println("You can do better!");
        }
        break;
        case "D": case "F":
        {
            System.out.println("You can do better");
        }
        break;
        default: System.out.println("Input Error!");
    }  
    
    
}
}