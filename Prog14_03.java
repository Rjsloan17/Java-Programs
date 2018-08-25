// Program 14_03: type casting

import java.util.Scanner;

public class Prog14_03 {
    
    public static void main(String args []){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number with a decimal part");
        double d = in.nextDouble();
        
        int i =(int) d;
        
        
    }
}