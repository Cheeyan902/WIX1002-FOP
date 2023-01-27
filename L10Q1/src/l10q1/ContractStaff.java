package l10q1;

public class ContractStaff extends EmployeeSalary{
    
    protected final double comission;
    protected final int totalsales;
    protected final int income = 500;
    
    public ContractStaff(String name, int totalsales){
        super(name);
        this.totalsales = totalsales;
        this.comission = this.totalsales * 0.5;
    }
    
    @Override
    public void displaydetails(){
        System.out.printf("\nContract Staff:\n Name: %s\n Salary of Month: %d\n Total Sales: %d\n Comission: %.2f\n", this.name, this.income, this.totalsales, this.comission);
    }
}
