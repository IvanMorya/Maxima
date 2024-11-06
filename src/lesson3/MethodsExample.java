package lesson3;


// Пример создания методов с реализацией логики в них
public class MethodsExample {
    public static void main(String[] args) {
        // здесь мы можем вызывать любой из 3 написанных ниже методов
    }

    public static void functionDoNothing() {
        int sum = 0;
        sum += 1;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int divide(int a, int b) {
        int result = a / b;
        return result;
    }
}
