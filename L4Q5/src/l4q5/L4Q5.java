package l4q5;

import java.util.Random;
public class L4Q5 {
 
    public static void main(String[] args) {
      Random r = new Random ();
     
      int sum1 = 0;
      int sum2 = 0;
      int MAX = 7;
      int diceplayer1, diceplayer2;
      diceplayer1 = r.nextInt(MAX);
      diceplayer2 = r.nextInt(MAX);    
      
      while(sum1<100 && sum2<100){
        diceplayer1 = r.nextInt(MAX);
        diceplayer2 = r.nextInt(MAX);
        sum1 += diceplayer1;
        sum2 += diceplayer2;
        
        if(diceplayer1 == 6){                      
          diceplayer1 = r.nextInt(MAX);
          sum1 += diceplayer1;
      }
        if(diceplayer2 == 6){   
          diceplayer2 = r.nextInt(MAX);
          sum2 += diceplayer2;
      }     
     }   
     
        System.out.println("Player 1 scores " + sum1 + " points.");
        System.out.println("Player 2 scores " + sum2 + " points.");
        
        if(sum1>sum2)
            System.out.println("Player 1 wins the game.");
        else if(sum2>sum1)
            System.out.println("Player 2 wins the game.");
        else
            System.out.println("DRAW");
    }
   }
    
    

