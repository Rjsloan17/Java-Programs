import java.util.Scanner;


public class AskLoop {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter the number of times you want to run the FOR loop: ");
int total = in.nextInt();
for (int i = 0; i < total; i++) {
System.out.print("Enter a number: ");
int number = in.nextInt();
if (number > 0)
System.out.println("You entered a positive number");
else
System.out.println("You entered zero or a negative number");
}
}
}