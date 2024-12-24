package lesson15;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread1 = new MyThread();
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread myThread2 = new Thread(myRunnableThread);

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println("Поток: " + Thread.currentThread().getName() + " завершил работу.");
    }
}
