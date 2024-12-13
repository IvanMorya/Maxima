package lesson11.genericsuperexample;

import java.util.ArrayList;
import java.util.List;

public class GenericsSuperExample {

    public static void feedAnimals(List<? super Dog> animals) {
        animals.add(new Dog());
    }

    public static void main(String[] args) {
        List<Dog> animals = new ArrayList<>();
        feedAnimals(animals);
    }
}
