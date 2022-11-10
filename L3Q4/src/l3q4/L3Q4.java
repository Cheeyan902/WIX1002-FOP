package l3q4;

import java.util.Random;
public class L3Q4 {
   
    public static void main(String[] args) {
       Random r = new Random ();
       
       int MAX = 7, MIN = 1;
        System.out.println("Dice competition starts");
        int player1_dice1 = r.nextInt(MIN,MAX);
        int player2_dice1 = r.nextInt(MIN,MAX);
        int player1_dice2 = r.nextInt(MIN,MAX);
        int player2_dice2 = r.nextInt(MIN,MAX);
        
        System.out.println("Round 1, player1:" + player1_dice1);
        System.out.println("Round 1, player2:" + player2_dice1);
        System.out.println("Round 2, player1:" + player1_dice2);
        System.out.println("Round 2, player2:" + player2_dice2);
        
        int sum1 = player1_dice1 + player1_dice2;
        int sum2 = player2_dice1 + player2_dice2;
        
        System.out.println("Total result for player 1:" + sum1);
        System.out.println("Total result for player 2:" + sum2);
        
        if (sum1>sum2)
            System.out.println("Player 1 wins the dice game!");
        else if (sum2>sum1)
            System.out.println("Player 2 wins the dice game!");
    }
    
}
