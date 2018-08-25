
import java.util.Scanner;

public class ifTest 
    
    {
        public static void main(String[] args)
    {

    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your grade? ");
        String grade = input.nextLine();

        if (grade.equals("A")) 
        {
            System.out.println("Excellent");
        }
        else if(grade.equals("B"))
                {
                    System.out.println("Good");
                }
        else if(grade.equals("C"))
        {
            System.out.println(" You can do better");
        }
        else if(grade.equals("D") || grade.equals("F"))
        {
            System.out.println("I'm afraid that's not good enough");
        }
        else
        {
            System.out.println("Please enter a letter: ");
        }
    }
}
}
