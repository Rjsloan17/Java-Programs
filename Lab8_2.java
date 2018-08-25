import java.util.Arrays;
import java.util.Scanner;

public class Lab8_2

{
public static void main(String[] args) 
{
    int[] numbers = new int[20];       
    
    for(int i = 0; i < numbers.length; i++) 
    {
      numbers[i] = (int)(Math.random()*100 + 1);
    }
    
    Arrays.sort(numbers);
    
    System.out.println(" The smallest integer is at index 0 ");
}
}