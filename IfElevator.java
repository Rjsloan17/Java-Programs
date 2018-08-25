import java.util.Scanner;

public class IfElevator
{
public static void main(String[] args)
{    
    Scanner input = new Scanner(System.in);
    System.out.print("Floor:");
    int floor = input.nextInt();
    
    int actualFloor;
    if (floor >= 13 && floor >= 14 )
    {
        actualFloor = floor - 2;
    }
    else
    {
        actualFloor = floor;
    }

    System.out.println("The elevator will travel to the actual floor " 
            + actualFloor);

}
}