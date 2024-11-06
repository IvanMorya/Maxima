package lesson3;

import java.util.Scanner;

// Программа с условными операторами для проверки возраста
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос возраста
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        // Проверка возраста
        if (age < 18) {
            System.out.println("Вы моложе 18 лет.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Вы старше 65 лет.");
        }
        
        scanner.close();
    }
}