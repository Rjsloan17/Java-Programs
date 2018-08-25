import java.util.Scanner;

public class Prog26_05
{
   public static void main(String[] args)
   {
   new Prog26_05();
   }
   public Prog26_05()
   {
      writeHello();
      String name = getName();
   }
   public void writeHello()
   {
   System.out.println("Hello!");
   }
   public String getName()
   {
   Scanner in = new Scanner(System.in);
   System.out.print("What is your name? ");
   String s = in.nextLine();
   return s;
   }
}