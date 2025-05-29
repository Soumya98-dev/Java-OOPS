public class Employee extends Worker {
    private long employeeId;
    private String hireDate;


    public Employee(String name, long employeeId, String hireDate){
        super(name);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public Employee(long employeeId) {
        this.employeeId = employeeId;
    }
}
