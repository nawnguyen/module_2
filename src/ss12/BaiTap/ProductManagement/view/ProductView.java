package ss12.BaiTap.ProductManagement.view;


import ss12.BaiTap.ProductManagement.model.Product;

import java.util.List;

public class ProductView {
    public void displayProduct(Product p) {
        System.out.println(p);
    }

    public void displayProductList(List<Product> products) {
        for (Product p : products) {
            displayProduct(p);
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}
