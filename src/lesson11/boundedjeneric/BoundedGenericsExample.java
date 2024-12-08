package lesson11.boundedjeneric;

public class BoundedGenericsExample {

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(10);
        System.out.println(intBox.doubleValue());

        NumberBox<Double> numberNumberBox = new NumberBox<>(15.5);
        System.out.println(numberNumberBox.doubleValue());
    }
}
