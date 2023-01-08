package l8q2_bankaccount;

public class BankAccount {
    
    private final String NAME;
    private final String IC;
    private double BALANCE;
    
         //Constructors
         public BankAccount(String NAME, String IC, double BALANCE){
             
                this.NAME = NAME;
                this.IC = IC;
                this.BALANCE = BALANCE;
                System.out.printf("Saving account for %s with %s contains RM%.2f\n", this.NAME, this.IC, this.BALANCE);
            }
    
         //Methods
         public void deposit(int income){
             this.BALANCE += income;
             System.out.printf("The amount of money being transferred in is RM%d\n", income);
             System.out.printf("The amount of savings in current account: RM%.2f\n", this.BALANCE);
         }
         
         
         public void withdraw(int outcome){
             if(this.BALANCE < outcome){
                 System.out.print("Money is not enough to be withdrawn.");
             }else{
             this.BALANCE -= outcome;
                 System.out.printf("The amount of money being withdrawn is: RM%d", outcome);
             }
            System.out.println();
         }
         
         
         public void balance(){
             System.out.printf("The amount of savings in current account: RM%.2f\n", this.BALANCE);
         }
 }

    
    
    

