public class Lab7_2
{   
  public static void main(String[] args)
  { 

int number = 1;
int sum = 0;

while(number >= 1 && number <=100)
{
if ( number %2 == 0)
sum = number + sum;
number++;
}



      System.out.println(sum);
  }
}