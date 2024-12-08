package lesson11.jeneric;

import lesson11.classobject.Person;
import lesson11.jeneric.Box;

import java.util.LinkedList;

public class GenericClassExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Person> box2 = new Box<>();
        String string = "Hello";
        Person person = new Person("Alice", 30);

        box1.setObject(string);
        box2.setObject(person);

        System.out.println(box1.getObject());
        System.out.println(box2.getObject());


        LinkedList<String> list = new LinkedList<>();

    }
}
