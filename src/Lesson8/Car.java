package Lesson8;

public class Car extends Vehicle {

    // CTRL + O - открытие окна с возможностью выбора генерации кода для переопределения или реализации методов.
    @Override
    void startEngin() {
        System.out.println("Car engin started");
    }

}
