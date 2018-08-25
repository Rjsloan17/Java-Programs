package finalexam;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class NextTo {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int previous;
        int sum = 0;

        do 
        {
            previous = x;
            x = input.nextInt();
            sum = sum + x;

            System.out.println(sum);

        } 
        while (x != 0 && previous != x);

    }
}
