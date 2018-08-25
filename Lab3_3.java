import java.util.*;
public class Lab3_3 {
public static void main( String args[] ) {
Scanner in = new Scanner(System.in);

System.out.println("Enter the value of x: ");
double x = in.nextDouble();

double exponent = 1 + x + Math.pow(x, 2)/2 + Math.pow(x, 3)/6 + Math.pow(x, 4)/24;
System.out.println("Exponent of x is " + exponent);

}
}














