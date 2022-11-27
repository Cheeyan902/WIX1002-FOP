package l4q8;

import java.util.Random;
public class L4Q8 {

   
    public static void main(String[] args) {
       Random sc = new Random();
       
       int MAX = 101;
       int Randomnumber;
       int z = 0;
       Randomnumber = sc.nextInt(MAX);
        System.out.println("Random number is: " + Randomnumber);
        System.out.print("Prime numbers are: ");
        
        outer:                                     //Randomnumber used to be limit for numbers of prime numbers, i
        for(int i=2; z<Randomnumber; i++){         //z used to give condition to i
            for(int j=2; j<Math.sqrt(i); j++){  //j used to be divider for i
                if(i%j == 0)
                    continue outer;           
                }
            z++;
            System.out.print(i + " ");
        }
    }    
}
