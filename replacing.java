import java.util.Scanner;

public class replacing

{
public static void main(String[] args)
{

    Scanner input = new Scanner(System.in);
   
    
    System.out.print("Enter a phrase with 3 repeated words: ");
    String newPhrases = input.nextLine();
    
    System.out.print("Enter the word that is repeated ");
    String repeatP = input.nextLine();

    System.out.print("Enter a replacement word: ");
    String repeatP1 = input.nextLine();

    System.out.print("Enter a replacement word: ");
    String repeatP2 = input.nextLine();
    
    System.out.print("Enter a replacement word: ");
    String repeatP3 = input.nextLine();
    
    String newPhrases1 = newPhrases.replaceFirst(repeatP, repeatP1);
    String s = newPhrases1.replaceFirst(repeatP, repeatP2);
    String a = s.replaceFirst(repeatP, repeatP3);
    
    System.out.println(a);
      







}
}
