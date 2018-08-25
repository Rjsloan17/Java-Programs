import java.util.Scanner;

public class Lab10_2 
{ 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        System.out.println("The character entered is: " + c);

    }
}