package l8q7_money;

public class Money {
    
    //Instance variable
    private double CENT;
    private int RM100, RM50, RM10, RM5, RM1, sen50, sen20, sen10, sen5;
    
    //Constructors
    public Money(double money){
        this.CENT = money;
    }
    
    //Methods
    public static Money substraction(Money first, Money second){
        if(first.CENT - second.CENT <0){
           throw new IllegalStateException("The amount of money in this object is less than the other object.");
        }
        Money total = new Money(first.CENT - second.CENT);
        return total;
    }

    public static Money addition(Money first, Money second){
        Money total = new Money(first.CENT + second.CENT);
        return total;
    }
    
    public void displayvalue(String moneyname){
        System.out.printf("Initial value of %s is RM%.2f.\n", moneyname, this.CENT);
    }
    
    public void round(){
        int temp = (int)(this.CENT * 100);
        switch(temp % 10){
            case 1, 6 -> this.CENT -= 0.01;
            case 2, 7 -> this.CENT -= 0.02;
            case 3, 8 -> this.CENT += 0.02;
            case 4, 9 -> this.CENT += 0.01;
            default -> {}
        }
       System.out.printf("The amount of money after rounded up is RM%.2f\n",this.CENT);
    }
    
    public void calc(){
        int calcAmt = (int)(this.CENT*100);
        RM100 = calcAmt /10000;
        calcAmt %= 10000;
        RM50 = calcAmt /5000;
        calcAmt %= 5000;
        RM10 = calcAmt /1000;
        calcAmt %= 1000;
        RM5 = calcAmt /500;
        calcAmt %= 500;
        RM1 = calcAmt /100;
        calcAmt %= 100;
        sen50 = calcAmt /50;
        calcAmt %= 50;
        sen20 = calcAmt /20;
        calcAmt %= 20;
        sen10 = calcAmt /10;
        calcAmt %= 10;
        sen5 = calcAmt /5;
    }
    
    public void arrange(){
        System.out.println("The number of RM100 is " + RM100);
        System.out.println("The number of RM50 is " + RM50);
        System.out.println("The number of RM10 is " + RM10);
        System.out.println("The number of RM5 is " + RM5);
        System.out.println("The number of RM1 is " + RM1);
        System.out.println("The number of 50 sen is " + sen50);
        System.out.println("The number of 20 sen is " + sen20);
        System.out.println("The number of 10 sen is "+ sen10);
        System.out.println("The number of 5 sen is " + sen5 + "\n");

    }
    
    
    
}
