import java.text.DecimalFormat;
import java.util.*;
public class Prog13_03
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
double cTemp, fTemp;
System.out.print("Enter a Fahrenheit temperature: ");
fTemp = in.nextDouble();
cTemp = 5.0/9.0*(fTemp - 32.0);

DecimalFormat df = new DecimalFormat ();
    df.setMaximumFractionDigits(2);


System.out.println ( "The Celsius temp is " + cTemp + " degrees");
System.out.println("The Celsius temp is " + df.format(cTemp)); } 

}
