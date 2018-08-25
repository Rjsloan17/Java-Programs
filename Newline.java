public class Newline
{
public static void main(String[] args)
{
int columns = 0;
for (int i = 65; i < 91; ++i)
{
System.out.print((char) i + " ");
columns++;
if (columns == 10) // insert a newline once 10 letters are displayed
{
System.out.println();
columns = 0;
}
}
System.out.println();
}
}