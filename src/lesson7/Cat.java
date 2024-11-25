package lesson7;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void someMethod() {
        System.out.println("Метод кота");
    }
}
