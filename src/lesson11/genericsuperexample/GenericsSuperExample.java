package lesson11.genericsuperexample;

import java.util.ArrayList;
import java.util.List;

public class GenericsSuperExample {

    public static void feedAnimals(List<? super Dog> animals) {
        animals.add(new Dog());
        animals.add(new Puppy());

        Object object = animals.get(0);
        System.out.println("Added animals " + object);

        Object object2 = animals.get(1);
        System.out.println("Added animals " + object2);
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        feedAnimals(animals);

        for (Object animal : animals) {
            ((Animal) animal).eat();
        }

    }
}
