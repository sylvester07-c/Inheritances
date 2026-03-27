public class Employee extends  Worker{
    private long employeeId;
    private String hiredDate;
    
    public Employee(String name, String birthdate, long employeeId, String hiredDate) {
        super(name, birthdate);
        this.employeeId = employeeId;
        this.hiredDate = hiredDate;
    }
}
