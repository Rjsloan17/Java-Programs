import java.util.Scanner;
public class Prog14_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int a = in.nextInt();
        
        in.nextLine();
        
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        
        System.out.print("Enter a number: ");
        int b = in.nextInt();
        
        System.out.println("You entered: " + a + " " + str + " " + b);
        
    }
}