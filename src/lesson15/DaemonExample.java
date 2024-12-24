package lesson15;

public class DaemonExample {
    public static void main(String[] args) {
        Thread deamonThread = new Thread(() -> {
            while (true) {
                System.out.println("Демон поток работает...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        deamonThread.setDaemon(true);
        deamonThread.start();

        System.out.println("Главный поток завершен.");
    }
}
