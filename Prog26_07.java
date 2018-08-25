import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Prog26_07
{
public static void main(String args[])
{
ArrayList<Integer> somenum = new ArrayList<Integer>();
somenum.add(1);
somenum.add(2);
somenum.add(1);
int count = 0;
for (int index = 0; index < somenum.size(); index++)
{
   if (somenum.get(index) % 2 == 0)
   {
      count++;
   }
}
}
}