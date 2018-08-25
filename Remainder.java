import java.util.Scanner;

public class Remainder

{
    public static void main(String[] args)
{            
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is the price? ");
    double price = input.nextDouble();
    System.out.printf("%20.2f", price);
    System.out.println("");

System.out.print("Please enter the number of cans: "); 
String cans = "cans";
int lengthOfCans = cans.length();

System.out.println(cans.length());

String river = "Miami Dolphins";
String bigRiver = river.toUpperCase();
    System.out.println(bigRiver);
String newName = river.replace("Dolphins","Beach");
System.out.println(newName);


    









}
}