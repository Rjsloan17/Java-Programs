import java.util.Scanner;

public class NewEmpty
{
        public static void main(String[] args)
        {
int score = 0;
Scanner in = new Scanner(System.in);
System.out.print("Enter your score: ");
score = in.nextInt();
if (score < 40) 
{
   System.out.println("F"); 
}   
else if (score >= 40 || score < 50) 
{ 
   System.out.println("D"); 
}   
else if (score >= 50 || score < 60) 
{ 
   System.out.println("C"); 
}   
else if (score >= 60 || score < 70) 
{ 
   System.out.println("B");
}   
else if (score >= 70 || score < 80) 
{ 
   System.out.println("B+"); 
}   
else 
{ 
   System.out.println("A");
}
        }
        }
