package lesson7;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    public void someMethod() {
        System.out.println("Метод собаки");
    }
}
