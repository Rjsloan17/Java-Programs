public class Final
{
public static void main (String args [ ])
{
int[ ] xCoords = {10, -1, 15, 22, 34, -5, 17, 91, 0, 32};
int[ ] yCoords = {6, 9, 86, -51, 20, 0, 7, 62, 30, 72};

System.out.println("List of points: ");
for ( int i = 0; i < xCoords.length; i++)
{
System.out.println(" (" + xCoords[i] + ", " + yCoords[i] + ")");

int[][] arr =  
  {
    { 1, 2, 3 },
    { 4, 5, 6 }
  };
int val = arr[0][2] + arr[1][2];
System.out.println(val);

}
}
}