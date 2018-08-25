import java.util.Scanner;
public class Prog26_06
   {
public static void main(String[] args)
   {
   new Prog26_06();
   }

public Prog26_06()
   {
   writeHello();
   String name = getName();
   welcomeMessage(name);
   }
   public void writeHello()
   {
   System.out.println("Hello!");
   }
   public String getName()
   {
   Scanner in = new Scanner(System.in);
   
   System.out.print("What is you name? ");
   String s = in.nextLine();
   
   return s;
   }
   
   public void welcomeMessage(String s)
   {
   System.out.println("Welcome aboard, "+ s + "!");}
   }