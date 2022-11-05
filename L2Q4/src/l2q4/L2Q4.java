package l2q4;
import java.util.Scanner;
public class L2Q4 {

   public static void main(String[] args) {
      Scanner cs = new Scanner (System.in);
      int num, sec, min, hr;
      
      System.out.println("Enter the number of seconds:");
      num = cs.nextInt();
      
      hr = num/3600;
      min = (num/60) - (hr*60);
      sec = num - (hr*3600) -(min*60);
      
       System.out.println( num +" seconds is " + hr + " hours," + min +" minutes and " + sec +" seconds");
    }
    
}
