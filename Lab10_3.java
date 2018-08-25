public class Lab10_3
{
    public static void rectangleArea(double h, double w)
    {
        System.out.println("the area of the rectangle is " + h*w);
    }
    public static void squareArea(double s)
    {
        System.out.println("the area of the square is " + Math.pow(s, 2));
    }
    public static void circleArea(double r)
    {
        double z = 3.14 * r * r;
        System.out.println("the area of the circle is " + z);
    }
}
class Lab10
{
     public static void main(String args[]) 
	{
            Lab10_3 ov = new Lab10_3();
            
	   ov.rectangleArea(5.1, 7.0);
	   ov.squareArea(11);
	   ov.circleArea(3.0);
        }
}