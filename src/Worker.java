public class Worker {
    private String name;
    private  String birthDate;
    private String endDate;

    public Worker (String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
//        this.endDate = endDate;
    }

    public Worker () {

    }

    public int getAge(){
        int currentYear = 2026;
        int dob = Integer.parseInt(birthDate.substring(6));


        int age = currentYear - dob;

        return  age;
    }

    public double collectPay(){
        double pay = 0000;
        return  pay;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("You job got terminated on, " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
