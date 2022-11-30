package l5q3;

import java.util.Scanner;
import java.util.Random;
public class L5Q3 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Random r = new Random();
        
        int nums;
        int sum = 0;
        
        System.out.print("Enter the number of employees: ");
        nums = cs.nextInt();
        int [] hours = new int [7];
        
        for(int i =1; i<=nums; i++){
            System.out.println("\nEmployee " + i + " working hours for seven days is: ");
            System.out.println("S M T W T F S");
            System.out.println("--------------");
            
            for(int j= 0; j<hours.length; j++){
                hours[j] = r.nextInt(8)+1;
                System.out.print(hours[j] + " ");
                sum += hours[j];          
            }     
            System.out.println("\nThe total of working hours of employee " + i + " is " + sum + " hours. ");
        }      
    }   
}
