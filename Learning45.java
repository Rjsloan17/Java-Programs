
import java.util.Scanner;
import java.util.*;

public class Learning45 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");

        int x = input.nextInt();

        if (x > 30) {
            System.out.println("Greater than 30");
        } 
        else if (x >= 20) 
        {
            System.out.println("In the [20, 30] range");
        } 
        else 
        {
            System.out.println("Less than 20");
        }

    }
}
