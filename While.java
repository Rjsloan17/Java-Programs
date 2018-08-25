import java.util.Scanner;
public class While 
        {
                    public static void main(String args[]) {
                    Scanner in = new Scanner(System.in);
                    int ctr = 0;
                    boolean stop = false;
                    System.out.print("This program will stop after ten trials ");
                    System.out.println("or when a negative number is entered");
                    while (ctr < 10 && !stop)
                            
                     {
                                System.out.print("Enter a number: ");
                                double x = in.nextDouble();
                                if (x < 0) stop = true;
                                else System.out.println( "sqrt(" + x + ") = " + Math.sqrt(x) );
                                ctr++;
                                
                               
                  }
                    
        }
        }