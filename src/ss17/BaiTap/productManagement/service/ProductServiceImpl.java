package ss17.BaiTap.productManagement.service;

import ss17.BaiTap.productManagement.model.Product;
import ss17.BaiTap.productManagement.repo.ProductRepository;
import ss17.BaiTap.productManagement.repo.ProductRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository repo = new ProductRepositoryImpl();
    private final List<Product> productList = repo.readFromFile();

    @Override
    public void add(Product product) {
        productList.add(product);
        repo.writeToFile(productList);
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public List<Product> searchById(String id) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getId().equalsIgnoreCase(id)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}
