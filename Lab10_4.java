public class Lab10_4
{
    public double rectangleArea(double h, double w)
    {
        System.out.println("the area of the rectangle is " + h*w);
        return h*w;
    
    }
    
    public double squareArea(double s)
    {
        System.out.println("the area of the square is " + Math.pow(s, 2));
        return s;
    }
    public double circleArea(double r)
    {
        double z = 3.14 * r * r;
        System.out.println("the area of the circle is " + z);
        return r;
    }
}
class Lab101
{
     public static void main(String args[]) 
	{
            Lab10_3 ov = new Lab10_3();
            
	   ov.rectangleArea(3.1, 9.6);
	   ov.squareArea(4);
	   ov.circleArea(13.0);
        }
}