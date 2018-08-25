public class OverloadDemo
{
    public void area(float x)
    {
        System.out.println("the area of the square is " + Math.pow(x, 2));
    }
    public void area(float x, float y)
    {
        System.out.println("the area of the rectangle is " + x*y);
    }
    public void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z);
    }
}
class Overload
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   ob.area(5);
	   ob.area(11,12);
	   ob.area(2.5);
        }
}