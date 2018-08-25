import java.util.Scanner;

public class ExamPrac

{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
    System.out.println("Please enter a phrase: ");
    String answer = input.nextLine();
    
    String a = answer.replace("a", "_");
    String e = a.replace("e", "_");
    String i = e.replace("i", "_");
    String o = i.replace("o", "_");
    String u = o.replace("u", "_");
    
    System.out.println(u);
    
            
    
    
    
    
    
    
}
}