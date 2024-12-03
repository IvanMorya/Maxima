package lesson9.singletone;

import static lesson9.singletone.Singleton.getSingletonInstance;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = getSingletonInstance();
        System.out.println(singleton1);

        Singleton singleton2 = getSingletonInstance();
        System.out.println(singleton2);

    }
}
