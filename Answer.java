import java.util.Scanner;

public class Answer
{
    public static void main(String args[]) 
    {
        int x; 
        int count = 0;
        int sum = 0;
        boolean flag = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100: ");
        x = input.nextInt();
        
         if(x < 49 || x > 100 && count == 0) 
            {
            while(flag)
            {
                  System.out.println("Please enter at least one number between 50 and 100: ");
                  x = input.nextInt();  
             
                  if(x >= 50 && x <= 100) 
                            {
                            sum+= x;
                            count++;
                            }
             
                  if(x < 49 || x > 100 && count != 0) 
                  {
                        	flag = false; 
                  }
             
            } 
        	
        }
                 
    }
}