import java.util.*;
import java.util.Scanner;

public class Learning3

{
    public static void main(String args[])
{
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a phrase with three words in it repeated: ");
   String phrase = input.nextLine();
   
   System.out.println("Enter the repeated word: ");
   String word = input.nextLine();
   
   System.out.println("Enter a string: ");
   String newWord = input.nextLine();
   
   String replaceWord = word.replaceAll(word, newWord);
   
   String newPhrase = phrase.replaceAll(word, replaceWord);
   
   System.out.println(newPhrase);
   
    
    
    
    
    
    
    
    
    
}
}