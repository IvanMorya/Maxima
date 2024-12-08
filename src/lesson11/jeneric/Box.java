package lesson11.jeneric;

public class Box<T> {

    private T value;

    public Object getObject() {
        return value;
    }

    public void setObject(T value) {
        this.value = value;
    }

}
