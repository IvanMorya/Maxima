package lesson5;

public class Persson {

    private String name;
    private int age;

    private int account;

    public Persson() {
    }

    // Alt + Ins или правая кнопка мыши

    public Persson(String name, int age, int account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public Persson(String name) {
        this.name = name;
    }

    public Persson(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public Persson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Привет, меня зовут " + name);
    }

    @Override
    public String toString() {
        return "Persson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }
}
