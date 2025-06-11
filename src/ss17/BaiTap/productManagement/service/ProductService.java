package ss17.BaiTap.productManagement.service;

import ss17.BaiTap.productManagement.model.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
    List<Product> searchById(String id);
    List<Product> searchByName(String name);
}
