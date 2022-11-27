package l4q2;

import java.util.Scanner;
public class L4Q2 {
 
    public static void main(String[] args) {
      Scanner cs = new Scanner (System.in) ;
      
      int n;
      int total = 0;
      int sum = 0;
        System.out.println("Give a value to n:");
        n = cs.nextInt();
        
        for(int i=1; i<=n; i++){
            total += i;
            sum += total;
           
        }
        System.out.println("The sum of the series is " + sum);
    }
    
}
