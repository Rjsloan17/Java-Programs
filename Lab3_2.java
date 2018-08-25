import java.util.*;
public class Lab3_2 {
public static void main( String args[] ) {
Scanner in = new Scanner(System.in);
System.out.print("Enter a phrase with 3 words in it repeated: ");
String s = in.nextLine();
System.out.print("Enter the word that is repeated: ");
String word = in.nextLine();
System.out.print("Enter the replacement for the first occurrence: ");
String str1 = in.nextLine();
System.out.print("Enter the replacement for the second occurrence: ");
String str2 = in.nextLine();
System.out.print("Enter the replacement for the third occurrence: ");
String str3 = in.nextLine();
s = s.replaceFirst(word, str1);
s = s.replaceFirst(word, str2);
s = s.replaceFirst (word, str3);
System.out.println("\nNew Phrase: " + s);
}
}