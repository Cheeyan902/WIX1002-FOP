package l2q6;
import java.util.Scanner;
public class L2Q6 {

   public static void main(String[] args) {
       Scanner cs = new Scanner (System.in);
       
       double M,Q,I,F;
       
       System.out.println("Enter the amount of water in kilogram:");
       M = cs.nextDouble();
       
       System.out.println("Enter the initial temperature in Farenheit:");
       I = cs.nextDouble();
       
       System.out.println("Enter the final temperature in Farenheit:");
       F = cs.nextDouble();
       
      Q = M*(F-I)*4184;
       System.out.printf("The energy needed to heat water is %6.6f",Q);
    }
    
}
