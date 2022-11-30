package l5q6;

import java.util.Scanner;
public class L5Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of Pascal Triangle to generate: ");
        int N = sc.nextInt();
        
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            matrix [i][0] = 1;
            for (int j = 1; j<=matrix[i].length; j++ ){
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
                
            }

       
        }
       }
        
        
        
        
    }
    

