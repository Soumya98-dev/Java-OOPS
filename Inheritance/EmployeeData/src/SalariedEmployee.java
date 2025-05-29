public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(long employeeId, double annualSalary, boolean isRetired){
        super(employeeId);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public boolean retire(){
        return this.isRetired;
    }
}
