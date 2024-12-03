package lesson10;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
//        String filePath = "example.txt";
//
//        try (FileWriter writer = new FileWriter(filePath);
//             BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            writer.write("Привет, Java IO!");
//            writer.flush();
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка работы с файлом: " + e.getMessage());
//        }


        String sourceFile = "zyro-image-11.jpg";
        String destFile = "destination.jpg";

        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(destFile)) {
            byte[] buffer = new byte[8 * 1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.println(bytesRead);
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Копирование завершено.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
