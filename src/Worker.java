public class Worker {
    private String name;
    private  String birthDate;
    private String endDate;

    public Worker (String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        int dob = Integer.parseInt(birthDate);
        int age = 2026 - dob;

        return  age;
    }

    public double collectPay(){
        return  annualSalary;
    }
    public void terminate(String endDate){
        System.out.println("You job got terminated on, " + endDate);
    }
}
