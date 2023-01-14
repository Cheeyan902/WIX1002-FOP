package l9q4_dicegame;

public class Tester {

    public static void main(String[] args) {
        
        FirstDiceGame game1 = new FirstDiceGame();
        System.out.println("First Dice Game");
        game1.start();
        System.out.println();
        
        SecondDiceGame game2 = new SecondDiceGame();
        System.out.println("Second Dice Game");
        game2.start();
    }
    
}
