package Lesson8;

public class Main {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.value = 10;

        modifyObject(myObject);
        System.out.println("Значение после вызова метода: " + myObject.value);
    }

    public static void modifyObject(MyObject object) {
        object = new MyObject();
        object.value = 20;
    }
}
