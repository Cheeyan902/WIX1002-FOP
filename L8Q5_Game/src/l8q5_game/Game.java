package l8q5_game;

public class Game {
    
    //Instance Variables
    private final String NAME;
    public int score;
    
    //Constructors
    public Game(String NAME){
        this.NAME = NAME;
    }
   
    //Methods
    public void rollDice(){
        this.score += 1 + (Math.random()*5);
    }
    
    public String getName(){
        return this.NAME;
    }
    
    public int getScore(){
        return this.score;
    }
}
