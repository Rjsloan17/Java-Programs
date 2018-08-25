
public class ArrayMath {
	{
    int tableSize = 10;
    public static void main(String[] args)
    {
            int sum = 0;
            int table[][] = new int [tableSize][tableSize];
            for (int r =0; r < 10; r++)
            {
                    for (int c=0; c < 10; c++)
                    {
                            System.out.printf(r*c +"\t");
                            sum += r*c;
                            
                    }
                   
                    System.out.println();
            }
           
            
            int oddTable[][] = new int [10][10];
            System.out.print("Total:  ");
            for (int row =1; row < oddTable.length; row+=2)
            {
                    int total = 0;
                    for (int c = 1; c < oddTable[row].length; c++)
                    {
                        if(row%2 != 0)
                            total+= row*c;
                    }        
                    System.out.print(total + "     ");
                    System.out.print("        ");
                    
            }
            System.out.println(); 
            System.out.println("Array Index Total: " + sum);
            System.out.println("Name: Rnard Sloan");
            System.out.println("Panther ID: 3416421");
        System.out.println();
    }
}


}
