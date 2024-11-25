package Lesson8;

public class Value {

    public static void main(String[] args) {
        int number = 10;
        int number2 = changeValue(number);
        System.out.println("Значение после вызова метода: " + number2);
    }

    public static int changeValue(int num) {
        int num2 = num;
        return num2;
    }
}
