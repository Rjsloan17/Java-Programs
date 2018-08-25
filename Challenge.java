import java.util.Scanner;

public class Challenge
{

    public static void main(String args[]) 
    
    {
        int x; double count = 0;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100: ");
        x = input.nextInt();
        
      while( x > 49 && x < 101)
        {
                     
                    sum += x;
                    ++count;
                    System.out.println("Please continue: ");
                    x = input.nextInt(); 
        } 
         
         System.out.println(sum);
         System.out.println(sum/count);
         
         }
    }

          