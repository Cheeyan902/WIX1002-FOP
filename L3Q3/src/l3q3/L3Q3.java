package l3q3;

import java.util.Scanner;
public class L3Q3 {

    public static void main(String[] args) {
      Scanner cs = new Scanner (System.in);
      
      int sales;
      double commission = 0;
        System.out.println("Enter the total sales volume:");
        sales = cs.nextInt();
        
        if (sales <= 100){
            commission = sales * 0.05;
            System.out.printf("The total commission received is RM %.2f",commission);}
        else if (sales>100 && sales<=500){
            commission = sales * 0.075;
            System.out.printf("The total commission received is RM %.2f",commission);}
        else if (sales>500 && sales<=1000){
            commission = sales * 0.1;
            System.out.printf("The total commission received is RM %.2f",commission);}
        else if (sales>1000){
            commission = sales * 0.125;
            System.out.printf("The total commision received is RM %.2f",commission);}
        }
      
      
        
    }
    

