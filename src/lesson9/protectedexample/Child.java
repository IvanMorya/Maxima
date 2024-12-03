package lesson9.protectedexample;

import lesson9.Parent;

public class Child extends Parent {

    public void useProtected() {
        displayMessage();
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
