import java.util.Scanner;
import java.util.*;

public class Learning5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int x = input.nextInt();
        System.out.println("Give me a number: ");
        int y = input.nextInt();
        System.out.println("Give me a number: ");
        int z = input.nextInt();
        
        if ( x == y && x == z && y == z)
        {
            System.out.println("All numbers are the same");
        }
        else if ( x != y && x != z && y != z)
        {
            System.out.println("All Different");
        }
        else
        {
            System.out.println("Neither");
        }
        

    }
}
