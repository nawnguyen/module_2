package ss17.BaiTap.productManagement.repo;

import ss17.BaiTap.productManagement.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> readFromFile();
    void writeToFile(List<Product> list);
}
