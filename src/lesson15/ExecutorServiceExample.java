package lesson15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < array.length; i++) {
            int index = i;
            executorService.submit(() -> {
               array[index] *= 2;
                System.out.println("Элемент " + index + " обработан потоком " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            System.out.println("Ждем executorService...");
        }

        System.out.println("Результат:");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
