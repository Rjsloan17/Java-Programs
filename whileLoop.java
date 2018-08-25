import java.util.Scanner;

public class whileLoop
{
public static void main(String[] args)
{
int i = 0;
do
{
i++;
System.out.println("i = " + i);
if (i % 2 == 0) i = 6;
} while (i <= 5);
}
}