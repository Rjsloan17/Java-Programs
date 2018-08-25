import java.util.Arrays;

import java.util.Scanner;

public class Lab8_4 
{
    public static void main(String[] args) {
        int[] numbers = new int[10];       

        for(int i = 0; i < numbers.length; i++) 
        {
          numbers[i] = (int)(Math.random()*20 + 1);
        }
    
        for(int j = 0; j < numbers.length; j++)
        {
            if(numbers[j] == numbers[j + 1])
            {
                System.out.println("Contains adjacent value at position " + j);
            }
        }
    }
}
