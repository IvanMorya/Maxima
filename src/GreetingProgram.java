import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос имени
        System.out.println("Введи ваше имя: ...");
        String name = scanner.nextLine();

        // Запрос возраста
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();

        // Вывод сообщения
        System.out.println("Ваше имя - " + name + ", а ваш возраст " + age + " лет");

        scanner.close();

    }
}
