import java.util.Scanner;
public class Dimensions
{
 public static void main(String[] args)
 {
 float w, h;
 Scanner input = new Scanner(System.in);
 System.out.print("Please enter w and h: ");
 w = input.nextFloat();
 h = input.nextFloat();
 w *=25.4;
 h *=25.4;
 System.out.println("Dimensions in mm are: " + w + "\t" + h);
 }
}

