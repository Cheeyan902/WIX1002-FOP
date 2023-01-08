package l8q3_weightcalculator;

public class WeightCalculator {
    
    //Instance Variable
    private final int AGE;
    private final double HEIGHT;
  
    //Constructors
    public WeightCalculator(int AGE, double HEIGHT){
        this.AGE = AGE;
        this.HEIGHT = HEIGHT;
    }
    
    //Methods
    public double getdisplayRecWeight(){     //method being made to calculate rec weight
        return (this.HEIGHT - 100 + (this.AGE/10))* 0.9;
    }
    
    public void displayAge(){
        System.out.printf("Your age is %d years old.\n", this.AGE);
    }
    
    public void displayHeight(){
        System.out.printf("Your height is %.2f cm.\n", this.HEIGHT);
    }
    
    public void displayRecWeight(){
        System.out.printf("Your recommended weight is %.2f kg.\n", getdisplayRecWeight());
    }
}
