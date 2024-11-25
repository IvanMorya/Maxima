package lesson7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = {dog, cat};

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog1 = (Dog) animal;
                dog1.someMethod();
            }
            else if (animal instanceof Cat) {
                Cat cat1 = (Cat) animal;
                cat1.someMethod();
            }
        }
    }
}
