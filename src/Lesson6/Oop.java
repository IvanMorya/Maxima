package Lesson6;

public class Oop {
    public static void main(String[] args) {
        Animal animal = new Animal("Животное");
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Barsik");

        animal.speak();
        dog.speak();

        Client client = new Client();
        client.setAnimal(cat);
        client.getAnimal().speak();
    }
}
