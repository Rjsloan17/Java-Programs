import java.util.Scanner;

public class Table
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int x = 0;
    
    while(x < 11)
    {
        System.out.println("The square of "+ x + " is " + Math.pow(x, 2) + " while the cube of " + Math.pow(x, 3));
        ++x;
    }



}
}