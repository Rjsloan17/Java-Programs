public class Square
{
        private Square s;
        private static double area = 0.0;
        
        public Square()
        {
        calculateArea(5.2, 5.8);  
        }
        
        public static double calculateArea(double l, double w)
        {
           area = l*w;
           return area;
        }

        public static void printSquare(Square s)
        {
            System.out.println(s.toString());    
        }
        public static void main(String[] args)
        {
            Square d = new Square();
            System.out.println(calculateArea(2.5, 5.8));
            printSquare(d);
            System.out.println(d.toString());
        }
}
