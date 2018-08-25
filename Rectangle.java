import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {


	Scanner console = new Scanner(System.in); 


	System.out.println("Please enter the length for the first side."); 
	double side1 = console.nextDouble(); 

	System.out.println("Side one is " + side1); 

	
	System.out.println("Please enter the length for the second side."); 
	double side2 = console.nextDouble(); 

	
	System.out.println("Side two is " + side2);

	double area = side1 * side2; 
	double perimeter = (side1 + side2 ) * 2; 

	System.out.println("Area is: " + area + "\nPerimeter is: " + perimeter);
                            

    } 
}