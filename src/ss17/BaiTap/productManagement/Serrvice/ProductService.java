package ss17.BaiTap.productManagement.Serrvice;

import ss17.BaiTap.productManagement.Model.Product;
import ss17.BaiTap.productManagement.Repo.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final ProductRepository repo = new ProductRepository();
    private List<Product> productList = repo.readFromFile();

    public void add(Product p) {
        productList.add(p);
        repo.writeToFile(productList);
    }

    public List<Product> getAll() {
        return productList;
    }

    public List<Product> searchById(String id) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getId().equalsIgnoreCase(id)) {
                result.add(p);
            }
        }
        return result;
    }

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

