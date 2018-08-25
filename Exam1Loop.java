import java.util.Scanner;

public class Exam1Loop
        

{
public static void main(String[] args)
{
    for(int i = 0; i < 21; i++)
    {
        System.out.println("2 to the power of " + i + "  " + Math.pow(2, i));
    }
  
  
 int sum = 0;
 for( int z = 2; z <= 100; z++)  
 if( z % 2 == 0)
 sum += z; 
  {
      System.out.println(sum);
  }

Scanner input = new Scanner(System.in);
int a, b, i; 
System.out.println("Enter a: ");
a = input.nextInt();
System.out.println("Enter b: ");
b = input.nextInt();
input.nextLine();
int sum1 = 0;
for( i = a; i <= b; i++)
if(i % 2 == 1)
sum1 += i;
{
    System.out.println(sum1);
}

{
    String answer;
    System.out.println("Enter a string please: ");
    answer = input.nextLine();
    String answerA = answer.replaceAll("a", "_");
    String answerE = answerA.replaceAll("e", "_");
    String answerI = answerE.replaceAll("i", "_");
    System.out.println(answerI);
    
}


    
    
    
    
    
    
    
    
    
    
    
}
}