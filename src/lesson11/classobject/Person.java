package lesson11.classobject;

import lesson10.dao.Product;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    private Product product;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person alice1 = new Person("Alice", 25);
        Person alice2 = new Person("Alice", 25);
        Person alice3 = alice2;

        Person andrew = new Person("Andrew", 30);

        Product product = new Product(1, "Name", 2);

    }
}
