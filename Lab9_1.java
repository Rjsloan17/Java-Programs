import java.util.*;
import java.math.*;

public class Lab9_1 
    {
	public static void main(String[] args) 
    {
		
		final int rowWidth = 3;
		final int colHeight = 4;
		
		Random rand = new Random();
			
		int [][] board = new int [rowWidth][colHeight];
			
		
		for (int row = 0; row < board.length; row++) {
			
			for (int col = 0; col < board[row].length; col++) {
				
				board[row][col] = rand.nextInt(10);
			}
		}

		
		for(int i = 0; i < board.length; i++) {

			for(int j = 0; j < board[i].length; j++) {
					
				System.out.print(board[i][j] + " ");
				
			}
			System.out.println();
		}
                
                int sum = 0;

                for (int[] row : board)
                for (int n : row)
                sum += n;
        System.out.println(sum);
	} 
} 