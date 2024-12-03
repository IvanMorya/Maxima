package lesson9.observer;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Observer alice = new Subscriber("Alice");
        Observer oleg = new Subscriber("Oleg");

        publisher.subscribe(alice);
        publisher.subscribe(oleg);


        alice.update("Some massage");
        oleg.update("Another massage.");
    }
}
