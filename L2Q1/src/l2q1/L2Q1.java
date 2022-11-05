package l2q1;
import java.util.Scanner;

public class L2Q1 {

   
    public static void main(String[] args) {
       
        Scanner cs = new Scanner (System.in);
        double cel, fah;
        
        System.out.println("Enter the temperature in degree Fahrenheit:");
        fah = cs.nextDouble();
        cel = (fah-32)/1.8;
        
        System.out.printf("The temperature in degree Celcius is %5.2f",cel);
    }
    
}
