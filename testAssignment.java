public class testAssignment

{
public static void main(String[] args)
{
        
int[][]myMatrixA = {
    
  {0,0,0,0,0,0,0,0,0,0},
  {1,1,1,1,1,1,1,1,1,1},
  {2,2,2,2,2,2,2,2,2,2},
  {3,3,3,3,3,3,3,3,3,3},
  {4,4,4,4,4,4,4,4,4,4},
  {5,5,5,5,5,5,5,5,5,5},
  {6,6,6,6,6,6,6,6,6,6},
  {7,7,7,7,7,7,7,7,7,7},
  {8,8,8,8,8,8,8,8,8,8},
  {9,9,9,9,9,9,9,9,9,9}

};

int[][] myMatrixB = {
    
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9},
  {0,1,2,3,4,5,6,7,8,9}
        
};


int i, j, k, m, n; int sum = 0;

int rowsA = myMatrixA.length;
int colsA = myMatrixA[0].length;
int rowsB = myMatrixB.length;
int colsB = myMatrixB[0].length;

int[][] myMatrixC = new int [rowsA][colsB];
for (i = 0; i < rowsA; i++) {
  for(j = 0; j < colsB; j++) {
   for(k = 0; k < colsA; k++) {
    myMatrixC[i][j] = myMatrixA[i][k] * myMatrixB[k][j];
   }
  }
}

System.out.println("Multiplying A and B equals: ");

  for(m = 0; m < myMatrixC.length; m++) {
   for(n = 0; n < myMatrixC[0].length; n++) {
    System.out.printf("%10d", myMatrixC[m][n]);
   }
    System.out.println();
  }

}
}