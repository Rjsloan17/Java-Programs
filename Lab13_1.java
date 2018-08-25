public Square
{


        private Square s;
        private double area = 0.0;
        public static double calculateArea(double l, double w)
        {
           area = l*w;
           return area;
        }

        public static void printSquare(Square s)
        {
            s.toString();
        }
}
public static void main(String[] args)
{
}