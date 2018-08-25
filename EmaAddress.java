import java.util.Scanner;

public class EmaAddress
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner (System.in);
    System.out.println("What is your email address?");
    String email = keyboard.next();
    System.out.println("What is your postal address?");
    String address = keyboard.next();
    String output = email + " " + address;
    System.out.println(output);
    










}
}