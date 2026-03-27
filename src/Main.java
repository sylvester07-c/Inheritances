public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 450, "Huge");
        doAnimalStuff(animal, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
    }

}