package lesson3;

import java.util.Scanner;

// Программа для суммирования чисел от 1 до N с использованием цикла
public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос числа N
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Цикл для суммирования
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Вывод результата
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        
        scanner.close();
    }
}