package lesson14;

@FunctionalInterface
public interface Greeting {
    void sayHello();
    default void sayGoodby() {
        System.out.println("Hello");
    };
}
