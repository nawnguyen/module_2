package ss12.BaiTap.ProductManagement.controller;


import ss12.BaiTap.ProductManagement.model.Product;
import ss12.BaiTap.ProductManagement.view.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();
    private ProductView view;

    public ProductController(ProductView view) {
        this.view = view;
    }

    public void addProduct(Product p) {
        products.add(p);
        view.showMessage("Thêm sản phẩm thành công.");
    }

    public void displayAll() {
        view.displayProductList(products);
    }

    public void deleteById(int id) {
        products.removeIf(p -> p.getId() == id);
        view.showMessage("Đã xoá sản phẩm có ID: " + id);
    }

    public void searchByName(String keyword) {
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                view.displayProduct(p);
            }
        }
    }

    public void sortByPriceAsc() {
        products.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
        view.showMessage("Đã sắp xếp tăng dần theo giá.");
    }
}
