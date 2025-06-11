package ss17.BaiTap.productManagement.repo;

import ss17.BaiTap.productManagement.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final String file = "products.dat";

    @Override
    public List<Product> readFromFile() {
        File f = new File(file);
        if (!f.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    @Override
    public void writeToFile(List<Product> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
