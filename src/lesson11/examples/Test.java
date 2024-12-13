package lesson11.examples;

public class Test {
    public static void main(String[] args) {
        Schoolboy ivan = new Schoolboy("Ivan", 13);
        Schoolboy mariya = new Schoolboy("Mariya", 15);

        Student nikolay = new Student("Nikolay", 20);
        Student kseniya = new Student("Kseniya", 18);

        Employee andrey = new Employee("Andrey", 32);
        Employee mikhail = new Employee("Mikhail", 47);

        Team schoolboys = new Team("Schoolboys");

        Team students = new Team("Students");

        Team employees = new Team("Employees");

    }
}
