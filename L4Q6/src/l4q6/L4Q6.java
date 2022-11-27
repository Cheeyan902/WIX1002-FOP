package l4q6;

import java.util.Random;

public class L4Q6 {
     public static void main(String[] args) {
      Random cs = new Random();
        
        int num;
        int i=1;
        
        num = Math.abs(cs.nextInt()); 
        System.out.println("Random value is: "+num);
        while((num /= 10) != 0){
            i++;
        }
       
        System.out.println("Number of digit in those number are "+i);
    }    
}
