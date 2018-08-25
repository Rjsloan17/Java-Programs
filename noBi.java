import java.util.Scanner;
public class noBi
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
String answer = ""
, str = "";
while (!answer.toUpperCase().equals("BYE"))
{
System.out.print("Enter a string <To finish enter 'Bye'>: ");
answer = in.nextLine();
if (!answer.toUpperCase().equals("BYE")) 
    str += answer + " ";
}
System.out.println(str);
}
}