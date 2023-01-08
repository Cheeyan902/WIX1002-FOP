package l8q5_game;

public class L8Q5_Game {

    public static void main(String[] args) {
       
        boolean player1turn = true;
                
        //Test Constructors
        Game player1 = new Game ("Johny");
        Game player2 = new Game ("Rosy");
        
        //Test Methods
        while(Math.max(player1.getScore(), player2.getScore())<100){
            if(player1turn){
                player1.rollDice();
            }else{
                player2.rollDice();
            }
            player1turn = !player1turn; //make it become player2turn, isplayer1turn = false;
        }
        
        if(player1.getScore()>player2.getScore()){
            System.out.println(player1.getName());
        }else{
            System.out.println(player2.getName());
        }
    }
    
}
