import java.util.*;
import java.util.Scanner;

public class Soph

{
public static void main(String [] args)
{

Scanner input = new Scanner(System.in);

    System.out.println("Enter a phrase with "
            + "three words in it repeated:");
    String phrase = input.nextLine();
    
    System.out.println("Enter the repeated word: ");
    String repeatWord = input.nextLine();
    
    System.out.println("Enter the replacement for the first"
            + " occurrence: ");
    String repeated = input.nextLine();
    
    System.out.println("Enter the replacement for the second"
            + " occurrence: ");
    String repeatAgain = input.nextLine();
    
    System.out.println("Enter the replacement for the third"
            + " occurrence: ");
    String thirdWord = input.nextLine();
    
    String newPhrase = phrase.replaceFirst(repeatWord, repeated);
    String newPhrase1 = newPhrase.replaceFirst(repeatWord, repeatAgain);
    String newPhrase2 = newPhrase1.replaceFirst(repeatWord,thirdWord);
    
    
    System.out.println(newPhrase2);
      

}
}