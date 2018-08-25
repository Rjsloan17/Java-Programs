import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lab9_3
{

public static void main(String[] args)

        
{
   ArrayList<Integer> arrayRandom = new ArrayList<Integer>(); 
   Random rand = new Random(); 
   for (int i = 0; i < 10; i++) 
   { arrayRandom.add(rand.nextInt(20)); }
   
   Scanner input = new Scanner(System.in);
    System.out.println("Enter a number 1 through 20: ");
    int number = input.nextInt();
    int count = 0;
    
    for(int i = 0; i < 10; i++)
    {
        if(arrayRandom.get(i) == number){
           count++;
        }
    }
    
    System.out.println(count + " Numbers in the array are equal to the value entered by the user: ");
} 
}
