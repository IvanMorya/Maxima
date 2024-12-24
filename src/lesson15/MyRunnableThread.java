package lesson15;

import lesson11.classobject.Person;

public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Выполняется поток: " + Thread.currentThread().getName());
    }
}
