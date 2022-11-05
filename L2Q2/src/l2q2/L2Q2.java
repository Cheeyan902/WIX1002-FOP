package l2q2;
import java.util.Scanner;
public class L2Q2 {

   public static void main(String[] args) {
       Scanner cs = new Scanner (System.in);
        double P,D,R,Y,M;
        
        System.out.println("The price of the car:");
        P = cs.nextDouble();
       
        System.out.println("Down payment:");
        D = cs.nextDouble();
        
        System.out.println("Interest Rate in %:");
        R = cs.nextDouble();
        
        System.out.println("Loan Duration in year:");
        Y = cs.nextDouble();
       
         M = (P - D) * (1 + R * Y / 100) / (Y * 12);
    
         System.out.printf("The monthly payment with car loan is %6.2f", M);
   }
    
}
