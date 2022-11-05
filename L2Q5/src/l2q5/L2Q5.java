package l2q5;
import java.util.Random;
public class L2Q5 {

   public static void main(String[] args) {
       Random r = new Random();
       
       int num;
       double total = 0;
       int MAX = 10000;
       
       System.out.println("Input a random number:");
       num = r.nextInt(MAX);
       
       while(num >0){
           total = total + num%10;
           num = num/10;
       }
       
       System.out.println("The sum of all the digits in the number is" + total);
    }
    
}
