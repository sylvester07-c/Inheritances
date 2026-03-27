public class Employee extends  Worker{
    private long employeeId;
    private String hiredDate;

    public Employee(String name, String birthdate, String endDate, long employeeId, String hiredDate) {
        super(name, birthdate, endDate);
        this.employeeId = employeeId;
        this.hiredDate = hiredDate;
    }
}
