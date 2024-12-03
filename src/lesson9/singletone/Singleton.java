package lesson9.singletone;

public final class Singleton {

    static Singleton singletonInstance;

    private Singleton() {}

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
