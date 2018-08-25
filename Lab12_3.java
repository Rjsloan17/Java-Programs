import java.util.ArrayList;
import java.util.Scanner;

public class Lab12_3
{
public static void main(String[] args)
{
class Rectangle
{
    public double calculateArea(double l, double w)
        {
           double area = l*w;
           return area;
        }

    public double calculatePerimeter(double l, double w)
        {
           double perimeter = 2*(l+w);
           return perimeter;
        }
    public void printRectangle(Rectangle r)
        {
            r.toString();
        }
}
}
}