package l8q6_burger;

public class L8Q6_Burger {
    
    public static void main(String[] args) {
        
        //Test Constructors
        Burger stallA = new Burger ("Stall A");
        Burger stallB = new Burger ("Stall B");
        Burger stallC = new Burger ("Stall C");
        Burger stallD = new Burger ("Stall D");
        
        //Test Methods
        stallA.numbersold(10);
        stallB.numbersold(35);
        stallC.numbersold(90);
        stallD.numbersold(40);
        
        System.out.printf("The number of burgers sold in %s is %d.\n", stallA.getName(), stallA.getTOTALSALEDAY());
        System.out.printf("The number of burgers sold in %s is %d.\n", stallB.getName(), stallB.getTOTALSALEDAY());
        System.out.printf("The number of burgers sold in %s is %d.\n", stallC.getName(), stallC.getTOTALSALEDAY());
        System.out.printf("The number of burgers sold in %s is %d.\n", stallD.getName(), stallD.getTOTALSALEDAY());
        System.out.printf("The total number of burgers sold in all stalls is: %d.", Burger.getTOTALSALEALLDAY());
      }
    
}
