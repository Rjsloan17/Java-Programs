import java.util.Scanner;

public class IfTest

{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);        
double richter;
System.out.print("What number on the richter scale was the Earthquake? ");
richter = input.nextDouble();
    
if (richter >= 8.0) 
{ 
    System.out.println("Most structures fail");
}
else if (richter >= 7.0) 
{ 
    System.out.println("Many buildings destroyed"); 
}
else if (richter >= 6.0) 
{        
    System.out.println("Many buildings considerably damaged, some collapse");
}
else if (richter >= 4.5) 
{
    System.out.println("Damage to poorly constructed buildings");
}
else 
{ 
    System.out.println("No destruction of buildings");
} 

}
}