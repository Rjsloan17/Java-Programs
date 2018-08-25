public class Lab7_2
{   
  public static void main(String[] args)
  { 

int number = 1;
int sum = 0;

do{
if ( number %2 == 0)
sum = number + sum;
number++;
}
while(number >= 1 && number <=100);


      System.out.println(sum);
  }
}