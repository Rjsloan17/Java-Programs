import java.util.Scanner;
import java.text.DecimalFormat;

public class ReplaceNow

{
public static void main(String args[])
{
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a phrase: ");
    
    String phrase = input.nextLine();
    
    String replace = phrase.replace('a','_');
    
    System.out.println(replace);
    
int a = 3;
int b = a++; System.out.println(a);
int c = ++a;
int d = --b + ++c * --d - ++a / --d % ++c;


    
     
}
}