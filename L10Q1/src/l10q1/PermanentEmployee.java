package l10q1;

public class PermanentEmployee extends EmployeeSalary{
    
    protected final String category;
    protected final double monthsalary;
    
    public PermanentEmployee(String name, String category){
        super(name);
        this.category = category;
        this.monthsalary = (category.equalsIgnoreCase("A"))? 4000 : (category.equalsIgnoreCase("B"))? 3000 : (category.equalsIgnoreCase("C"))? 2000 : 0;
    }
    
    @Override
    public void displaydetails(){
        System.out.printf("Permanent Employee:\n Name: %s\n Category: %s\n Salary of Month: %.2f\n", this.name, this.category, this.monthsalary);
    }
            
}
