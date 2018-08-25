import java.util.*;
import java.util.Scanner;

public class Learning33

{
    public static void main(String args[])
{
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a phrase with three words in it repeated: ");
   String phrase = input.nextLine();
   
   System.out.println("Enter the repeated word: ");
   String word = input.nextLine();
   
   System.out.println("Enter a replacement: ");
   String newWord = input.nextLine();
   
   System.out.println("Enter a replacement: ");
   String newWord2 = input.nextLine();
   
   System.out.println("Enter a replacement: ");
   String newWord3 = input.nextLine();
   
   String phrase1 = phrase.replaceFirst(word, newWord);
   String phrase2 = phrase1.replaceFirst(word, newWord2);
   String phrase3 = phrase2.replaceFirst(word, newWord3);
   
    System.out.println(phrase3);
   
    
    
    
    
    
    
    
    
    
}
}