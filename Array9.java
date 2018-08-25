import java.util.ArrayList;
import java.util.Scanner;

public class Array9
{
public static void main(String args[])
{
ArrayList<String> names = new ArrayList<String>();
names.add("Annie");
names.add("Bob");
names.add("Charles");
names.set(2, "Doug");
names.add(0, "Evelyn");
System.out.print (names);
}
}

