import java.util.Scanner;

        
public class Lab7_3 

{
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int userInput = in.nextInt();
  int [] inputs = new int[100];
  int count = 0;
  do 
  {
      System.out.println("Please input a number between 50 and 100 inclusive: ");
      for (int i = 0; i <= inputs.length; i++)
      {
          inputs[i++] += userInput;
          count++;
      }
  } while(userInput >= 50 || userInput <= 100);
  
  double sum = 0, average = 0;
  
for (int num: inputs){
    sum += num;
}          

     System.out.println(sum/count);    
   
  
  
 }
}