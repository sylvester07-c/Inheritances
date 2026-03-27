public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 450, "Huge");
        doAnimalStuff(animal, "slow");

        Worker worker = new Worker("Praise", "12-07-2004");
        System.out.println(worker.getAge());
//        worker.terminate();
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
    }



}