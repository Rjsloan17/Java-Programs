import java.util.Scanner;

public class WhileYou
{
public static void main(String[] args)
{
int p = 0, sum = 0;


while(p < 20)
    {
        sum += p;
        ++p;
        System.out.println("The power of 2 to the " + p + " is: " + sum );
    }
    
}
}