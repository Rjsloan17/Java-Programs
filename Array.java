import java.util.Scanner;

public class Array
        
{
public static void main(String args[]) 
{
        
 
 
 double[] moreValues = { 36, 1, 15, 93 ,44, 72, 6, 7, 8, 91, 50, 16};

 
 System.out.println(moreValues[4]);

 int[] scores = {10, 9, 7, 4, 5}; 
 int[] numbers = scores; // Copying array reference

 scores[3] = 10;   
 System.out.println(scores[3]);
 
double[] bills = new double[12];
for (int i=0; i<12; i++)
{
bills[i] = 29.99;
}
for (int i=0; i<12; i++)
{
System.out.println(" Month " + (i+1) + ": $" + bills[i]);
}

}
}