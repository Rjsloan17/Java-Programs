import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RamError
{
public static int hex_to_decimal(String[] s)
{
            String[] memLocs = new String[3];
            memLocs = Arrays.copyOf(s, s.length);
             int val = 0;
             for (int i = 0; i < s.length; i++)
             {
                 char c = memLocs[i].charAt(i);
                 int d = memLocs[i].indexOf(c);
                 val = 16*val + d;
             }
             return val;
 }    
public static void main(String[] args) throws IOException
{

try 
{
        FileReader fr =
        new FileReader("C:\\Users\\rjslo\\OneDrive\\Desktop\\program2\\RAMerrors.txt");
   
      
         int i;
         while ((i=fr.read()) != -1){
             
        System.out.print((char) i);
         }	

         Scanner in = new Scanner(new File("C:\\Users\\rjslo\\OneDrive\\Desktop\\program2\\RAMerrors.txt")); 
         List<String> lines = new ArrayList<String>(); 
         while (in.hasNextLine()) { 
         lines.add(in.nextLine()); 
         } 
         String[] chips = lines.toArray(new String[0]);
         System.out.println(Arrays.toString(chips));
        System.out.println(hex_to_decimal(chips));         
         
} 
//Exception to deal with a file not being found
catch (FileNotFoundException e)
{

System.out.println(e.getMessage());
System.exit(0);

}

}//End main.

}//End class.