package l8q7_money;

public class L8Q7_Money {

    public static void main(String[] args) {
      
        //Test Constructors 
        Money money1 = new Money(2023.06);
        Money money2 = new Money(1975.31);
        
        //Test Methods
        money1.displayvalue("money1");
        money1.round();
        money1.calc();
        money1.arrange();
       
        money2.displayvalue("money2");
        money2.round();
        money2.calc();
        money2.arrange();
        
        System.out.println("Money 1 substracts Money 2.");
        Money substractMoney = Money.substraction(money1,money2);
        substractMoney.round();
        substractMoney.calc();
        substractMoney.arrange();
        
        System.out.println("Money 1 adds Money 2.");
        Money additionMoney = Money.addition(money1,money2);
        additionMoney.round();
        additionMoney.calc();
        additionMoney.arrange();
    }
}
