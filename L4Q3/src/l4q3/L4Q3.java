package l4q3;

import java.util.Scanner;
public class L4Q3 {
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int num;
       int max = 0;
       int min = 10000;
       double avg, v, SD = 0;
       int power = 0;
       int sum = 0;
       int i = 0;
                    
       System.out.println("Enter a score [negative score to quit]: ");
       num = sc.nextInt(); 
       
       while(num>=0){
         sum += num;
         if (num>max)
             max = num;
         if (num<min)
             min = num;
         power += Math.pow(num, 2);        
         i++;
         System.out.println("Enter a scare [negative score to quit]: ");
         num = sc.nextInt(); 
       }
         avg = sum/i;
         v = (power-(Math.pow(sum,2))/i)/(i-1);
         SD = Math.sqrt(v);
         
        System.out.println("Variance: "+ v);
        System.out.println("Minimum Score: "+ min);
        System.out.println("Maximum Score: "+ max);
        System.out.printf("Average Score: "+ avg);
        System.out.printf("Standard Deviation: %.2f",SD);
    }
  }

