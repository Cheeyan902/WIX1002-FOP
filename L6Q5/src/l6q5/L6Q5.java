package l6q5;

import java.util.Scanner;
public class L6Q5 {
  
    public static void main(String[] args) {
       L6Q5 multigame = new L6Q5 ();
        multigame.start();
    }
    
    void start(){
            int n1, n2, input, score =0;
            Scanner cs = new Scanner(System.in);
        do{
            System.out.println("Enter negative number to quit: ");
            n1 = (int)(Math.random()*13);
            n2 = (int)(Math.random()*13);
            System.out.printf("%d x %d = ", n1, n2);
            input = cs.nextInt();
            
            if(n1*n2==input){
                score++;
            }
        }while(input>=0);
        System.out.printf("Your score is: %d",score);
    }
    
}
