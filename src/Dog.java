public class Dog extends Animal{

    private  String earShape;
    private String tailShape;

    public Dog() {
        super("mutt", 60, "big");

    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight, weight < 15 ? "small":(weight < 35 ? "medium": "large"));
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
