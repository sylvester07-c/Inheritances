public class Animal {

    protected String type;
    private double weight;
    private String size;

    public Animal(String type, double weight, String size)
    {
        this.type = type;
        this.weight = weight;
        this.size = size; //weight < 20 ? "small" : (weight > 50 ? "medium" : "large");

    }

//    public  Animal(){
//
//    }

    public  void move(String speed){
        System.out.println("Animal is moving, " + speed);
    }

    public void makeNoise() {
        System.out.println("Animal is making noise. ");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                '}';
    }
}
