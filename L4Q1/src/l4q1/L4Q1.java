package l4q1;

import java.util.Scanner;
public class L4Q1 {
  
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
        int num;
        
        System.out.println("Enter an Integer:");
        num = cs.nextInt();
        System.out.println("The factors are:");
        for(int i=1; i<=num; i++){
            if(num % i == 0)
            {                 
            if(num / i != 1) {
                    System.out.print(i + ", ");
                }
                else if(num / i == 1) {
                    System.out.print(i);
                }           
            }
        } 
    }
}

