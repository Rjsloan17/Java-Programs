import java.util.*;
public class Lab3_4 {
public static void main( String args[] ) {
Scanner in = new Scanner(System.in);

System.out.println("Enter the value of a: ");
double a = in.nextDouble();

System.out.println("Enter the value of b: ");
double b = in.nextDouble();

double c = Math.sqrt (a*a+b*b);
System.out.println("The length of the hypotenuse is :" + c);

}
}