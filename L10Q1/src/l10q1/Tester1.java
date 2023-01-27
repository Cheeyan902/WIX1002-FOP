package l10q1;

public class Tester1 {

    public static void main(String[] args) {
      
        PermanentEmployee pe = new PermanentEmployee("John", "A");
        ContractStaff cs = new ContractStaff("Rosy", 1556490);
        TemporaryStaff ts = new TemporaryStaff("Steven", 70);
        
        pe.displaydetails();
        cs.displaydetails();
        ts.displaydetails();
        
    }
    
}
