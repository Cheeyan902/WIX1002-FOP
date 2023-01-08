package l8q2_bankaccount;

public class L8Q2_BankAccount {

    public static void main(String[] args) {
     
        //Test Constructor
        BankAccount TCY = new BankAccount("TiewCheeYan","012345-01-6789",10000.55);
        
        //Test Methods
        TCY.deposit(5000);
        TCY.withdraw(6000);
        TCY.balance();
        TCY.withdraw(2000);
        TCY.balance();
    }    
}
