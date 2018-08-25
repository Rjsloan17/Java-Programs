import java.util.Arrays;
import java.util.Scanner;

public class Lab8

{
public static void main(String[] args) 
{
    int[] numbers = new int[10];       
    
    for(int i = 0; i < numbers.length; i++) 
    {
      numbers[i] = (int)(Math.random()*20 + 1);
    }
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number 1 through 20: ");
    int number = input.nextInt();
    int count = 0;
    
    for(int i = 0; i < numbers.length; i++)
    {
        if(numbers[i] == number){
           count++;
        }
    }
    
    System.out.println(count + " Numbers in the array are equal to the value entered by the user: ");
}
}