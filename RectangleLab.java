public class RectangleLab

{
        private RectangleLab r;
        private static double area = 0.0;
    
        public RectangleLab()
        {
        calculateArea(5.2, 5.8);
        }
    
        public static double calculateArea(double l, double w)
        {
           double area = l*w;
           return area;
        }

        public static double calculatePerimeter(double l, double w)
        {
           double perimeter = 2*(l+w);
           return perimeter;
        }
        public static void printRectangleLab(RectangleLab r)
        {
            r.toString();
        }
        public static void main(String[] args)
        {
            RectangleLab f = new RectangleLab();
            System.out.println(calculateArea(2.5, 5.8));
            printRectangleLab(f);
            System.out.println(f.toString());
        }
}

