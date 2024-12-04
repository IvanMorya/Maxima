package lesson10.customexeption;

public class CustomExceptionExample {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Возраст должен быть 18 или больше");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
