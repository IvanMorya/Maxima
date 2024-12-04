package lesson10.dao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "products.txt";
        ProductFileDao productDao = new ProductFileDao(filePath);

        // Сохранение продуктов
//        productDao.saveProduct(new Product(1, "Apple", 1.2));
//        productDao.saveProduct(new Product(2, "Banana", 0.8));
//        productDao.saveProduct(new Product(3, "Cherry", 2.5));

        // Чтение всех продуктов
        List<Product> products = productDao.getAllProducts();
        System.out.println("Список продуктов:");
        for (Product product : products) {
            System.out.println(product.getId() + ": " + product.getName() + " - $" + product.getPrice());
            productDao.saveProduct(product);
        }
    }

}
