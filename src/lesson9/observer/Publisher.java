package lesson9.observer;

public class Publisher {
    private Observer[] observers = new Observer[10];

    public void subscribe(Observer observer) {
        observers[0] = observer;
    }

    public void unsubscribe() {

    }

    public void notifyObservers() {

    }
}
