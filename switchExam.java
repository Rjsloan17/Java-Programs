import java.util.Scanner;

public class switchExam

{
public static void main(String[] args)
{

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a grade please: ");
    int option = 3;
    switch (option)
{
case 1: 
    System.out.println("First choice");
case 2: 
    System.out.println("Second choice");
    break;
case 3: 
    System.out.println("Third choice");
    break;
default: 
    System.out.println("Invlaid choice");
}


}
}