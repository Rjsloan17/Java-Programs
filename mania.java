import java.util.Scanner;

public class mania
{

    public static void main(String args[]) 
    
    {
        int p = 2, sum = 0;

        do
        {
            if(p % 2 == 0)
            sum += p;
            ++p;
            
            
            
        } while (p < 101);
        
        System.out.println(sum);
    }
}
