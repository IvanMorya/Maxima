package lesson4;

public class Recursion {
    public static void main(String[] args) {
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = number; i >= 1; i--) {

            result = result * i;

        }
        return result;
    }

    public static long recursiveFactorial(int number) {
        if (number <= 1) return 1;
        return number * recursiveFactorial(number - 1);
    }

}
