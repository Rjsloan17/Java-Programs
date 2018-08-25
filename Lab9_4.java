import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Lab9_4

{
public static void main(String[] args) 
{
    ArrayList<Integer> numbers = new ArrayList<Integer>();        
    
    for(int i = 0; i < 20; i++) 
    {
      numbers.add((int)(Math.random()*100 + 1));
    }
    
    Collections.sort(numbers);
    
    System.out.println(" The smallest integer is at index 0 ");
}
}