package lesson3;

import java.util.Scanner;


// Программа с использованием конструкции switch для вывода названия дня недели по номеру
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос номера дня
        System.out.print("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();

        // Определение дня недели
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный номер дня недели.");
        }
        
        scanner.close();
    }
}