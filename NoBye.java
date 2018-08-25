import java.util.Scanner;
public class NoBye
{
                    public static void main(String args[]) 
{
                    Scanner input = new Scanner(System.in);
                    
                    
                  String str1;
                  str1 = "I LOVE";
                  String str2 = str1.substring(0, 6);
                  System.out.println(str2);

                    
                  
                    
                    
                    
                    
                  String noGreet = ""; String combo = "";
                  
                  while(!noGreet.equalsIgnoreCase("bye") )
                  {
                  System.out.print("Enter a string or Bye to exit: ");
                  noGreet = input.nextLine();
                  
                  
                  if(!noGreet.equalsIgnoreCase("bye"))
                         
                  combo += noGreet + " ";
                  
                  }     
                        
                    
                  System.out.print(combo);  
                  
                  
                                            
                    
}
}