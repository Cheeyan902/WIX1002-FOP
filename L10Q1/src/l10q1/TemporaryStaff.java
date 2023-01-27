package l10q1;

public class TemporaryStaff extends EmployeeSalary{
    
    protected final double salary;
    protected final int hours;
    
    public TemporaryStaff(String name, int hours){
        super(name);
        this.hours = hours;
        this.salary = this.hours * 15;
    }
    
    @Override
    public void displaydetails(){
        System.out.printf("\nTemporary Staff\n Name: %s\n Salary of Month: %.2f\n Total working hours: %d", this.name, this.salary, this.hours);
    }
}
