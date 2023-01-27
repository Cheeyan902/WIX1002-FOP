package l10q3;

public class Tester3 {

    public static void main(String[] args) {
       
        ShuffleCipher normal = new ShuffleCipher("inputNormal.txt", "outputShuffle.txt", 5);
        ShuffleCipher shuffle = new ShuffleCipher("inputShuffle.txt", "outputNormal.txt", 5);
        
        normal.shuffleFrom("Normal");
        shuffle.shuffleFrom("Shuffle");
        
    }
    
}
