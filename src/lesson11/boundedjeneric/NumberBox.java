package lesson11.boundedjeneric;

public class NumberBox<T extends Number> {

    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }


}
