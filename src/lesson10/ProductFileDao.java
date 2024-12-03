package lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ProductFileDao {
    private final String filePath;

    public ProductFileDao(String filePath) {
        this.filePath = filePath;
    }

    public void saveProduct(Product product) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(product.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка сохранения продукта: " + e.getMessage());
        }
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                products.add(Product.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения продуктов: " + e.getMessage());
        }
        return products;
    }
}