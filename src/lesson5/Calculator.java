package lesson5;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, int b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return a / b;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.divide(10, 2));
        System.out.println(calculator.divide(10, 0));
        System.out.println(calculator.divide(5, 2));
    }
}
