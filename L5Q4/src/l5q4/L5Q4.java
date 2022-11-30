package l5q4;

import java.util.Random;
public class L5Q4 {

    public static void main(String[] args) {
       Random r = new Random();
       
       int [][] matrix = new int [3][3];
       
        System.out.println("3 by 3 Matrix: ");
        
         for(int i=0; i<matrix.length; i++){
           for(int j =0; j<matrix[i].length; j++){
               matrix[i][j] = r.nextInt(10);
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
        
        System.out.println("\nAfter rotate 90 degrees: ");
        int [][] rotatedmatrix = new int [3][3];
         for(int i=0; i<rotatedmatrix.length; i++){
           for(int j =0; j<rotatedmatrix[i].length; j++){
               rotatedmatrix[i][j] = matrix[2-j][i];
               System.out.print(rotatedmatrix[i][j] + " ");
           }
             System.out.println();
    }
  }
}
